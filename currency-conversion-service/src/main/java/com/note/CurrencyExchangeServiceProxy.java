package com.note;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.note.bean.CurrencyConversion;

//@FeignClient(name="currency-exchange-service",url="localhost:8000")


//removing the url which is hardcoded here and can be made dynamic by adding Ribbon Cleint
//@FeignClient(name="currency-exchange-service")
//disable name service to exact server, than chnage it to ZUUL service, so that it routes the rquest and not from here
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient("currency-exchange-service")
public interface CurrencyExchangeServiceProxy {
	
//	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	//commenting the above as, the request has to go via Zuul and hence needs to add name of the application i.e.
	@GetMapping("currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	CurrencyConversion retrievExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to) ;
		

}
