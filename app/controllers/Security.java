package controllers;

public class Security extends Secure.Security {

	static boolean authenticate(String address, String password) {
		return true;
    }
}