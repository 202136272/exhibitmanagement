package exhibitmanagement.repository;

import exhibitmanagement.domain.Biology;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Bonga on 8/13/2016.
 */
@Repository
public interface BiologyRepository extends CrudRepository<Biology,Long> {
}
