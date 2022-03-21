package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Admin;
import entity.Employe;
import service.ServiceAd;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {
	private final ServiceAd ServiceAd;
	public AuthController(ServiceAd ServiceAd)
	{
		this.ServiceAd=ServiceAd;
		
	}
    @PostMapping("/loginiiiiiii")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Admin> loginUser(@RequestBody Admin pa) {
        String adminname = pa.getUsername();
        
        String adminPass = pa.getPassword();
        Admin objpa = null;
        if(adminname != null && adminPass != null){
           objpa = this.ServiceAd.findByEmailandPasswordAdmin(adminname, adminPass);
        //   objpa.toString();
 
            if(objpa == null){
            	  return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
            }
        }
        return new ResponseEntity<Admin>(objpa,HttpStatus.CREATED);
       
    }
    
    @CrossOrigin(origins = "http:/localhost:4200")
    @PostMapping("adminAdd")
    public ResponseEntity<Admin> addEmp(@RequestBody Admin ep)
    {
    	Admin p=this.ServiceAd.savead(ep);
    	return new ResponseEntity<>(p, HttpStatus.CREATED);
    }
}