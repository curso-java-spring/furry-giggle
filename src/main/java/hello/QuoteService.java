package hello;

import org.springframework.web.client.RestTemplate;

public class QuoteService {
	private RestTemplate restTemplate;

	public QuoteService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	public Quote getQuote() {
		return restTemplate.getForObject(
				"https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
	}

}
