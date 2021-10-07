package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Exception.userNotfoundException;
import entity.Employe;
import entity.Group;
import repo.EmpRepository;

@Service
public class ServiceEmp {
	
private final EmpRepository EmpR;

@Autowired
public ServiceEmp(EmpRepository EmpR)
{this.EmpR=EmpR;}

public List<Employe>getAllEmploye()
{
	return this.EmpR.findAll();
}


public Employe addEmp(Employe e)
{
//System.out.println(e.toString());
	return this.EmpR.save(e);

}



public Employe findEmployeByMatricule(Integer matricule) 
{
	Optional<Employe> optional =this.EmpR.findEmployeByMatricule(matricule);
	Employe employee = null;
	if (optional.isPresent()) {
		employee = optional.get();
	} else {
		throw new RuntimeException(" Employee not found for id :: " + matricule);
	}
	return employee;
}		


@Transactional
public void deleteEmploye(Integer matricule)

{
	
 this.EmpR.deleteEmployeByMatricule(matricule);

}

public Employe updateEmploye(Employe ep)
{

	return this.EmpR.save(ep);
}
@Transactional
public List<Employe>findByIdS(String l)
{
	return this.EmpR.findByidSociete(l);
	
}


}



