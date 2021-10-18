package controller;

import java.nio.file.Path;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import entity.Employe;
import entity.Group;
import service.ServiceGrp;

@RestController

public class GrpController {
private final ServiceGrp ServiceGrp;
public GrpController(ServiceGrp servGr)
{
	this.ServiceGrp=servGr;
	
}
@CrossOrigin(origins = "http://localhost:4200")
@GetMapping("group")
public ResponseEntity<List<Group>>findAllGrp()
{
	List <Group> p=this.ServiceGrp.getAllGrp();
	return new ResponseEntity<>(p,HttpStatus.OK);
}


@CrossOrigin(origins = "http://localhost:4200")
@PostMapping("add")
public ResponseEntity<Group> add(@RequestBody Group ep)
{
	Group p=this.ServiceGrp.addGrp(ep);
	return new ResponseEntity<Group>(p, HttpStatus.CREATED);
}

@CrossOrigin(origins = "http://localhost:4200")
@PostMapping("addGrp")
public ResponseEntity<Group> addEmp(@RequestBody Group ep)
{
	Group p=this.ServiceGrp.addGrp(ep);
	return new ResponseEntity<Group>(p, HttpStatus.CREATED);
}
@CrossOrigin(origins = "http://localhost:4200")
@GetMapping("findByID/{id}")
public ResponseEntity<Group> findGroup(@PathVariable Long id)
{
	Group p=this.ServiceGrp.findGrroupById(id);
	return new ResponseEntity<>(p,HttpStatus.OK);
}

@CrossOrigin(origins = "http://localhost:4200")
@PutMapping("editGrp")
public ResponseEntity<Group>  EditGroupe(@RequestBody Group bod)
{
	Group p=this.ServiceGrp.updateGroup(bod);
	return new ResponseEntity<>(p, HttpStatus.CREATED);
}

@CrossOrigin(origins = "http://localhost:4200")
@DeleteMapping("deleteGrp/{nom}")
public  ResponseEntity<Employe> deleteEmp(@PathVariable("nom") String nom)

{	this.ServiceGrp.deleteGroupe(nom);
	return new ResponseEntity<>(HttpStatus.OK);
}


}


