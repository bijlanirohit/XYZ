package com.demo.project.xyz.dto;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDTO {
	private String id;
	private String firstName;
	private String lastName;
	private Integer age;
	private LocalDate doj;
	private Integer salary;
	private String department;
	private List<ProjectDTO> projects;
	
	public EmployeeDTO() {
		
	}
	
	public EmployeeDTO(String id, String firstName, String lastName, Integer age, LocalDate doj, Integer salary,
			String department, List<ProjectDTO> projects) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.doj = doj;
		this.salary = salary;
		this.department = department;
		this.projects = projects;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public List<ProjectDTO> getProjects() {
		return projects;
	}

	public void setProjects(List<ProjectDTO> projects) {
		this.projects = projects;
	}
	
}
