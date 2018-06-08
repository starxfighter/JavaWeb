package com.starxfighter.roster.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.starxfighter.roster.models.League;
import com.starxfighter.roster.models.Player;
import com.starxfighter.roster.models.Team;

/**
 * Servlet implementation class deletePlayer
 */
@WebServlet("/deletePlayer")
public class deletePlayer extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		League tempLeague = (League) session.getAttribute("league");
		int teamIdx = Integer.parseInt(request.getParameter("teamid"));
		ArrayList<Team> tempTeams = tempLeague.getTeams();
		Team	currTeam = tempTeams.get(teamIdx);
		
		ArrayList<Player> tempPlayers = currTeam.getPlayers();
		int playerIdx = Integer.parseInt(request.getParameter("playerid")); 
		tempPlayers.remove(playerIdx);
	
		response.sendRedirect("/TeamRoster/Detail?teamid=" + teamIdx);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
