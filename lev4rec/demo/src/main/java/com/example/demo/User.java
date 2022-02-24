package com.example.demo;

public class User {
 private String name;
 private String email;
 private String surname;
 private boolean checked;
 
 

public boolean isChecked() {
	return checked;
}
public void setChecked(boolean checked) {
	this.checked = checked;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
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
}
