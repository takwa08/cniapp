package controller;
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
import org.springframework.stereotype.Controller;
import entity.Structure;
import service.ServiceMinistere;

@Controller 
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MinController {

	private final ServiceMinistere ServMin;
	public MinController(ServiceMinistere serv)
	{
		this.ServMin=serv;
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addStructure")
	public ResponseEntity<Structure>AddMini(@RequestBody Structure min){
		Structure m=this.ServMin.saveMin(min);
		return new ResponseEntity<>(m,HttpStatus.OK);
	}
	@CrossOrigin(origins = "http://localhost:4200")	
	@GetMapping("/Structure")
	public  ResponseEntity<List<Structure>>getAllMin()
	{
		List<Structure> Minis= this.ServMin.getMin();
		return new ResponseEntity<>(Minis,HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/editStructure")
	public ResponseEntity<Structure>EditMin(@RequestBody Structure m)
	{
		Structure min=this.ServMin.editMin(m);
		return new ResponseEntity<>(min,HttpStatus.CREATED);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/delete/{Structure_id}")
	public ResponseEntity<Structure>DeleteMinistere(@PathVariable("Structure_id") Integer m)
	{	this.ServMin.deleteMinis(m);
		return new ResponseEntity<Structure>(HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("findMin/{Structure_id}")
	public ResponseEntity<Structure>FindMini(@PathVariable("Structure_id") Integer m)
	{	Structure ministere =this.ServMin.findMinistere(m);
		return new ResponseEntity<>(ministere,HttpStatus.CREATED);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("findP/{Structure_id}")
	public ResponseEntity<Structure>FindParent(@PathVariable("Structure_id") Integer m)
	{	Structure ministere =this.ServMin.findParent(m);
		return new ResponseEntity<>(ministere,HttpStatus.CREATED);
	}
	
}
