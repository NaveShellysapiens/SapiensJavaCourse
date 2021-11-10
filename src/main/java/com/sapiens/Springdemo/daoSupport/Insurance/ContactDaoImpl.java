package com.sapiens.Springdemo.daoSupport.Insurance;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Repository
public class ContactDaoImpl implements Dao<Contact> {
    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public void save(Contact con) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(con);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Contact load(int id) {
        EntityManager em = emf.createEntityManager();
        Contact con = em.find(Contact.class, id);
        em.close();
        return con;
    }

    @Override
    public void delete(int id) {
        EntityManager em = emf.createEntityManager();
        Contact con = em.find(Contact.class, id);
        em.getTransaction().begin();
        em.remove(con);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void update(Contact con) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(con);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Contact> loadAll() {
        EntityManager em = emf.createEntityManager();
        List<Contact> contactsList = em.createQuery("select t from Contact t").getResultList();
        em.close();
        return contactsList;
    }
}
