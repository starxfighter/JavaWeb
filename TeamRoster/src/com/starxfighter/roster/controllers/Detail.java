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
import com.starxfighter.roster.models.Player;

/**
 * Servlet implementation class Detail
 */
@WebServlet("/Detail")
public class Detail extends HttpServlet {
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
		ArrayList<Player> tempPlayer = currTeam.getPlayers();
		request.setAttribute("players", tempPlayer);

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/TeamInfo.jsp");
		view.forward(request,  response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
