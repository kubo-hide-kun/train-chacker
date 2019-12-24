package controllers;

import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void doLogin(String address, String password) {
    	Security.authenticate(address, password);
    }

}