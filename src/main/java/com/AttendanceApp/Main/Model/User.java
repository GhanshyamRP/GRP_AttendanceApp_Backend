package com.AttendanceApp.Main.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String password;
	private String email;
	private String mob;
	
	@OneToMany (mappedBy = "user")
	private List<Attendance> atlist;
	
	public User() {
		super();
	}

	public User(int id) {
		super();
		this.id = id;
	}

	public User(int id, String username, String password, String email, String mob, List<Attendance> atlist) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mob = mob;
		this.atlist = atlist;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	@JsonIgnoreProperties({"user"})
	public List<Attendance> getAtlist() {
		return atlist;
	}

	public void setAtlist(List<Attendance> atlist) {
		this.atlist = atlist;
	}
	
	

}
