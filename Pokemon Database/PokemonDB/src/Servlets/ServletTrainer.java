package Servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.Trainer;
import Models.TrainerDAO;

public class ServletTrainer  extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		TrainerDAO dao = new TrainerDAO();
		ArrayList<Trainer> allG = null;
		try {
			allG = dao.allTrainer();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher view = req.getRequestDispatcher("trainer.jsp");
		req.setAttribute("allG", allG);
		view.forward(req,  resp);
	}

}
