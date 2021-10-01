package service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Admin;
import repo.AdminRepo;
import repo.EmpRepository;
@Service
public class ServiceAd {
	private final AdminRepo adminRepo;

	@Autowired
	public ServiceAd( AdminRepo adminRepo )
	{this.adminRepo=adminRepo;}
	
	public Admin findByEmailandPasswordAdmin(String e,String p)
	{	String res=cryptWithMD5(p);
		return this.adminRepo.findByUsernameAndPassword(e, res);
		
	}
	
	public Admin savead(Admin ad)
	{String b = cryptWithMD5(ad.getPassword());

	      ad.setPassword(b);
	      	return this.adminRepo.save(ad);
	}
	
	
	 public static String cryptWithMD5(String pass){
		 MessageDigest md;
		    try {
		        md = MessageDigest.getInstance("MD5");
		        byte[] passBytes = pass.getBytes();
		        md.reset();
		        byte[] digested = md.digest(passBytes);
		        StringBuffer sb = new StringBuffer();
		        for(int i=0;i<digested.length;i++){
		            sb.append(Integer.toHexString(0xff & digested[i]));
		        }
		        return sb.toString();
		    } catch (NoSuchAlgorithmException ex) {
		    	System.out.println(ex.getMessage());
		    }
		        return null;


		   }

}