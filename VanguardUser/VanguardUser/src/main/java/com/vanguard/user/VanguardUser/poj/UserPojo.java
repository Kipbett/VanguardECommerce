package com.vanguard.user.VanguardUser.poj;

public class UserPojo {

	private int userID;
	private String name;
	private String email;
	private String address;
	private String contact;
	private Boolean userStatus;
	public UserPojo(int userID, String name, String email, String address, String contact, Boolean userStatus) {
		super();
		this.userID = userID;
		this.name = name;
		this.email = email;
		this.address = address;
		this.contact = contact;
		this.userStatus = userStatus;
	}
	
	
	public UserPojo() {}
	
	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getContact() {
		return contact;
	}
	
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public Boolean getUserStatus() {
		return userStatus;
	}
	
	public void setUserStatus(Boolean userStatus) {
		this.userStatus = userStatus;
	}
	
	
	
	@Override
	public String toString() {
		return "UserPojo [userID=" + userID + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", contact=" + contact + ", userStatus=" + userStatus + "]";
	}
	
	
}
