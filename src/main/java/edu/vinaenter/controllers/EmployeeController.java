package edu.vinaenter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.vinaenter.models.Employee;

@Controller
public class EmployeeController {

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String addEmployee(Model model) {
		model.addAttribute("employee", new Employee());
		return "add-employee";
	}

	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
	public String doAddEmployee(@ModelAttribute("employee") Employee employee, ModelMap modelMap) {
		employee.setName(employee.getName().toUpperCase());
		modelMap.addAttribute("employee", employee);
		return "view-employee";
	}

}
