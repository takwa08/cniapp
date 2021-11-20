package repo;

import java.util.Optional;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import entity.Structure;

@Repository
public interface MinRepo extends JpaRepository<Structure,Integer>{
	@Modifying
	@Query(value="delete from Structure m where m.Structure_id=:Structure_id")
	public void deleteMin(@Param("Structure_id") Integer Structure_id);
	
	
	@Query(value="select new Structure(e.Structure_id, e.nomStructure, e.nomARStructure, e.adresseStruct,e.numTel_Struct,e.site_Struct,e.emailStruct) from Structure e where e.Structure_id=:Structure_id")
	Optional<Structure> findMinistereByMinistere_id(@Param("Structure_id") Integer Structure_id);

@Query(value="select p.parentStruct from Structure p where p.Structure_id=:Structure_id")
Optional<Structure> findParentStructByID(@Param("Structure_id") Integer Structure_id);
}
