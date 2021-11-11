package com.sapiens.Springdemo.daoSupport.Insurance;

import com.sapiens.Springdemo.daoSupport.Insurance.Contact;
import com.sapiens.Springdemo.daoSupport.Insurance.InsuranceDetails;
import com.sapiens.Springdemo.daoSupport.Insurance.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceSerivce {
    @Autowired
    private Dao<Contact> dao;
    public void saveInsurance(Contact con) {
        try {
            dao.save(con);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public List<Contact> getAllContacts() {
        try {
            return dao.loadAll();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Contact getContactById(int id) {
        try {
            return dao.load(id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteContact(int id) {
        try {
            dao.delete(id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public void updateContact(Contact con) {
        try {
            dao.update(con);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }
}
