package com.sapiens.springmvc.EmployeeCompanyContact.service;
import com.sapiens.springmvc.EmployeeCompanyContact.models.CompanyDetails;

import java.util.List;

public interface CompanyDetailsService {
    List<CompanyDetails> findAll();
}
