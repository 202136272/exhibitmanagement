package exhibitmanagement.repository;
import exhibitmanagement.domain.Exhibit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Bonga on 8/13/2016.
 */
@Repository
public interface ExhibitRepository extends CrudRepository<Exhibit,Long> {
}
