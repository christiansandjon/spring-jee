package com.smc.listes;

import java.util.Date;

import javax.validation.constraints.Size;

public class ListeAF {
	
	private int id;
	private String user; 
	
	@Size(min=4, message="Entrez au minimum 4 caractères !")
	private String description; 
	private Date date;
	private boolean estEffectuee;
	
	
	// constructor
	public ListeAF(int id, String user, String description, Date date, boolean estEffectuee) {
		super();
		this.id = id;
		this.user = user;
		this.description = description;
		this.date = date;
		this.estEffectuee = estEffectuee;
	}
	

	// getters setters 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean estEffectuee() {
		return estEffectuee;
	}
	public void setDone(boolean estEffectuee) {
		this.estEffectuee = estEffectuee;
	}
	
	// tostring
	@Override
	public String toString() {
		return "Liste à faire : "
				+ "\nid=" + id + ", \nuser=" + user + ", \ndescription=" + description + ", \ndate=" + date + ", \nestEffectuee=" + estEffectuee;
	}
	
	// unicité 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListeAF other = (ListeAF) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
