package abfbe.dao;

import abfbe.domain.Company;
import abfbe.utils.UrlMap;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Created by mauret on 02/08/15.
 *
 * Class for accessing to the company table in the database.
 */
@Repository
@RepositoryRestResource
public interface CompanyDao extends PagingAndSortingRepository<Company, Long> {
}
