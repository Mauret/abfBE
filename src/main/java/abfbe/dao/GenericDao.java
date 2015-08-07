package abfbe.dao;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by mauret on 07/08/15.
 */
@NoRepositoryBean
public interface GenericDao<T> extends PagingAndSortingRepository<T, Long> {
}
