package abfbe.dao;

import abfbe.domain.CheckPoint;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Date: 14/09/15
 *
 * @author mauret
 */
@Repository
@RepositoryRestResource
public interface CheckPointDao extends CrudRepository<CheckPoint, Long> {
}
