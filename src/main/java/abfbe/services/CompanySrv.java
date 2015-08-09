package abfbe.services;

import abfbe.dao.CompanyDao;
import abfbe.domain.Company;
import abfbe.dtos.CompanyDto;
import abfbe.dtos.helpers.CompanyDtoHelper;
import abfbe.utils.Props;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauret on 07/08/15.
 */
@Service
public class CompanySrv {
    private final CompanyDao companyDao;

    @Autowired
    public CompanySrv(final CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    public Page<CompanyDto> getCompanies(final int page) {
//        NOTE: pages start from 0
        Page<Company> companies = companyDao.findAll(new PageRequest(page - 1, Props.MAX_ITEMS_PER_PAGE, new
                Sort
                ("name")));
        final List<CompanyDto> companyDtos = new ArrayList<>();
        for (final Company company : companies) {
            companyDtos.add(CompanyDtoHelper.getDto(company));
        }
        return new PageImpl<>(companyDtos, null, companies.getTotalElements());
    }
}
