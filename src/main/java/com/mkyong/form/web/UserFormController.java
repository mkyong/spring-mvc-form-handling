/*package com.mkyong.form.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mkyong.form.model.User;
import com.mkyong.form.service.UserService;

@Controller
public class UserFormController {

	private final Logger logger = LoggerFactory.getLogger(UserFormController.class);

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	@RequestMapping(value = "/users/{id}/update", method = RequestMethod.GET)
	public String showUpdateUserForm(@PathVariable("id") int id, Model model) {

		logger.debug("showUpdateUserForm() : {}", id);

		User user = userService.findById(id);
		
		model.addAttribute("userFormModel", user);
		model.addAttribute("title", "Update User");
		model.addAttribute("action", "Update");
		
		return "user/userform";

	}
	
	@RequestMapping(value = "/users/add", method = RequestMethod.GET)
	public String showAddUserForm(Model model) {

		logger.debug("showAddUserForm()");

		User user = new User();
		
		//set default value
		user.setName("mkyong");
		user.setEmail("test@gmail.com");
		user.setAddress("abc 88");
		user.setNewsletter(true);
		user.setSex("M");
		user.setFramework(new ArrayList<String>(Arrays.asList("Spring MVC", "GWT")));
		user.setSkill(new ArrayList<String>(Arrays.asList("Spring", "Grails")));
		user.setCountry("SG");
		user.setNumber(2);
		
		model.addAttribute("userFormModel", user);
		model.addAttribute("title", "Add User");
		model.addAttribute("action", "Add");
		
		return "user/userform";

	}

	// like jUnit @BeforeMethod, run before every @RequestMapping in this @Controller
	@ModelAttribute
	public void populateAllDropDown(Model model) {

		logger.debug("populateAllDropDown()");

		List<String> frameworksList = new ArrayList<String>();
		frameworksList.add("Spring MVC");
		frameworksList.add("Struts 2");
		frameworksList.add("JSF 2");
		frameworksList.add("GWT");
		frameworksList.add("Play");
		frameworksList.add("Apache Wicket");
		model.addAttribute("frameworkList", frameworksList);
	
		Map<String,String> skill = new LinkedHashMap<String,String>();
		skill.put("Hibernate", "Hibernate");
		skill.put("Spring", "Spring");
		skill.put("Struts", "Struts");
		skill.put("Groovy", "Groovy");
		skill.put("Grails", "Grails");
		model.addAttribute("javaSkillList", skill);
		
	}

	@ModelAttribute("numberList")
	public List<Integer> populateNumberList() {

		logger.debug("populateNumberDropDown()");

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		return numbers;

	}
	
	@ModelAttribute("countryList")
	public Map<String,String> populateCountryList() {

		Map<String,String> country = new LinkedHashMap<String,String>();
		country.put("US", "United Stated");
		country.put("CN", "China");
		country.put("SG", "Singapore");
		country.put("MY", "Malaysia");
		return country;

	}
	
}*/