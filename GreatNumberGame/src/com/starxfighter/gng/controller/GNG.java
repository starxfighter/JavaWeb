package com.starxfighter.gng.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GNG
 */
@WebServlet("/GNG")
public class GNG extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int randNum = 0;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		if(session.getAttribute("randNum") == null) {
			Random r = new Random();
			randNum = r.nextInt(101) + 1;
			session.setAttribute("randNum", randNum);
		} else {
			Random r = new Random();
			randNum = r.nextInt(101) + 1;
			session.setAttribute("randNum", randNum);
		}
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/greatgame.jsp");
		view.forward(request,  response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int guess = Integer.parseInt(request.getParameter("guess"));
		HttpSession session = request.getSession();
		
		if(guess > (Integer) session.getAttribute("randNum")) {
			request.setAttribute("switch", "high");
		} else if(guess < (Integer) session.getAttribute("randNum")) {
			request.setAttribute("switch", "low");
		} else {
			request.setAttribute("switch", "win");
		}
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/greatgame.jsp");
		view.forward(request,  response);
		
	}

}
