package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Assignmment extends Model {

	public String id;
	public String team;
	private String assignee;

	public Assignmment(String id, String team, String assignee) {
		this.id = id;
		this.team = team;
		this.assignee = assignee;
	}

}
