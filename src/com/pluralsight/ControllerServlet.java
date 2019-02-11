package com.pluralsight;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
//@WebServlet("/books/*")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<String> books = new ArrayList<String>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        books.add("Frankenstein");
		books.add("1984");
		books.add("Harry Potter");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		PrintWriter output = response.getWriter();
//		
//		String title = request.getParameter("title");
//		String author = request.getParameter("author");
//		
//		output.println("Book title: " + title);
//		output.println("Author: " + author);
//		ArrayList<String> books = new ArrayList();
		request.setAttribute("books", books);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/BookList.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		PrintWriter output = response.getWriter();
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		
		output.println("Book title: " + title);
		output.println("Author: " + author);
	}

}
