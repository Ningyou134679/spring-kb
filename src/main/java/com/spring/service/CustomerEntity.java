package com.spring.service;

public class CustomerEntity {
	private String name;
	private String email;
	private String photo;

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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "CustomerEntity [name=" + name + ", email=" + email + ", photo=" + photo + "]";
	}

}
