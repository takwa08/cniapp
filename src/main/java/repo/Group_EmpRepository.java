package repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import entity.Employe;
import entity.Group;
import entity.Group_Emp;
@Repository
public interface Group_EmpRepository extends JpaRepository<Group_Emp, Long> {

	
	@Query(value="select DISTINCT new Group_Emp (p.idAffect,p.employees,p.group) from Group_Emp p where p.group.idGrp=:idGRp")
	public List<Group_Emp> getAllemployees(@Param("idGRp")Long idGRp);

	
	
}
