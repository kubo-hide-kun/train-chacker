package controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import models.UsageStatus;
import models.User;
import play.mvc.Controller;

public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void doLogin(String address, String password) {
    	if(Security.authenticate(address, password)) {
    		userTable();
    	}
    }

    public static void userTable() {

//    	HttpResponse res = WS.url("https://tetsudo.rti-giken.jp/free/delay.json").get();
//    	System.out.println(res.getString());

    	List<User> users = User.find(
    		"order by email desc"
    	).fetch();
    	List<UsageStatus> usageStatuses = UsageStatus.find(
    		"order by user desc"
    	).fetch();

    	users.forEach(user -> System.out.println(user.email));
    	usageStatuses.forEach(usageStatus -> System.out.println(usageStatus.user+": "+usageStatus.train));
    	List<String> trains = new ArrayList<>(Arrays.asList("日田彦山線","福北ゆたか線"));
    	render(users,usageStatuses, trains);
    }
}