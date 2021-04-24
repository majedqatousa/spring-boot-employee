package com.example.Employee.repo.exption;

public class UserNotFoundExption extends RuntimeException {
	public UserNotFoundExption(String message) {
		super(message);
	}
}
