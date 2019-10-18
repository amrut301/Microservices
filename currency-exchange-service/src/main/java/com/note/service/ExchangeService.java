package com.note.service;

import com.note.bean.ExchangeValue;

public interface ExchangeService {

	ExchangeValue retrieveExchangeValue(String from, String to);

}
