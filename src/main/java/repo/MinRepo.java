package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import entity.Ministere;

@Repository
public interface MinRepo extends JpaRepository<Ministere,Long>{
	@Modifying
	@Query(value="delete from Ministere m where m.nomMinistere=:nomMinistere")
	public void deleteMin(@Param("nomMinistere") String ministere);
}
