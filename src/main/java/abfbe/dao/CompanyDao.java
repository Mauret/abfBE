package abfbe.dao;

import abfbe.entities.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mauret on 02/08/15.
 *
 * Class for accessing to the company table in the database.
 */
@Repository
public interface CompanyDao extends CrudRepository<Company, Long> {
}
