package com.sapiens.Springdemo.daoSupport.Employee;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements Dao<Employee> {
    @PersistenceUnit
    private EntityManagerFactory emf;

    @Override
    public void save(Employee emp) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
        em.close();
    }


    @Override
    public Employee load(int id) {
        EntityManager em = emf.createEntityManager();
        Employee emp = em.find(Employee.class, id);
        em.close();
        return emp;
    }

    @Override
    public void delete(int id) {
        EntityManager em = emf.createEntityManager();
        Employee emp = em.find(Employee.class, id);
        em.getTransaction().begin();
        em.remove(emp);
        em.getTransaction().commit();
        em.close();

    }

    @Override
    public void update(Employee emp) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(emp);
        em.getTransaction().commit();
        em.close();

    }

    @Override
    public List<Employee> loadAll() {
        EntityManager em = emf.createEntityManager();
        List<Employee> employeeList = em.createQuery("select t from Employee t").getResultList();
        em.close();
        return employeeList;
    }
}
