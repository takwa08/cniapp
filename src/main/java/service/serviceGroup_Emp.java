package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Group;
import entity.Group_Emp;
import repo.Group_EmpRepository;
import repo.MinRepo;

@Service
public class serviceGroup_Emp {
	private final Group_EmpRepository group_EmpRepository;
	@Autowired
	public serviceGroup_Emp(Group_EmpRepository group_EmpRepository)
	{
		this.group_EmpRepository = group_EmpRepository;
		
	}
	
	public Group_Emp addGrp(Group_Emp p)
	{
		List<Group_Emp> s=this.getAllGrp();
		
	return	this.group_EmpRepository.save(p);
		}
	
	
	public List<Group_Emp> getAllGrp(){
		return this.group_EmpRepository.findAll();}
	
	
	
	public List<Group_Emp> getAllemp(Long id){
		return this.group_EmpRepository.getAllemployees(id);}

	
	
}
