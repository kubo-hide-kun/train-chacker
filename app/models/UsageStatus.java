package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class UsageStatus extends Model {

	public String user;
	public String train;

	public UsageStatus(String user, String train) {
		this.user = user;
		this.train = train;
	}

}
