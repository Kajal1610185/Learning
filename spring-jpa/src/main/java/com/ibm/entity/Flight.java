package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="flights")
@NamedQueries({@NamedQuery(name="allFlights",query="from Flight")})
public class Flight {
	@Id
	private String code;
	@Column(name="source", length=15)
	private String from;
	@Column(name="Destination",length=15)
	private String to;
	@Column(length=25)
	private String carrier;
	public Flight() {
		// TODO Auto-generated constructor stub
	}
	public Flight(String code, String from, String to, String carrier) {
		super();
		this.code = code;
		this.from = from;
		this.to = to;
		this.carrier = carrier;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
}
