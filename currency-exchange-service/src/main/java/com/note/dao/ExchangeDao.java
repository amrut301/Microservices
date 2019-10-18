package com.note.dao;

import com.note.bean.ExchangeValue;

public interface ExchangeDao {

	ExchangeValue retrieveExchangeValue(String from, String to);

}
