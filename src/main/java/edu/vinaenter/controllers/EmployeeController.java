package edu.vinaenter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.vinaenter.models.Employee;

@Controller
public class EmployeeController {

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String addEmployee(Model model) {
		model.addAttribute("employee", new Employee(1, "Nguyen Van Dinh"));
		return "add-employee";
	}

	@PostMapping("/addEmployee")
	public String doAddEmployee(@ModelAttribute Employee employee, Model model) {
		employee.setName(employee.getName().toUpperCase());
		model.addAttribute("employee", employee);
		return "view-employee";
	}

}
