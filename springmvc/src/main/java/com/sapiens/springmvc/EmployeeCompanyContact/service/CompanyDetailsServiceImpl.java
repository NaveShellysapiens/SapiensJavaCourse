package com.sapiens.springmvc.EmployeeCompanyContact.service;

import com.sapiens.springmvc.EmployeeCompanyContact.models.CompanyDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CompanyDetailsServiceImpl implements CompanyDetailsService{
    @Override
    public List<CompanyDetails> findAll() {
        ArrayList<CompanyDetails> CDs = new ArrayList<CompanyDetails>();

        CDs.add(new CompanyDetails("comp1","desc1"));
        CDs.add(new CompanyDetails("comp2","desc2"));
        CDs.add(new CompanyDetails("comp2","desc2"));
        CDs.add(new CompanyDetails("comp2","desc2"));
        CDs.add(new CompanyDetails("comp2","desc2"));

        return CDs;
    }
}
