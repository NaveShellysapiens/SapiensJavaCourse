package com.sapiens.Springdemo.daoSupport.Person;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Repository
public class PersonDaoImpl implements Dao<Person> {
    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public void save(Person person) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Person load(long id) {
        EntityManager em = emf.createEntityManager();
        Person person = em.find(Person.class, id);
        em.close();
        return person;
    }

    @Override
    public void delete(long id) {
        EntityManager em = emf.createEntityManager();
        Person person = em.find(Person.class, id);
        em.getTransaction().begin();
        em.remove(person);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void update(Person person) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(person);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Person> loadAll() {
        EntityManager em = emf.createEntityManager();
        List<Person> personList = em.createQuery("select t from Person t").getResultList();
        em.close();
        return personList;
    }
}