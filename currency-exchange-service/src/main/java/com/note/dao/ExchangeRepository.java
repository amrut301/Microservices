package com.note.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.note.bean.ExchangeValue;

public interface ExchangeRepository extends JpaRepository<ExchangeValue, Integer>{

	
	ExchangeValue findByFromAndTo(String from,String to);
}
