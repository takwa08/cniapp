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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import entity.Employe;
import entity.Societe;
import service.ServiceSociete;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class SocieteController {
private final ServiceSociete serviceSociete;
public SocieteController(ServiceSociete serviceSociete)
{
	this.serviceSociete = serviceSociete;
	
}
@CrossOrigin(origins = "http://localhost:4200")
@GetMapping("GetSociete")
public ResponseEntity<List<Societe>>getAllS()
{
List<Societe>L=this.serviceSociete.getAllSociete();
 return new ResponseEntity<>(L,HttpStatus.OK);
}

@CrossOrigin(origins = "http://localhost:4200")
@PostMapping("addSociete")
public ResponseEntity<Societe> addSoc(@RequestBody Societe s)
{
	Societe p=this.serviceSociete.addSociete(s);
	return new ResponseEntity<>(p, HttpStatus.CREATED);
}


@CrossOrigin(origins = "http://localhost:4200")
@DeleteMapping("DeleteSociete/{id}")
public ResponseEntity<Societe> deleteS(@PathVariable("id") Long  s)
{
		this.serviceSociete.deleteSoc(s);;
	return new ResponseEntity<>( HttpStatus.OK);
}
@CrossOrigin(origins = "http://localhost:4200")
@PutMapping("editSociete/{idSociete}")
public ResponseEntity<Societe> EditSoc (@PathVariable("idSociete") Societe s)
{
	Societe p=this.serviceSociete.updateSociete(s);
	return new ResponseEntity<>(p, HttpStatus.CREATED);
}
@CrossOrigin(origins = "http://localhost:4200")
@GetMapping("find/{nomMinistere}")
public ResponseEntity<List<Societe>>getA(@PathVariable("nomMinistere") String n)
{
List<Societe> s=this.serviceSociete.findByIdMinistere(n);
 return new ResponseEntity<>(s,HttpStatus.OK);
}
}
