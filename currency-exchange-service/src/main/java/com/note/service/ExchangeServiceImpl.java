package com.note.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.note.bean.ExchangeValue;
import com.note.dao.ExchangeDao;

@Service
public class ExchangeServiceImpl implements ExchangeService {

	@Autowired
	private ExchangeDao exchangeDao;
	@Override
	public ExchangeValue retrieveExchangeValue(String from, String to) {
		try {
			return exchangeDao.retrieveExchangeValue(from,to);
		} catch (Exception e) {

		}
		return null;

	}

}
