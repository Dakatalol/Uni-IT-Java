package ru.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register-servlet")
public class RegisterServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		String pass = req.getParameter("password");
		String username = req.getParameter("username");

		out.print("hi");

	}

	// @Override
	// protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
	// throws ServletException, IOException {
	// // TODO Auto-generated method stub
	// super.service(arg0, arg1);
	// }
}
