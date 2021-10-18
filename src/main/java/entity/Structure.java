package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Structure {
	@Id
	private Integer Structure_id;
	private String nomStructure;
	private String nomARStructure;
	private String adresseStruct;
	private int numTel_Struct;
	private String site_Struct;
	private String emailStruct;
	public Structure(Integer structure_id, String nomStructure, String nomARStructure, String adresseStruct,
			int numTel_Struct, String site_Struct, String emailStruct, Structure parentStruct) {
		super();
		Structure_id = structure_id;
		this.nomStructure = nomStructure;
		this.nomARStructure = nomARStructure;
		this.adresseStruct = adresseStruct;
		this.numTel_Struct = numTel_Struct;
		this.site_Struct = site_Struct;
		this.emailStruct = emailStruct;
		this.parentStruct = parentStruct;
	}
	
	
	public Structure getParentStruct() {
		return parentStruct;
	}
	public void setParentStruct(Structure parentStruct) {
		this.parentStruct = parentStruct;
	}


	@ManyToOne
	@JoinColumn(name="parent_Id")
	private Structure parentStruct;
	public Integer getStructure_id() {
		return Structure_id;
	}
	public void setStructure_id(Integer structure_id) {
		Structure_id = structure_id;
	}
	public String getNomStructure() {
		return nomStructure;
	}
	public void setNomStructure(String nomStructure) {
		this.nomStructure = nomStructure;
	}
	public String getNomARStructure() {
		return nomARStructure;
	}
	public void setNomARStructure(String nomARStructure) {
		this.nomARStructure = nomARStructure;
	}
	public String getAdresseStruct() {
		return adresseStruct;
	}
	public void setAdresseStruct(String adresseStruct) {
		this.adresseStruct = adresseStruct;
	}
	public int getNumTel_Struct() {
		return numTel_Struct;
	}
	public void setNumTel_Struct(int numTel_Struct) {
		this.numTel_Struct = numTel_Struct;
	}
	public String getSite_Struct() {
		return site_Struct;
	}
	public void setSite_Struct(String site_Struct) {
		this.site_Struct = site_Struct;
	}
	public String getEmailStruct() {
		return emailStruct;
	}
	public void setEmailStruct(String emailStruct) {
		this.emailStruct = emailStruct;
	}
	public Structure(Integer structure_id, String nomStructure, String nomARStructure, String adresseStruct,
			int numTel_Struct, String site_Struct, String emailStruct) {
		super();
		Structure_id = structure_id;
		this.nomStructure = nomStructure;
		this.nomARStructure = nomARStructure;
		this.adresseStruct = adresseStruct;
		this.numTel_Struct = numTel_Struct;
		this.site_Struct = site_Struct;
		this.emailStruct = emailStruct;
	}
	
	public Structure() {
		super();
	}
	@Override
	public String toString() {
		return "Structure [Structure_id=" + Structure_id + ", nomStructure=" + nomStructure + ", nomARStructure="
				+ nomARStructure + ", adresseStruct=" + adresseStruct + ", numTel_Struct=" + numTel_Struct
				+ ", site_Struct=" + site_Struct + ", emailStruct=" + emailStruct + ", parentStruct=" + parentStruct
				+ "]";
	}
	
}
