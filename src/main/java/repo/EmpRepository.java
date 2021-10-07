package repo;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import entity.Employe;
import entity.Societe;

@Repository
public interface EmpRepository extends JpaRepository<Employe,Long> {
	@Modifying
	@Query(value="delete from Employe e where e.matricule=:matricule")
	void deleteEmployeByMatricule(@Param("matricule") Integer matricule);
	Employe findByMatricule(Integer mat);
	
	Optional<Employe> findEmployeByMatricule(Integer matricule);
	
	
	@Query(value="select new Employe(e.matricule,e.nom,e.prenom,e.nom_ar,e.prenom_ar,e.age,e.description,e.email,e.codeP,e.numTele,e.adresse,e.ville,e.group,e.societe) from Employe e where e.societe.nomSociete=:nomSociete")
	public List<Employe> findByidSociete(@Param("nomSociete")String nomSociete);

}
