package dmacc.beans;

import jakarta.persistence.Embeddable;

/**
 * Jonathan Argueta-Herrera - jiarguetaherrera CIS175 Fall 2023 Aug, 30
 */
@Embeddable
public class Team {
	private String teamName;
	private String league;

	public Team() {
		super();
	}

	public Team(String teamName, String league) {
		super();
		this.teamName = teamName;
		this.league = league;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", league=" + league + "]";
	}

}
