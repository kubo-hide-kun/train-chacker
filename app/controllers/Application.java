package controllers;

import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void doLogin(String id, String password) {
    	System.out.println(id + " " + password);
    	Security.authenticate(id, password);
    }

}