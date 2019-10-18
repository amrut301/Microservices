package com.note.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.note.bean.ExchangeValue;

@Repository
public class ExchangeDaoImpl implements ExchangeDao {

	@Autowired
	private ExchangeRepository exchangeRepository;

	@Override
	public ExchangeValue retrieveExchangeValue(String from, String to) {
		try {
			return exchangeRepository.findByFromAndTo(from,to);
		} catch (Exception e) {

		}
		return null;
	}

}
