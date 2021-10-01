package repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Long> {
//Optional<Admin> findByUsername(String username);
	//@Modifying
	//@Query(value="select username,password from Admin a where a.username=:username and a.password=:password")
	public Admin findByUsernameAndPassword(String username,String Password);
}
