package entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;




@Entity
public class Group_Emp {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long idAffect;

@ManyToOne 	(cascade = {CascadeType.REMOVE})
private Employe employees;
//(cascade=CascadeType.ALL)
@ManyToOne	
private Group group;
public Long getIdAffect() {
	return idAffect;
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}

public void setIdAffect(Long idAffect) {
	this.idAffect = idAffect;
}
public Employe getEmployees() {
	return employees;
}
public void setEmployees(Employe employees) {
	this.employees = employees;
}
public Group getGroup() {
	return group;
}
public void setGroup(Group group) {
	this.group = group;
}
public Group_Emp(Long idAffect, Employe employees, Group group) {
	super();
	this.idAffect = idAffect;
	this.employees = employees;
	this.group = group;
}
@Override
public String toString() {
	return "Group_Emp [idAffect=" + idAffect + ", employees=" + employees.getClass() + ", group=" + group.getClass() + "]";
}
public Group_Emp() {
}

}
