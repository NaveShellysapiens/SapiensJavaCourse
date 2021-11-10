package com.sapiens.Springdemo.daoSupport.Insurance;

import com.sapiens.Springdemo.daoSupport.Insurance.Contact;
import com.sapiens.Springdemo.daoSupport.Insurance.InsuranceDetails;
import com.sapiens.Springdemo.daoSupport.Insurance.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceSerivceID {
    @Autowired
    private Dao<InsuranceDetails> dao;
    public void saveInsurance(InsuranceDetails IDD) {
        try {
            dao.save(IDD);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public List<InsuranceDetails> getAllInsuranceDetails() {
        try {
            return dao.loadAll();
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public InsuranceDetails getInsuranceDetailsById(int id) {
        try {
            return dao.load(id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteInsuranceDetails(int id) {
        try {
            dao.delete(id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    public void updateInsuranceDetails(InsuranceDetails DD) {
        try {
            dao.update(DD);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }
}
