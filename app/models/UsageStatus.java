package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class UsageStatus extends Model {

	public String id;
	public String train;
	private String user;

	public UsageStatus(String id, String train, String user) {
		this.id = id;
		this.train = train;
		this.user = user;
	}

}
