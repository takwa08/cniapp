package controller;

import java.util.List;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import entity.Employe;
import service.ServiceEmp;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmpController {
	
private final ServiceEmp servEmp;
public EmpController(ServiceEmp serv)
{this.servEmp=serv;
}
@CrossOrigin(origins = "http://localhost:4200")
@GetMapping("/person")
public ResponseEntity<List<Employe>> getAllEmp()
{
	List <Employe>Ep=this.servEmp.getAllEmploye();
return new ResponseEntity<>(Ep,HttpStatus.OK);

}

@CrossOrigin(origins = "http://localhost:4200")
@GetMapping("edit/{matricule}")
public ResponseEntity<Employe> getEmployeByMatricule(@PathVariable("matricule") Integer matricule)
{	Employe E=this.servEmp.findEmployeByMatricule(matricule);
	return new ResponseEntity<>(E,HttpStatus.OK);}


@CrossOrigin(origins = "http://localhost:4200")
@PostMapping("addEmp")
public ResponseEntity<Employe> addEmp(@RequestBody Employe ep)
{
	Employe p=this.servEmp.addEmp(ep);
	return new ResponseEntity<>(p, HttpStatus.CREATED);
}
@CrossOrigin(origins = "http://localhost:4200")
@DeleteMapping("deleteEmp/{matricule}")
public  ResponseEntity<Employe> deleteEmp(@PathVariable("matricule") Integer matricule)

{	servEmp.deleteEmploye(matricule);
return new ResponseEntity<>(HttpStatus.OK);
}
@CrossOrigin(origins = "http://localhost:4200")
@PutMapping("edit")
public ResponseEntity<Employe> updateEmp(@RequestBody Employe e)
{
	Employe p=this.servEmp.updateEmploye(e);
	return new ResponseEntity<>(p, HttpStatus.CREATED);
}

@CrossOrigin(origins = "http://localhost:4200")
@GetMapping("filtrer/{idl}")
public ResponseEntity<List<Employe>> FindEmployees(@PathVariable("idl") String nomSociete)
{	List<Employe> E=this.servEmp.find(nomSociete);
	return new ResponseEntity<>(E,HttpStatus.OK);}
}