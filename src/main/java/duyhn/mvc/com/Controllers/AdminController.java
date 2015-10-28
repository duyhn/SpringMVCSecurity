package duyhn.mvc.com.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import duyhn.mvc.com.Models.User;
import duyhn.mvc.com.Services.UserService;


@Controller
@RequestMapping(value = "/admin")
public class AdminController {

	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String homeAdmin(){
		return "admin-index";
	}
	
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ResponseEntity<String> getListUser(){
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json; charset=utf-8");
		List<User> users = userService.findAll();
		return new ResponseEntity<String>(User.toJsonArray(users),headers,HttpStatus.OK);
	}
}
