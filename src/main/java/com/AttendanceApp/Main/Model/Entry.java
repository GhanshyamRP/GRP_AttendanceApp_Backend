package com.AttendanceApp.Main.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Entry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String type;
	private String time;
	
	@ManyToOne
	private Attendance att;
	
	public Entry() {
		super();
	}

	public Entry(int id, String type, String time, Attendance att) {
		super();
		this.id = id;
		this.type = type;
		this.time = time;
		this.att = att;
	}

	@JsonIgnoreProperties({"entrylst"})
	public Attendance getAtt() {
		return att;
	}

	public void setAtt(Attendance att) {
		this.att = att;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
}
