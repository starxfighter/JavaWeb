package com.starxfighter.roster.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
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
 * Servlet implementation class Player
 */
@WebServlet("/Player")
public class newPlayer extends HttpServlet {
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
		request.setAttribute("team", currTeam);
		request.setAttribute("teamidx", teamIdx);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/NewPlayer.jsp");
		view.forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		League tempLeague = (League) session.getAttribute("league");
		int teamIdx = Integer.parseInt(request.getParameter("teamid"));
		ArrayList<Team> tempTeams = tempLeague.getTeams();
		Team	currTeam = tempTeams.get(teamIdx);
		
		String newFname = request.getParameter("firstname");
		String newLname = request.getParameter("lastname");
		int newAge = Integer.parseInt(request.getParameter("pAge"));
		Player tempPlayer = new Player(newFname, newLname, newAge);
		
		ArrayList<Player> tempPlayers = currTeam.getPlayers();
		
		tempPlayers.add(tempPlayer);
		
		currTeam.setPlayers(tempPlayers);
		
		tempTeams.set(teamIdx, currTeam);
		
		tempLeague.setTeams(tempTeams);
		
		session.setAttribute("league", tempLeague);
		
		response.sendRedirect("/TeamRoster/Detail?teamid=" + teamIdx);
		
	}

}
