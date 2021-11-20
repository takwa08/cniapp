package service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.Employe;
import entity.Structure;
import repo.MinRepo ;

@Service
public class ServiceMinistere {
	private final MinRepo MinRepo;
	@Autowired
public ServiceMinistere(MinRepo structRepo)
{
	this.MinRepo=structRepo;
}
	
	public Structure saveMin(Structure s)
	{
		return this.MinRepo.save(s);
	}
	
	public List<Structure> getMin()
	{
		return this.MinRepo.findAll();
	}
	
	public Structure editMin(Structure s)
	{
		return this.MinRepo.save(s);
	}
	@Transactional
	public void deleteMinis(Integer m)
	{
		this.MinRepo.deleteMin(m);
	}
	
	public Structure findMinistere(Integer Structure_id)
	{
		Optional<Structure> optional =this.MinRepo.findMinistereByMinistere_id(Structure_id);
		Structure ministere = null;
		if (optional.isPresent()) {
			ministere = optional.get();
		} else {
			throw new RuntimeException(" Ministere not found for id :: " + Structure_id);
		}
		return ministere;
	}	
	public Structure findParent(Integer Structure_id)
	{
		Optional<Structure> optional =this.MinRepo.findParentStructByID(Structure_id);
		Structure ministere = null;
		if (optional.isPresent()) {
			ministere = optional.get();
		} else {
			throw new RuntimeException(" parent not found for id :: " + Structure_id);
		}
		return ministere;
	}	
}
