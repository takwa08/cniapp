package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Exception.GroupNotFoundException;
import Exception.userNotfoundException;
import entity.Group;
import repo.GrpRepository;

@Service
public class ServiceGrp {
private final GrpRepository GrpRepository;
@Autowired
public ServiceGrp(GrpRepository jr)
{
	
this.GrpRepository=jr;
}


public Group addGrp(Group p)
{
	List<Group> s=this.getAllGrp();
for(int i=0;i<s.size();i++)
{
	if(s.get(i).getNomGroup().equalsIgnoreCase(p.getNomGroup()))
	{
		return null;
	}
	
}
return	this.GrpRepository.save(p);
	//}
	
	//else throw new RuntimeException();
	
}

public List<Group> getAllGrp(){
return this.GrpRepository.findAll();}


public Group findGrroupById(Long idGrp)
{
	return this.GrpRepository.findGroupByidGrp(idGrp).
			orElseThrow(()->new GroupNotFoundException("le groupe de matricule"+idGrp+" existe pas"));
}
public Group updateGroup(Group p)
{
	
return this.GrpRepository.save(p);
}


@Transactional
public void deleteGroupe(String nom)
{
	this.GrpRepository.deleteGroupByNomGroupe(nom);
}

}