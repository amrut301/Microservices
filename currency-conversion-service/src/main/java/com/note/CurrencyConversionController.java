package com.note;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.note.bean.CurrencyConversion;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@GetMapping(value="currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	CurrencyConversion convertCurrency(@PathVariable String to, @PathVariable String from,
			@PathVariable BigDecimal quantity) {

		Map<String, String> uriVar = new HashMap<String, String>();
		uriVar.put("from", from);
		uriVar.put("to", to);
		ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversion.class,uriVar);
		CurrencyConversion currencyConversion = responseEntity.getBody();
		
		return new CurrencyConversion(1, "USD", "INR", BigDecimal.valueOf(87345), BigDecimal.valueOf(87345),
				quantity, currencyConversion.getPort());
	}
	
	
	
	@GetMapping(value="currency-converter-fiegn/from/{from}/to/{to}/quantity/{quantity}")
	CurrencyConversion convertCurrencyFiegn(@PathVariable String to, @PathVariable String from,
			@PathVariable BigDecimal quantity) {

		CurrencyConversion currencyConversion = proxy.retrievExchangeValue(from, to);
		logger.info("{}",currencyConversion);
		return new CurrencyConversion(1, "USD", "INR", BigDecimal.valueOf(87345), BigDecimal.valueOf(87345),
				quantity, currencyConversion.getPort());
	}
}
