package com.demo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class EmiCalculateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 double loanAmount = Double.parseDouble(request.getParameter("loanAmount"));
	        int years = Integer.parseInt(request.getParameter("years"));
	        double interestRate = 0.1; // 10% interest rate
	        double interest = loanAmount * interestRate;
	        double totalAmount = loanAmount + interest;
	        double emi = totalAmount / 36; // EMI over 36 months

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<html><body>");
	        out.println("<h2>EMI Calculator Result</h2>");
	        out.println("<p>Loan Amount: " + loanAmount + "</p>");
	        out.println("<p>Number of Years: " + years + "</p>");
	        out.println("<p>Interest: " + interest + "</p>");
	        out.println("<p>Total Amount: " + totalAmount + "</p>");
	        out.println("<p>Your EMI is: " + emi + "</p>");
	        out.println("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
