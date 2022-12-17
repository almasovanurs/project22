package com.example.project2.service;

import com.example.project2.dto.request.CompanyRequest;
import com.example.project2.dto.response.CompanyResponse;
import com.example.project2.model.Company;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompany();

    CompanyResponse saveCompany(CompanyRequest companyRequest);

    CompanyResponse updateCompany(Long id, CompanyRequest companyRequest);

    CompanyResponse getCompanyById(Long id);

    void deleteCompanyById(Long id);
}
