package com.starxfighter.button.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Button
 */
@WebServlet("/Button")
public class Button extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int counter = 0;
	private int initial = 0;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("counter") == null) {
			session.setAttribute("counter", initial);
		} else {
			counter += 1;
			session.setAttribute("counter", counter);
		}
		
//		counter += 1;
//		
//		session.setAttribute("counter", counter);
			
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/counter.jsp");
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
