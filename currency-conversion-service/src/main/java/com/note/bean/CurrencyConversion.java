package com.note.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class CurrencyConversion implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String from;
	private String to;
	private BigDecimal conversionMulitple;
	private Integer port;
	private BigDecimal quantity;
	private BigDecimal totalCalculatedAmount;

	public CurrencyConversion(Integer id, String from, String to, BigDecimal conversionMulitple, BigDecimal quantity,
			BigDecimal totalCalculatedAmount, Integer port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMulitple = conversionMulitple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
		this.port = port;
	}

	public CurrencyConversion() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMulitple() {
		return conversionMulitple;
	}

	public void setConversionMulitple(BigDecimal conversionMulitple) {
		this.conversionMulitple = conversionMulitple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}

	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

}
