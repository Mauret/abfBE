package abfbe.dtos.helpers;

import abfbe.domain.Company;
import abfbe.dtos.CompanyDto;
import org.springframework.beans.BeanUtils;

/**
 * Created by mauret on 07/08/15.
 */
public class CompanyDtoHelper {
    public static CompanyDto getDto(Company company) {
        final CompanyDto companyDto = new CompanyDto(company.getId(), company.getName(), company.getAddress(),
                company.getZipcode(), company.getCity(), company.getPhone(), company.getEmail());
        return companyDto;
    }
}
