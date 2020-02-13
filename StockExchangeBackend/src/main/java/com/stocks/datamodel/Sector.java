package com.stocks.datamodel;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "sector")
@Component(value = "sect")
public class Sector implements Serializable {
	
	
	private static final long serialVersionUID = 2764474120276765421L;
	
	@Id
	@GeneratedValue
	private int id;
	private String Sector;
	private String Brief;
	public Sector() {}
	public Sector(int id, String sector, String brief) {
		super();
		this.id = id;
		this.Sector = sector;
		this.Brief = brief;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSector() {
		return Sector;
	}
	public void setSector(String sector) {
		Sector = sector;
	}
	public String getBrief() {
		return Brief;
	}
	public void setBrief(String brief) {
		Brief = brief;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Sector [id=" + id + ", Sector=" + Sector + ", Brief=" + Brief + "]";
	}
	
	
}
