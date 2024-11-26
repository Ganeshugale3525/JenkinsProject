package com.ganesh.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/dateurl")
public class DateServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//set response type
		res.setContentType("text/html");
		//get PrintWriter
		PrintWriter pw=res.getWriter();
		//b logic
		Date d=new Date();
		pw.println("<h1>Date and time is::"+d+"</h1>");
		//add home hyperlink
		pw.println("<br><a href='index.jsp'> </a>");
		
		// Close stream
		pw.close();
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
