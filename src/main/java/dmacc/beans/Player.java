package dmacc.beans;

import org.springframework.beans.factory.annotation.Autowired;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * Jonathan Argueta-Herrera - jiarguetaherrera CIS175 Fall 2023 Aug, 30
 */
@Entity
public class Player {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String number;
	private String position;
	@Autowired
	private Team team;

	public Player() {
		super();
		this.position = "striker";
	}

	public Player(String name) {
		super();
		this.name = name;
	}

	public Player(String name, String number, String position) {
		super();
		this.name = name;
		this.number = number;
		this.position = position;
	}

	public Player(int id, String name, String number, String position) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.position = position;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", number=" + number + ", position=" + position
		 + ", team=" + team + "]";
	}
}