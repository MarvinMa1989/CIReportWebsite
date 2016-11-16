package Control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import Model.User;

@Controller
public class queryUser {

	@RequestMapping(value="/user/{userid}")
	public String GetUser(@PathVariable("userid") long userID, ModelMap model)
	{
	      
	       User u = new User();
	       u.setUserID(userID);
	       u.setUserName("zhaoyang");
	       model.addAttribute("User", u);
	      
	       return "user";
	}
}

