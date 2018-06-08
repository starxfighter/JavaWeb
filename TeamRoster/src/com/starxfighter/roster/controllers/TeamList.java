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
import com.starxfighter.roster.models.Team;

/**
 * Servlet implementation class Team
 */
@WebServlet("/Team")
public class TeamList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/NewTeam.jsp");
		view.forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String newTeam = request.getParameter("teamname");
		HttpSession session = request.getSession();
		League tempLeague = (League) session.getAttribute("league");
		
		Team tempTeam = new Team();
		tempTeam.setTeamName(newTeam);
		ArrayList<Team> tempTeams = tempLeague.getTeams();
		
		tempTeams.add(tempTeam);
		
		tempLeague.setTeams(tempTeams);
		
		session.setAttribute("league", tempLeague);
		
		response.sendRedirect("/TeamRoster/Home");
		
	}

}
