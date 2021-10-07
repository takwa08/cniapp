package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.Ministere;

import repo.MinRepo ;

@Service
public class ServiceMinistere {
	private final MinRepo MinRepo;
	@Autowired
public ServiceMinistere(MinRepo structRepo)
{
	this.MinRepo=structRepo;
}
	
	public Ministere saveMin(Ministere s)
	{
		return this.MinRepo.save(s);
	}
	
	public List<Ministere> getMin()
	{
		return this.MinRepo.findAll();
	}
	
	public Ministere editMin(Ministere s)
	{
		return this.MinRepo.save(s);
	}
	@Transactional
	public void deleteMinis(String m)
	{
		this.MinRepo.deleteMin(m);
	}
}
