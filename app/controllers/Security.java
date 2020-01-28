package controllers;

import models.User;

public class Security extends Secure.Security {

	static boolean authenticate(String address, String password) {
		User user = User.find("byEmail",address).first();
		System.out.println(user != null && user.password.equals(password) ? "Success" : "Failed");
		return user != null && user.password.equals(password);
    }
}