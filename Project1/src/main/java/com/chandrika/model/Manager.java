package com.chandrika.model;

public class Manager {
	private int id;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private boolean loggedIn;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(int id, String firstname, String lastname, String username, String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.loggedIn = false;
	}
	public boolean login(String password) {
		if (this.password.equals(password)) {
			loggedIn = true;
			return true;
		}
		return false;
	}
	public void logout() {
		loggedIn = false;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		// result = prime * result + firstname;
		result = prime * result + id;
		// result = prime * result + lastname;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Manager other = (Manager) obj;
		if (firstname != other.firstname)
			return false;
		if (id != other.id)
			return false;
		if (lastname != other.lastname)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", username=" + username
				+ ", password=" + password + "]";
	}
	
}
