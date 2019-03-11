package Controller;
import java.util.ArrayList;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.webapp.Configuration.ClassList;
import org.eclipse.jetty.webapp.WebAppContext;

import Models.Pokemon;
import Models.PokemonDAO;
import Servlets.ServletPokemon;

public class Controller {

	public static void main(String[] args) throws Exception {
		
		Server server = new Server(8005);
		WebAppContext ctx = new WebAppContext();
		ctx.setResourceBase("webapp");
		ctx.setContextPath("/");
		ctx.setAttribute("org.eclipse.jetty.server.webapp.ContainerIncludeJarPattern", ".*/[^/]*jstl.*\\.jar$");
		ClassList classlist = ClassList.setServerDefault(server);
		classlist.addBefore("org.eclipse.jetty.webapp.JettyWebXmlConfiguration",
		"org.eclipse.jetty.annotations.AnnotationConfiguration");
		ctx.addServlet("Servlets.ServletHome", "/home");
		ctx.addServlet("Servlets.ServletPokemon", "/pokemon");
		ctx.addServlet("Servlets.ServletTrainer", "/trainer");
		server.setHandler(ctx);
		server.start();
		server.join();

		//type "localhost:8005/pokemon"
		
		
		/*final PokemonDAO pokemonList = new PokemonDAO();
		ArrayList<Pokemon> allPokemon = new ArrayList<Pokemon>();
		
		
			allPokemon = pokemonList.allPokemon();
				for(Pokemon p : allPokemon)
				{
					System.out.println(p);
				}
		*/		
		}
	}
