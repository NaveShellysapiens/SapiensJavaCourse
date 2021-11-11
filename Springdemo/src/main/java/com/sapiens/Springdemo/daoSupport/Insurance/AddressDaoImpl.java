package com.sapiens.Springdemo.daoSupport.Insurance;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Repository
public class AddressDaoImpl implements Dao<Address>{
    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public void save(Address add) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(add);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Address load(int id) {
        EntityManager em = emf.createEntityManager();
        Address add = em.find(Address.class, id);
        em.close();
        return add;
    }

    @Override
    public void delete(int id) {
        EntityManager em = emf.createEntityManager();
        Address add = em.find(Address.class, id);
        em.getTransaction().begin();
        em.remove(add);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void update(Address add) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(add);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Address> loadAll() {
        EntityManager em = emf.createEntityManager();
        List<Address> AddressList = em.createQuery("select t from Address t").getResultList();
        em.close();
        return AddressList;
    }
}
