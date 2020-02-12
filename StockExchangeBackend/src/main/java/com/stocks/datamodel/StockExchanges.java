package com.stocks.datamodel;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "StockExchanges")
@Component(value="stocks")
public class StockExchanges implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1739433380834698047L;
	@Id
	@GeneratedValue
	private int id;
	private String stockExchanges;
	private String aboutSE;
	private String address;
	
	public StockExchanges() {}

	public StockExchanges(int id, String stockExchanges, String aboutSE, String address) {
		super();
		this.id = id;
		this.stockExchanges = stockExchanges;
		this.aboutSE = aboutSE;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStockExchanges() {
		return stockExchanges;
	}

	public void setStockExchanges(String stockExchanges) {
		this.stockExchanges = stockExchanges;
	}

	public String getAboutSE() {
		return aboutSE;
	}

	public void setAboutSE(String aboutSE) {
		this.aboutSE = aboutSE;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "StockExchanges [id=" + id + ", stockExchanges=" + stockExchanges + ", aboutSE=" + aboutSE + ", address="
				+ address + "]";
	}
	
	
	
	

}
