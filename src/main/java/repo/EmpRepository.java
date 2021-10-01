package repo;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import entity.Employe;

@Repository
public interface EmpRepository extends JpaRepository<Employe,Long> {
	@Modifying
	@Query(value="delete from Employe e where e.matricule=:matricule")
	void deleteEmployeByMatricule(@Param("matricule") Integer matricule);
	Employe findByMatricule(Integer mat);
	
	Optional<Employe> findEmployeByMatricule(Integer matricule);

}
