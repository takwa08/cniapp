package entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ministere {
	
@Id
private Long Ministere_id;
private String nomMinistere;
private String nomMin_ar;
private String adresseMin;
private int numTel_Min;
private String site_Min;

public Ministere(Long ministere_id, String nomMinistere, String nomMin_ar, String adresseMin, int numTel_Min,
		String site_Min) {
	super();
	Ministere_id = ministere_id;
	this.nomMinistere = nomMinistere;
	this.nomMin_ar = nomMin_ar;
	this.adresseMin = adresseMin;
	this.numTel_Min = numTel_Min;
	this.site_Min = site_Min;
}

public Long getMinistere_id() {
	return Ministere_id;
}

public void setMinistere_id(Long ministere_id) {
	Ministere_id = ministere_id;
}

public String getNomMin_ar() {
	return nomMin_ar;
}

public void setNomMin_ar(String nomMin_ar) {
	this.nomMin_ar = nomMin_ar;
}

public String getAdresseMin() {
	return adresseMin;
}

public void setAdresseMin(String adresseMin) {
	this.adresseMin = adresseMin;
}

public int getNumTel_Min() {
	return numTel_Min;
}

public void setNumTel_Min(int numTel_Min) {
	this.numTel_Min = numTel_Min;
}

public String getSite_Min() {
	return site_Min;
}

public void setSite_Min(String site_Min) {
	this.site_Min = site_Min;
}

public Ministere(Long id, String nomMinistere) {
	super();
	this.Ministere_id = id;
	this.nomMinistere = nomMinistere;
}

public Ministere() {
	super();
}
public Long getId() {
	return Ministere_id;
}
public void setId(Long id) {
	this.Ministere_id = id;
}
public String getNomMinistere() {
	return nomMinistere;
}
public void setNomMinistere(String nomMinistere) {
	this.nomMinistere = nomMinistere;
}
@Override
public String toString() {
	return "Ministere [Ministere_id=" + Ministere_id + ", nomMinistere=" + nomMinistere + ", nomMin_ar=" + nomMin_ar
			+ ", adresseMin=" + adresseMin + ", numTel_Min=" + numTel_Min + ", site_Min=" + site_Min + "]";
}


}
