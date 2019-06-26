package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class QuoteController {

	private static final Logger log = LoggerFactory.getLogger(QuoteController.class);
	
	@GetMapping("/quotes")
	public String showQuote(RestTemplate restTemplate, Model model) {
		Quote quote = restTemplate.getForObject(
				"https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		log.info(quote.toString());		
		model.addAttribute("q", quote);
		return "quoteDetails";
	}
	
}
