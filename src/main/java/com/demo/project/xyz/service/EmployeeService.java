package com.demo.project.xyz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.demo.project.xyz.dto.EmployeeDTO;
import com.demo.project.xyz.dto.ProjectDTO;
import com.demo.project.xyz.entity.EmployeeEntity;
import com.demo.project.xyz.entity.ProjectEntity;
import com.demo.project.xyz.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	/** 
	 * This method is used to return the employee details along with project. 
	 * @param page This is the first parameter to determine page
	 * @return List of EmployeeDTO 
	 */
	public List<EmployeeDTO> getEmployeeDetails(Integer pageNo){
		PageRequest pageRequest = PageRequest.of(0, pageNo);
		List<EmployeeDTO> employeeDTOs = new ArrayList<EmployeeDTO>();
		// Calling the find All method defined in JPA using Employee Repository
		Page<EmployeeEntity> page = employeeRepository.findAll(pageRequest);
		List<EmployeeEntity> employeeEntities = page.getContent();
		// Populating the List of Employee DTO if there is any data in db
		if(employeeEntities!=null && employeeEntities.size()>0) {
			for (EmployeeEntity empEnt : employeeEntities) {
				List<ProjectDTO> projects = new ArrayList<ProjectDTO>();
				if(empEnt.getProjects()!= null && empEnt.getProjects().size()>0){
					for (ProjectEntity projEnt : empEnt.getProjects()) {
						projects.add(new ProjectDTO(projEnt.getId(), projEnt.getName()));
					}
				}
				employeeDTOs.add(new EmployeeDTO(empEnt.getId(), empEnt.getFirstName(), empEnt.getLastName(), empEnt.getEmpHREntity().getAge(), 
						empEnt.getEmpHREntity().getDoj(), empEnt.getEmpHREntity().getSalary(), empEnt.getEmpHREntity().getDepartment(),projects));
			}
		}
		return employeeDTOs;
	}
	
}
