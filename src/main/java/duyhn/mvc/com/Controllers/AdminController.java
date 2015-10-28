package duyhn.mvc.com.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

	@RequestMapping(method = RequestMethod.GET)
	public String homeAdmin(){
		return "admin-index";
	}
}
