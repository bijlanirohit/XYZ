package com.demo.project.xyz.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "EMP")
public class EmployeeEntity {
	
	@Id
	@Column(name = "id")
	private String id;
	
	@OneToOne
	@PrimaryKeyJoinColumn(name = "id")
	private EmployeeHREntity empHREntity;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
            name="EMP_PROJECT",
            joinColumns = @JoinColumn(name="emp_id"),
            inverseJoinColumns = @JoinColumn(name="project_id"))
	private List<ProjectEntity> projects;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public EmployeeHREntity getEmpHREntity() {
		return empHREntity;
	}

	public void setEmpHREntity(EmployeeHREntity empHREntity) {
		this.empHREntity = empHREntity;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<ProjectEntity> getProjects() {
		return projects;
	}

	public void setProjects(List<ProjectEntity> projects) {
		this.projects = projects;
	}
	
}
