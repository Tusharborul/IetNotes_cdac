package com.demo.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.demo.beans.User;
import com.demo.service.*;


@WebServlet("/validate")
public class ValidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String uname=request.getParameter("uname");
		String passwd=request.getParameter("pass");
		LoginService lservice=new LoginServiceImpl();
		User user=lservice.validateUser(uname, passwd);
		if((user!=null) && user.getRole().equals("admin")) {
			RequestDispatcher rd=request.getRequestDispatcher("showprod");
			rd.forward(request, response);
			
		}else {
			out.println("Invalid credentials");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
	}
}
