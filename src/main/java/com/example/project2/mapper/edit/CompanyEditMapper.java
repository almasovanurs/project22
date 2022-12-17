package com.example.project2.mapper.edit;

import com.example.project2.dto.request.CompanyRequest;
import com.example.project2.model.Company;
import org.springframework.stereotype.Component;

@Component
public class CompanyEditMapper {
    public Company create(CompanyRequest companyRequest) {
        if (companyRequest == null) {
            return null;
        }

        Company company = new Company();
        company.setCompanyName(companyRequest.getCompanyName());
        company.setLocatedCountry(companyRequest.getLocatedCountry());
        return company;
    }

    public void update(Company company, CompanyRequest companyRequest) {
        company.setCompanyName(companyRequest.getCompanyName());
        company.setLocatedCountry(companyRequest.getLocatedCountry());

    }
}



