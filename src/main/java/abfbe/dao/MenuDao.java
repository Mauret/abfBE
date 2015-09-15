package abfbe.dao;

import abfbe.domain.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

/**
 * Date: 27/08/15
 *
 * @author mauret
 */
@Repository
@RepositoryRestResource
public interface MenuDao extends CrudRepository<Menu, Long> {
}
