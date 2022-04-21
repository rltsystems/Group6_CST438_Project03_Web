package Group6_CST438_Project03_Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@SpringBootApplication
public class Group6Cst438Project03WebApplication {

	@Autowired
	UserRepository userRepository;
	@Autowired
	ItemRepository itemRepository;

	/**
	 * Landing page (When someone is not logged in)
	 */
	@RequestMapping("/")
//    @ResponseBody
	String home() {
		return "home";
	}

	@RequestMapping("/login")
	String login() {
		return "login";
	}

	@RequestMapping("/signUp")
	String signUp() {
		return "signUp";
	}

	@GetMapping("/editProfile")
	String editProfile(@RequestParam(defaultValue = "0") Integer id, Model model) {
		if(userRepository.findById(id).isEmpty()){
			return "home";
		}
		User user = userRepository.findById(id).get();
		model.addAttribute("user", user);
		return "editProfile";
	}

	/** Redirects errors back to home*/
	@GetMapping("/error")
	String error() {
		return "home";
	}

	public static void main(String[] args) {
		SpringApplication.run(Group6Cst438Project03WebApplication.class, args);
	}

}
