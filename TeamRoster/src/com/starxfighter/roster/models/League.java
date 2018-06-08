package com.starxfighter.roster.models;

import java.util.ArrayList;

public class League {
	private ArrayList<Team> teams = new ArrayList<Team>();

	public League() {
	}

	public ArrayList<Team> getTeams() {
		return teams;
	}

	public void setTeams(ArrayList<Team> team) {
		this.teams = team;
	}

	@Override
	public String toString() {
		return "League [teams=" + teams + "]";
	}
	
	

}
