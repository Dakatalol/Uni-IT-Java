package org.ami.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ami.user.User;
import org.ami.util.GetSessionFactory;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

@WebServlet(urlPatterns = "/statistics-user")
public class ResultsServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		req.getRequestDispatcher("/statistics.html").include(req, resp);
		SessionFactory factory = GetSessionFactory.getInstance();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(User.class);
		Criterion ageCriterion = Restrictions.eq("age", 26);
		criteria.add(ageCriterion);

		List<User> users = criteria.list();
		session.getTransaction().commit();

		writer.print("alabala");
	}
}
