package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Entity
//@JsonDeserialize(using = GroupDeserlialize.class)
public class Employe  implements Serializable {
	 @Id
	 private Integer matricule;
	// @GeneratedValue( generator = "myid")
	// @GenericGenerator(name = "myid", strategy = "entity.MyGenerator")
	 private String	nom;	
	 private String   prenom ;
	 private String  nom_ar;
	 private String prenom_ar;	 
	 private int age;
	 private String description;
	 private String email;
	 private int codeP;
	 private int numTele;
	 private String adresse;
	 private String  ville;
	 @JoinColumn(name="Structure_id")
	 //(cascade = {CascadeType.ALL},fetch=FetchType.EAGER)
	 @ManyToOne	
	 private Structure struct;
	public Integer getMatricule() {
		return matricule;
	}
	public void setMatricule(Integer matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom_ar() {
		return nom_ar;
	}
	public void setNom_ar(String nom_ar) {
		this.nom_ar = nom_ar;
	}
	public String getPrenom_ar() {
		return prenom_ar;
	}
	public void setPrenom_ar(String prenom_ar) {
		this.prenom_ar = prenom_ar;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCodeP() {
		return codeP;
	}
	public void setCodeP(int codeP) {
		this.codeP = codeP;
	}
	public int getNumTele() {
		return numTele;
	}
	public void setNumTele(int numTele) {
		this.numTele = numTele;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public Structure getStruct() {
		return struct;
	}
	public void setStruct(Structure struct) {
		this.struct = struct;
	}
	public Employe(Integer matricule, String nom, String prenom, String nom_ar, String prenom_ar, int age,
			String description, String email, int codeP, int numTele, String adresse, String ville, Structure struct) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.nom_ar = nom_ar;
		this.prenom_ar = prenom_ar;
		this.age = age;
		this.description = description;
		this.email = email;
		this.codeP = codeP;
		this.numTele = numTele;
		this.adresse = adresse;
		this.ville = ville;
		this.struct = struct;
	}
	@Override
	public String toString() {
		return "Employe [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", nom_ar=" + nom_ar
				+ ", prenom_ar=" + prenom_ar + ", age=" + age + ", description=" + description + ", email=" + email
				+ ", codeP=" + codeP + ", numTele=" + numTele + ", adresse=" + adresse + ", ville=" + ville
				+ ", struct=" + struct + "]";
	}
	public Employe() {
		super();
	}

	
	
}
