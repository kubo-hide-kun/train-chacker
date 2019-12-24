package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class User extends Model {

	public String address;
	public String password;

	public User(String address, String password) {
		this.address = address;
		this.password = password;
	}

}
