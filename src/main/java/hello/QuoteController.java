package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuoteController {

	@GetMapping("/quotes")
	public String showQuote() {
		
		return "quoteDetails";
	}
	
}
