package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class User extends Model {

	public String id;
	public String address;
	public String password;

	public User(String id, String address, String password) {
		this.id = id;
		this.address = address;
		this.password = password;
	}

}
