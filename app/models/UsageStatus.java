package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class UsageStatus extends Model {

	public String id;
	public String user;
	public String train;

	public UsageStatus(String id, String user, String train) {
		this.id = id;
		this.user = user;
		this.train = train;
	}

}
