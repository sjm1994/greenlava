package kr.kro.greenlava.demo.domain.index.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String indexPage() {
		
		return "index";
	}
}
