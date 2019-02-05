package Servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.Pokemon;
import Models.PokemonDAO;

public class ServletPokemon  extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PokemonDAO dao = new PokemonDAO();
		ArrayList<Pokemon> allP = null;
		try {
			allP = dao.allPokemon();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher view = req.getRequestDispatcher("pokemon.jsp");
		req.setAttribute("allP", allP);
		view.forward(req,  resp);
	}

}
