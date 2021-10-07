package entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Societe {
@Id
private Long societe_id;
private String nomSociete;
private String nomSoc_ar;
private String adresseSoc;
private int numTel_Soc;
private String site_Soc;
@JoinColumn(name="Ministere_id")
@ManyToOne(targetEntity = Ministere.class,cascade=CascadeType.ALL)
private Ministere ministere;


public Long getSociete_id() {
	return societe_id;
}


public void setSociete_id(Long societe_id) {
	this.societe_id = societe_id;
}


public String getNomSoc_ar() {
	return nomSoc_ar;
}


public void setNomSoc_ar(String nomSoc_ar) {
	this.nomSoc_ar = nomSoc_ar;
}
public String getAdresseSoc() {
	return adresseSoc;
}
public void setAdresseSoc(String adresseSoc) {
	this.adresseSoc = adresseSoc;
}
public int getNumTel_Soc() {
	return numTel_Soc;
}
public void setNumTel_Soc(int numTel_Soc) {
	this.numTel_Soc = numTel_Soc;
}


public String getSite_Soc() {
	return site_Soc;
}


public void setSite_Soc(String site_Soc) {
	this.site_Soc = site_Soc;
}


public Societe(Long id, String nomSociete, Ministere ministere) {
	super();
	this.societe_id = id;
	this.nomSociete = nomSociete;
	this.ministere = ministere;
	
}


public Societe() {
	super();
}
@Override
public String toString() {
	return "Societe [id=" + societe_id + ", nomSociete=" + nomSociete + ", ministere=" + ministere + "]";
}
public Long getId() {
	return societe_id;
}
public void setId(Long id) {
	this.societe_id = id;
}
public String getNomSociete() {
	return nomSociete;
}
public Societe(Long societe_id, String nomSociete, String nomSoc_ar, String adresseSoc, int numTel_Soc, String site_Soc,
		Ministere ministere) {
	super();
	this.societe_id = societe_id;
	this.nomSociete = nomSociete;
	this.nomSoc_ar = nomSoc_ar;
	this.adresseSoc = adresseSoc;
	this.numTel_Soc = numTel_Soc;
	this.site_Soc = site_Soc;
	this.ministere = ministere;}


public void setNomSociete(String nomSociete) {
	this.nomSociete = nomSociete;}


public Ministere getMinistere() {
	return ministere;
}

public void setMinistere(Ministere ministere) {
	this.ministere = ministere;
}}
