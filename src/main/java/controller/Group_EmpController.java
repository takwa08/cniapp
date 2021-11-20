package controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Employe;
import entity.Group_Emp;
import service.ServiceAd;
import service.serviceGroup_Emp;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Group_EmpController {
	private final serviceGroup_Emp serviceGroup_Emp;
	public Group_EmpController(serviceGroup_Emp serviceGroup_Emp)
	{
		this.serviceGroup_Emp =serviceGroup_Emp;
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addGrp_emp")
	public ResponseEntity<Group_Emp> addd(@RequestBody Group_Emp p)
	{
		Group_Emp e=this.serviceGroup_Emp.addGrp(p);
	 
	return new ResponseEntity<Group_Emp>(e,HttpStatus.CREATED);

	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getGrpEmp")
	public ResponseEntity<List<Group_Emp>> getAllEmp()
	{
	List <Group_Emp>Ep=this.serviceGroup_Emp.getAllGrp();
	return new ResponseEntity<>(Ep,HttpStatus.OK);

	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/getEmp/{id}")
	public ResponseEntity<List<Group_Emp>> getEmp(@PathVariable("id") Long idCGrp)
	{
		List <Group_Emp>Ep=this.serviceGroup_Emp.getAllemp(idCGrp);
	return new ResponseEntity<>(Ep,HttpStatus.OK);

	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/deleteEmpInGrp/{idCGrp}")
	public ResponseEntity <Group_Emp> deleteEmpInGrp(@PathVariable("idCGrp") Integer idCGrp)
	{
		this.serviceGroup_Emp.deleteEmpFromGroupe(idCGrp);
	return new ResponseEntity<>(HttpStatus.OK);

	}
}
