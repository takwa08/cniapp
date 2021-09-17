package repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import entity.Group;
@Repository
public interface GrpRepository extends JpaRepository<Group, Long> {
	@Modifying
	@Query(value="delete from Group p where p.NomGroup=:NomGroup")
	void deleteGroupByNomGroupe(@Param("NomGroup") String nomGroup);
//	Employe findByidGrp(Long mat);
	Optional<Group> findGroupByidGrp(Long id);
}
