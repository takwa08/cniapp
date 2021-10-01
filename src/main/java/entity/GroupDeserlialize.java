package entity;

import java.io.IOException;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.LongNode;

public class GroupDeserlialize extends StdDeserializer<Employe> {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4016618073645601793L;
	public GroupDeserlialize()
	{
		this(null);
	}
	public GroupDeserlialize(Class<Employe> vc)
	{
		super(vc);
	}
	@Override
	public Employe deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		// TODO Auto-generated method stub

        JsonNode node = p.getCodec().readTree(p);
        int matricule = (Integer) node.get("matricule").intValue();
        String nom= (String) node.get("nom").textValue();
        String prenom= (String) node.get("prenom").textValue();
        String nom_ar= (String) node.get("nom_ar").textValue();
        String prenom_ar= (String) node.get("prenom_ar").textValue();
        int age = (Integer) node.get("age").intValue();
        String description= (String) node.get("description").textValue();
        String email= (String) node.get("email").textValue();
        String adresse= (String) node.get("adresse").textValue();
        String ville= (String) node.get("ville").textValue();
        int codeP = (Integer) node.get("codeP").intValue();
        int numTele = (Integer) node.get("numTele").intValue();
      //  Long idGrp = (Long) ((LongNode) node.get("idGrp")).numberValue();
     
      
      Long idGrp = (Long) node.get("idGrp").numberValue();
     //    String nomGroup =  (String)  node.get("nomGroup").asText();   
      // Group g=  new Group((long) 0,"");
         System.out.println(idGrp);
return new Employe( matricule,  nom,  prenom,  nom_ar,  prenom_ar,  age, description,  email,  codeP,  numTele,  adresse,  ville,new Group( idGrp,null));

        

	}
	
	

	
	
}
