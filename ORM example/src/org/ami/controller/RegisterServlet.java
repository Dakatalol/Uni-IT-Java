package org.ami.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ami.user.User;
import org.ami.util.GetSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@WebServlet(urlPatterns = "/register-user")
public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3235703222224335472L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		final String username = req.getParameter("username");

		final String password = req.getParameter("password");

		final int age = Integer.parseInt(req.getParameter("age"));

		User user = new User(username, age, password);

		// SessionFactory factory =
		// GetSessionFactory
		SessionFactory factory = GetSessionFactory.getInstance();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();

		GetSessionFactory.closeSessionFactory();

		System.out.println("Automaticly saved user " + user);

		PrintWriter out = resp.getWriter();
		out.print("asasd");
	}

}
