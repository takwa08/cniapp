package entity;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="groups")
public class Group{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idGrp;
	
	private String NomGroup;
	// @ManyToMany(cascade = {CascadeType.REFRESH},fetch=FetchType.EAGER, targetEntity = Employe.class)
	//private Set<Employe> employee;
	public Long getIdGrp() {
		return idGrp;
	}
	public void setIdGrp(Long idGrp) {
		this.idGrp = idGrp;
	}
	public String getNomGroup() {
		return NomGroup;
	}
	public void setNomGroup(String nomGroup) {
		NomGroup = nomGroup;
	}

	public Group() {
		super();
	}
	public Group(Long idGrp, String nomGroup) {
		super();
		this.idGrp = idGrp;
		NomGroup = nomGroup;
	}
	@Override
	public String toString() {
		return "Group [idGrp=" + idGrp + ", NomGroup=" + NomGroup +  "]";
	}

}
