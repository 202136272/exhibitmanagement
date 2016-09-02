package exhibitmanagement.repository;

import exhibitmanagement.domain.InvestigatingOfficer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Bonga on 8/14/2016.
 */
@Repository
public interface InvestigatingOfficerRepository extends CrudRepository<InvestigatingOfficer,Long> {
}
