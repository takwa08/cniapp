package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="groups")
public class Group implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idGrp;
	
	private String NomGroup;
	
	public Group()
	{
		
	}

	public Group(Long id, String nomGroup) {
		super();
		this.idGrp = id;
		NomGroup = nomGroup;
	}


	public String getNomGroup() {
		return NomGroup;
	}

	public void setNomGroup(String nomGroup) {
		NomGroup = nomGroup;
	}

	public Long getIdGrp() {
		return idGrp;
	}

	public void setIdGrp(Long idGrp) {
		this.idGrp = idGrp;
	}

	@Override
	public String toString() {
		return "Group [idGrp=" + idGrp + ", NomGroup=" + NomGroup + ", getNomGroup()=" + getNomGroup() + ", getIdGrp()="
				+ getIdGrp() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
