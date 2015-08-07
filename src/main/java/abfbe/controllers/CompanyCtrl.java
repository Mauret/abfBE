package abfbe.controllers;

import abfbe.domain.Company;
import abfbe.dtos.CompanyDto;
import abfbe.services.CompanySrv;
import abfbe.utils.Props;
import abfbe.utils.UrlMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mauret on 07/08/15.
 * <p>
 * Controller for {@link Company} data.
 */
@RestController
public class CompanyCtrl {
    private CompanySrv companySrv;

    @Autowired
    public CompanyCtrl(final CompanySrv companySrv) {
        this.companySrv = companySrv;
    }

    @RequestMapping(value = UrlMap.COMPANY_LIST, method = RequestMethod.GET, produces = Props
            .APPLICATION_JSON_UTF8)
    @ResponseStatus(HttpStatus.OK)
    public Page<CompanyDto> getCompanies(@RequestParam(value = "p", required = false, defaultValue = "1")
                                             final int page) {
        return companySrv.getCompanies(page);
    }
}
