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
import entity.Ministere;
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
	public ResponseEntity<Ministere>AddMini(@RequestBody Ministere min){
		Ministere m=this.ServMin.saveMin(min);
		return new ResponseEntity<Ministere>(m,HttpStatus.OK);
	}
	@CrossOrigin(origins = "http://localhost:4200")	
	@GetMapping("/Structure")
	public  ResponseEntity<List<Ministere>>getAllMin()
	{
		List<Ministere> Minis= this.ServMin.getMin();
		return new ResponseEntity<>(Minis,HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/editStructure")
	public ResponseEntity<Ministere>EditMin(@RequestBody Ministere m)
	{
		Ministere min=this.ServMin.editMin(m);
		return new ResponseEntity<Ministere>(min,HttpStatus.CREATED);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/delete/{nomMin}")
	public ResponseEntity<Ministere>DeleteMinistere(@PathVariable("nomMin") String m)
	{	this.ServMin.deleteMinis(m);
		return new ResponseEntity<Ministere>(HttpStatus.OK);
	}
}
