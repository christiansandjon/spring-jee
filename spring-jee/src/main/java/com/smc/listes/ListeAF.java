package com.smc.listes;

import java.util.Date;

public class ListeAF {
	
	private int id;
	private String user; 
	private String taches; 
	private Date date;
	private boolean isDone;
	
	
	// constructor
	public ListeAF(int id, String user, String taches, Date date, boolean isDone) {
		super();
		this.id = id;
		this.user = user;
		this.taches = taches;
		this.date = date;
		this.isDone = isDone;
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
	public String getTaches() {
		return taches;
	}
	public void setTaches(String taches) {
		this.taches = taches;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	
	// tostring
	@Override
	public String toString() {
		return "Liste à faire : "
				+ "\nid=" + id + ", \nuser=" + user + ", \ntaches=" + taches + ", \ndate=" + date + ", \nisDone=" + isDone;
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
