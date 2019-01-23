package com.smc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smc.beans.ValidPassword;


@WebServlet("/servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ValidPassword validPassword = new ValidPassword();
   
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		request.setAttribute(login, login);
		request.setAttribute(password, password);
		request.getRequestDispatcher("WEB-INF/views/connexion.jsp").forward(request, response);
	*/
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		boolean valid = validPassword.isValid(login, password);
		if(valid) {
			request.setAttribute("login", login);
			request.setAttribute("password", password);
		request.getRequestDispatcher("WEB-INF/views/home.jsp").forward(request, response);
		} 
		else {
			String error = "mauvais login ou mot de passe !!";
			request.setAttribute("error", error);
			request.getRequestDispatcher("WEB-INF/views/connexion.jsp").forward(request, response);		
		}	
	}
}
