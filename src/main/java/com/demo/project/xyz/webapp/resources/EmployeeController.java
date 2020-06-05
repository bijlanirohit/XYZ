package com.demo.project.xyz.webapp.resources;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.demo.project.xyz.dto.EmployeeDTO;
import com.demo.project.xyz.service.EmployeeService;



@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	/** 
	 * This method is used to return the employee details along with project. 
	 * @param page This is the first parameter to determine page
	 * @return Response Entity having list of EmployeeDTO
	 */
	@GetMapping("/")
	public ModelAndView getEmployeeData(HttpSession session, HttpServletRequest request){
		ModelAndView model = new ModelAndView("home");
		Integer pageNo = 3;
		if(session.getAttribute("pageNo")!=null) {
			pageNo = (Integer) session.getAttribute("pageNo");
			session.setAttribute("pageNo", pageNo+3);
		}
		else {
			session.setAttribute("pageNo", 3);
		}
		List<EmployeeDTO> employeeDTOs = empService.getEmployeeDetails(pageNo);
		model.addObject("lists", employeeDTOs);
		return model;
	}
}
