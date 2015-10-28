package duyhn.mvc.com.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import duyhn.mvc.com.Models.Contact;
import duyhn.mvc.com.Models.Role;
import duyhn.mvc.com.Models.User;
import duyhn.mvc.com.Models.UserRole;
import duyhn.mvc.com.Models.UserRolePk;
import duyhn.mvc.com.Services.ContactService;
import duyhn.mvc.com.Services.RoleService;
import duyhn.mvc.com.Services.UserRoleService;
import duyhn.mvc.com.Services.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	ContactService contactService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRoleService userRoleService;
	
	@Autowired
	RoleService roleService;
	
	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String formCreateContact(Model model){
		model.addAttribute("contact", new Contact());
		return "contact-create";
	}
	
	@RequestMapping(value = "/contact",method = RequestMethod.POST)
	public String CreateContact(Model model, @ModelAttribute("contact") Contact contact){
		contact.setUser(getUser());
		contact = contactService.insertContact(contact);
		model.addAttribute("contact", contact);
		return "contact-create";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String formRegister(Model model){
		
		model.addAttribute("user", new User());
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(Model model, @ModelAttribute("user") User user){
		user = userService.inserUser(user);
		Role role = roleService.findById(1); 
		
		UserRolePk userRolePk = new UserRolePk();
		userRolePk.setRole(role);
		userRolePk.setUser(user);
		
		UserRole userRole = new UserRole();
		userRole.setUserRolePk(userRolePk);
		
		userRoleService.inserUserRole(userRole);
		return "register";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	public User getUser(){
		return userService.findById(1);
	}
}
