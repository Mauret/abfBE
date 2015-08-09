package abfbe.dao;

import abfbe.domain.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mauret on 02/08/15.
 *
 * Class for accessing to the company table in the database.
 */
@Repository
public interface CompanyDao extends PagingAndSortingRepository<Company, Long> {
}
