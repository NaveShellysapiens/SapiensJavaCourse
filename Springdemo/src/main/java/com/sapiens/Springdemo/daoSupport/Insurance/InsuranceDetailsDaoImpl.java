package com.sapiens.Springdemo.daoSupport.Insurance;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Repository
public class InsuranceDetailsDaoImpl implements Dao<InsuranceDetails>{
    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public void save(InsuranceDetails add) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(add);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public InsuranceDetails load(int id) {
        EntityManager em = emf.createEntityManager();
        InsuranceDetails DI = em.find(InsuranceDetails.class, id);
        em.close();
        return DI;
    }

    @Override
    public void delete(int id) {
        EntityManager em = emf.createEntityManager();
        InsuranceDetails DI = em.find(InsuranceDetails.class, id);
        em.getTransaction().begin();
        em.remove(DI);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void update(InsuranceDetails DI) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(DI);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<InsuranceDetails> loadAll() {
        EntityManager em = emf.createEntityManager();
        List<InsuranceDetails> InsuranceDetailsList = em.createQuery("select t from InsuranceDetails t").getResultList();
        em.close();
        return InsuranceDetailsList;
    }
}
