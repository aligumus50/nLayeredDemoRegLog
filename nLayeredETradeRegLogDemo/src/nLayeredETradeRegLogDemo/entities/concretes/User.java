package nLayeredETradeRegLogDemo.entities.concretes;

import nLayeredETradeRegLogDemo.entities.abstracts.Entity;

public class User implements Entity{

	private int id;
	private String firstName;
	private String lastName;
	private String userName;
	private String eMailAddress;
	private String password;
	private String telNumber;
	
	public User(int id, String firstName, String lastName, String userName, String eMailAddress, String password,
			String telNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.eMailAddress = eMailAddress;
		this.password = password;
		this.telNumber = telNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEMailAddress() {
		return eMailAddress;
	}
	public void setEMailAddress(String eMailAddress) {
		this.eMailAddress = eMailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelNumber() {
		return telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
}
