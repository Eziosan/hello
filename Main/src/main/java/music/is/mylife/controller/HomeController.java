package music.is.mylife.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		return "home";
	}
	
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test() {
		System.out.println("이루삐가 수정한 내용ㄴ");
		System.out.println("이루삐 충돌대장");
		System.out.println("이루삐 충돌대장");
		System.out.println("이루삐 충돌대장");
		
		return "test";
	}
	
	
	@RequestMapping(value = "user/login", method = RequestMethod.GET)
	public String login() {
		
		return "user/loginPage";
	}

	
}
