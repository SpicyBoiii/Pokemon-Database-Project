import java.util.ArrayList;
import java.util.Scanner;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class Controller {

	public static void main(String[] args) throws Exception {
		
		//Server works but is commented out to test the menu
		
		/*Server server = new Server(8005);
		ServletHandler handler = new ServletHandler();
		server.setHandler(handler);
		//handler.addServletWithMapping(LoginServlet.class, "/*");
		server.start();
		server.join();*/
		
		
		final PokemonDAO pokemonList = new PokemonDAO();
		ArrayList<Pokemon> allPokemon = new ArrayList<Pokemon>();
		
		Scanner input = new Scanner(System.in);
		
		int choice;
		
		do {
			//basic CRUD menu
			System.out.println("---------------------------");
			System.out.println("Pokemon Database Menu");
			System.out.println("Choose from these options");
			System.out.println("---------------------------");
			System.out.println("1 - Retrieve all Pokeomn");
			System.out.println("2 - Search for a Pokemon by ID");
			System.out.println("3 - Search for a Pokemon by Name");
			System.out.println("4 - filler");
			System.out.println("5 - filler");
			System.out.println("6 - Exit");
			System.out.println("Please enter your choice - ");
			
			choice = input.nextInt();
		}
		
		while(choice < 7);
			
		switch(choice) {
		case 1: //get all Pokemon
			allPokemon = pokemonList.allPokemon();
				for(Pokemon p : allPokemon)
				{
					System.out.println(p);
				}
				break;
			
		case 2: //get Pokemon by ID
			int idP;
			System.out.println("Pokemon ID: ");
			idP = input.nextInt();
			Pokemon getidP = pokemonList.getPID(idP);
			System.out.println(getidP);
			break;
			
		case 3: //gets a Pokemon by it's name
			int pName;
			System.out.println("Pokemon Name: ");
			pName = input.nextInt();
			Pokemon getN = pokemonList.getPName(pName);
			System.out.println(getN);
			
		case 4:
			
		case 5:
			
		case 6: //exit
			System.out.println("You have exited the menu.");
		default:	
			System.out.println("Invalid Input");
		}
		input.close();
	}

}
