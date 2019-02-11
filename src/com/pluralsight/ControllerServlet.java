package com.pluralsight;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
	private ArrayList<Book> bookList = new ArrayList<Book>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
        super();
        bookList.add(new Book("To Kill A Mockingbird", "Harper Lee", 5.50f));
        bookList.add(new Book("1984", "George Orwell", 10.53f));
        bookList.add(new Book("Harry Potter", "J.K Rowling", 24.23f));
    }
    
    private void addBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/BookForm.jsp");
		dispatcher.forward(request, response);
    }
    
    private void listBooks(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("bookList", bookList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/BookList.jsp");
		dispatcher.forward(request, response);
    }
    
    private void insertBook(HttpServletRequest request, HttpServletResponse response) 
    		throws ClassNotFoundException, SQLException, ServletException, IOException{
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		float price = Float.parseFloat(request.getParameter("price"));
		bookList.add(new Book(title,author,price));
		
		response.sendRedirect("list");
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String uri = request.getRequestURI();
		String action = request.getPathInfo();
		if (action.equals("/new")) {
			addBook(request, response);
		}else if (action.equals("/list")) {
			listBooks(request, response);
		}else {
//			PrintWriter output = response.getWriter();
//			output.println("Error");
			listBooks(request, response);
		}
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		PrintWriter output = response.getWriter();
//		
//		String title = request.getParameter("title");
//		String author = request.getParameter("author");
//		
//		output.println("Book title: " + title);
//		output.println("Author: " + author);
//		ArrayList<String> books = new ArrayList();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
//		PrintWriter output = response.getWriter();
//		
//		String title = request.getParameter("title");
//		String author = request.getParameter("author");
//		
//		output.println("Book title: " + title);
//		output.println("Author: " + author);
		
		String action = request.getPathInfo();
		if (action.equals("/insert")) {
			try {
				insertBook(request, response);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
//		doGet(request, response);
	}

}
