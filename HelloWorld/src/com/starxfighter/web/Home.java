package com.starxfighter.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Sets the content type of the response
		String userName = "Unknown";
		String favLang = "Unknown";
		String homeTown = "Unknown";
		userName = request.getParameter("name");
		if(userName == null) {
			userName = "Unknown";
		}
		favLang = request.getParameter("favoriteLanguage");
		if(favLang == null) {
			favLang = "Unknown";
		}
		homeTown = request.getParameter("homeTown");
		if(homeTown == null) {
			homeTown = "Unknown";
		}
        response.setContentType("text/html");
        // writes the response
        PrintWriter out = response.getWriter();
		out.write("<h1>Welcome,  " + userName + "</h1>");
		out.write("<h3>Your favorite language is: " + favLang + "</h3>");
		out.write("<h3>Your hometown is: " + homeTown + "</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
