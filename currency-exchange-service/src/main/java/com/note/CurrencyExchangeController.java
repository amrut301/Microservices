package com.note;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.note.bean.ExchangeValue;
import com.note.service.ExchangeService;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private Environment env;

	@Autowired
	private ExchangeService exchangeService;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	ExchangeValue retrievExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchange = new ExchangeValue(1, from, to, BigDecimal.valueOf(75));
		exchange.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		logger.info("{}", exchange);
		return exchange;

	}
}
