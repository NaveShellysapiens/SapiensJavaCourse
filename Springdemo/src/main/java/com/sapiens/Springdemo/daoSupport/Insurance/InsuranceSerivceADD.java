package com.sapiens.Springdemo.daoSupport.Insurance;

import com.sapiens.Springdemo.daoSupport.Insurance.Contact;
import com.sapiens.Springdemo.daoSupport.Insurance.InsuranceDetails;
import com.sapiens.Springdemo.daoSupport.Insurance.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceSerivceADD {
    @Autowired
    private Dao<Address> dao;
    public void saveInsurance(Address add) {
        try {
            dao.save(add);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public List<Address> getAllAddress() {
        try {
            return dao.loadAll();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Address getAddressById(int id) {
        try {
            return dao.load(id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteAddress(int id) {
        try {
            dao.delete(id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public void updateAddress(Address add) {
        try {
            dao.update(add);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }
}
