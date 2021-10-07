package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.Societe;
import repo.SocieteRepo;

@Service
public class ServiceSociete  {

	
	private final SocieteRepo societeRepo;
	@Autowired
	public ServiceSociete(SocieteRepo societeRepo)
	{
		this.societeRepo=societeRepo;	}
	
	public List<Societe>getAllSociete()
	{
		
		return this.societeRepo.findAll();
	}
	
	
	public Societe addSociete(Societe s)
	{
		return this.societeRepo.save(s);
	}
	
	public Societe updateSociete(Societe s)
	{
		return this.societeRepo.save(s);
	}
	@Transactional
	public void deleteSoc(Long s)
	{
		 this.societeRepo.deleteSociete(s);
	}
	
	@Transactional
	public List<Societe> findByIdMinistere(String l)
	{
		return this.societeRepo.findByidMin(l);
	}
	
}
