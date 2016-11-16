package Control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestControl {
	@RequestMapping("/text")
    public @ResponseBody String getText() {
        return "hello, world! This come from text!";
    }
	
	@RequestMapping("/jsp")
	public String getJSP( Model model)
	{
		model.addAttribute("message", "hello, world111! This come from jsp!");
		return "view/hello.jsp";
	}
	
	@RequestMapping("/html")
	public String getHtml( Model model)
	{
		return "html/hello.html";
	}
	
}
