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

	private QuoteService qs;

	public QuoteController(RestTemplate restTemplate) {
		qs = new QuoteService(restTemplate);
	}

	@GetMapping("/quotes")
	public String showQuote(Model model) {
		Quote quote = qs.getQuote();
		log.info(quote.toString());
		model.addAttribute("q", quote);
		return "quoteDetails";
	}

}
