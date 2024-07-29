package com.AttendanceApp.Main.Model;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Attendance {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private Date date;
	
	@OneToMany (mappedBy = "att")
	private List<Entry> entrylst;
	
	
	@ManyToOne
	private User user;
	
	public Attendance() {
	}

	public Attendance(int id, Date date, List<Entry> entrylst, User user) {
		super();
		this.id = id;
		this.date = date;
		this.entrylst = entrylst;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Attendance [id=" + id + ", date=" + date + ", entrylst=" + entrylst + ", user=" + user + "]";
	}

	public Attendance(Date date, User user) {
		super();
		this.date = date;
		this.user = user;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@JsonIgnoreProperties({"att"})
	public List<Entry> getEntrylst() {
		return entrylst;
	}

	public void setEntrylst(List<Entry> entrylst) {
		this.entrylst = entrylst;
	}

	@JsonIgnoreProperties({"atlist"})
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
