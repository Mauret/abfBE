package abfbe.dao;

import abfbe.domain.DomainObject;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by mauret on 07/08/15.
 */
public interface GenericDao<T extends DomainObject> {
}
