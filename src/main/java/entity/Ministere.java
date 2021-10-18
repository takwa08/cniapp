package entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ministere {
	
@Id
private Integer Ministere_id;
private String nomMinistere;
private String nomMin_ar;
private String adresseMin;
private int numTel_Min;
private String site_Min;
private String emailMin;
private Integer minId;
//@ManyToOne
//@JoinColumn(name="Ministere_id",insertable = false, updatable = false)
//private Ministere ministere;
public String getEmailMin() {
	return emailMin;
}

public Ministere(Integer ministere_id, String nomMinistere, String nomMin_ar, String adresseMin, int numTel_Min,
		String site_Min, String emailMin, Integer minId) {
	super();
	Ministere_id = ministere_id;
	this.nomMinistere = nomMinistere;
	this.nomMin_ar = nomMin_ar;
	this.adresseMin = adresseMin;
	this.numTel_Min = numTel_Min;
	this.site_Min = site_Min;
	this.emailMin = emailMin;
	this.minId = minId;
}

public Integer getMinId() {
	return minId;
}

public void setMinId(Integer minId) {
	this.minId = minId;
}

public void setEmailMin(String emailMin) {
	this.emailMin = emailMin;
}

public Ministere(Integer ministere_id, String nomMinistere, String nomMin_ar, String adresseMin, int numTel_Min,
		String site_Min, String emailMin) {
	super();
	Ministere_id = ministere_id;
	this.nomMinistere = nomMinistere;
	this.nomMin_ar = nomMin_ar;
	this.adresseMin = adresseMin;
	this.numTel_Min = numTel_Min;
	this.site_Min = site_Min;
	this.emailMin = emailMin;
}

public Ministere(Integer ministere_id, String nomMinistere, String nomMin_ar, String adresseMin, int numTel_Min,
		String site_Min) {
	super();
	Ministere_id = ministere_id;
	this.nomMinistere = nomMinistere;
	this.nomMin_ar = nomMin_ar;
	this.adresseMin = adresseMin;
	this.numTel_Min = numTel_Min;
	this.site_Min = site_Min;
}

public Integer getMinistere_id() {
	return Ministere_id;
}

public void setMinistere_id(Integer ministere_id) {
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

public Ministere(Integer id, String nomMinistere) {
	super();
	this.Ministere_id = id;
	this.nomMinistere = nomMinistere;
}

public Ministere() {
	super();
}
public Integer getId() {
	return Ministere_id;
}
public void setId(Integer id) {
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
			+ ", adresseMin=" + adresseMin + ", numTel_Min=" + numTel_Min + ", site_Min=" + site_Min + ", emailMin="
			+ emailMin + ", minId=" + minId + "]";
}


}
