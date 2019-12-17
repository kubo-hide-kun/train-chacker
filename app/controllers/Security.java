package controllers;

import models.User;

public class Security extends Secure.Security {

	static boolean authenticate(String address, String password) {
		User user = User.find("byEnail",address).first();
		return user != null && user.password.equals(password);
    }
}