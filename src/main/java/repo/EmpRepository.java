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

@Repository
public interface EmpRepository extends JpaRepository<Employe,Long> {
	@Modifying
	@Query(value="delete from Employe e where e.matricule=:matricule")
	void deleteEmployeByMatricule(@Param("matricule") Integer matricule);
	Employe findByMatricule(Integer mat);
	
	Optional<Employe> findEmployeByMatricule(Integer matricule);
	
	
	@Query(value="select new Employe(e.matricule,e.nom,e.prenom,e.nom_ar,e.prenom_ar,e.age,e.description,e.email,e.codeP,e.numTele,e.adresse,e.ville,e.struct) from Employe e where e.nom like %?1%" + " OR e.prenom LIKE %?1%"
            + " OR e.struct.nomStructure LIKE %?1%"+ " OR e.nom_ar LIKE %?1%"+ " OR e.prenom_ar LIKE %?1%")
	public List<Employe> find(String nom);

}
