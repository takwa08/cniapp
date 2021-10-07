package repo;

import org.springframework.stereotype.Repository;

import entity.Societe;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
@Repository
public interface SocieteRepo extends JpaRepository<Societe,Long>{
@Modifying
@Query(value="delete from Societe m where m.societe_id=:societe_id")
public void deleteSociete(@Param("societe_id")Long societe_id);


@Query(value="select new Societe(s.societe_id,s.nomSociete,s.nomSoc_ar,s.adresseSoc,s.numTel_Soc,s.site_Soc,s.ministere) from Societe s where s.ministere.nomMinistere=:nomMinistere")
public List<Societe> findByidMin(@Param("nomMinistere")String nomMinistere);

}
