package com.starxfighter.pets.controllers;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.starxfighter.pets.models.Dog;

/**
 * Servlet implementation class dog
 */
@WebServlet("/dog")
public class dog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tempName = request.getParameter("name");
		String tempBreed = request.getParameter("breed");
		int tempWeight = Integer.parseInt(request.getParameter("weight"));
		
		Dog dog = new Dog(tempName, tempBreed, tempWeight);
		
		request.setAttribute("dog", dog);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/dog.jsp");
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
