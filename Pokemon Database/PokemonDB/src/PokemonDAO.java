import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PokemonDAO {
	
	/**Opens database connection
	 * 
	 * @return
	 */
	private static Connection getDBConnection()
	{
		Connection dbConnection = null;
		try {
			Class.forName("org.sqlite.JDBC");
			} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try{
			String url = "jdbc:sqlite:pokemon.sqlite";
			dbConnection = DriverManager.getConnection(url);
			} catch(SQLException e) {
			System.out.println(e.getMessage());
			}
		return dbConnection;
	}
	
	/**Returns all pokemon in database
	 * 
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Pokemon> allPokemon() throws SQLException {
		
		Connection dbConnection = null;
		Statement statement = null;
		ResultSet result = null;

		String query = "SELECT * FROM pokemon;";
		ArrayList<Pokemon> pokemonList = new ArrayList<>();
	
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println("DBQuery = " + query);
			result = statement.executeQuery(query);

			while(result.next()) {
				try {
					int p_id = result.getInt("p_id");
					String p_name = result.getString("p_name");
					int p_height = result.getInt("p_height");
					int p_weight = result.getInt("p_weight");
					String p_ptype = result.getString("p_type");
					String p_stype = result.getString("p_stype");
					String p_generation = result.getString("p_generation");
					String p_ability1 = result.getString("p_ability1");
					String p_ability2 = result.getString("p_ability2");
					String p_species = result.getString("p_species");
					
					pokemonList.add(new Pokemon(p_id, p_name, p_height, p_weight, 
							p_ptype, p_stype, p_generation, p_ability1, p_ability2,
							p_species));
					
				} catch(Exception e) {
					System.out.println("get all pokemon: " + e);
				} finally {
					if(result != null) { result.close();}
					if(statement != null) { statement.close();}
					if(dbConnection != null) {dbConnection.close();}
				}

			}
			return pokemonList;
	}	
	/**Retrieves pokemon based on ID 
	 * 
	 * @param p_id
	 * @return
	 * @throws SQLException
	 */
	
	public Pokemon getPID(int p_id) throws SQLException {
	
		Connection dbConnection = null;
		Statement statement = null;
		ResultSet result = null;
		Pokemon temp = null;
		
		String query = "SELECT * FROM pokemon WHERE p_id = " + p_id + ";";
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println("DBQuery = " + query);
			result = statement.executeQuery(query);
			
			while(result.next()) {
				
				String p_name = result.getString("p_name");
				int p_height = result.getInt("p_height");
				int p_weight = result.getInt("p_weight");
				String p_ptype = result.getString("p_type");
				String p_stype = result.getString("p_stype");
				String p_generation = result.getString("p_generation");
				String p_ability1 = result.getString("p_ability1");
				String p_ability2 = result.getString("p_ability2");
				String p_species = result.getString("p_species");
				
				temp = new Pokemon(p_id, p_name, p_height,p_weight, 
						p_ptype, p_stype, p_generation, p_ability1, p_ability2,
						p_species);
						}
			} finally {
		    	 if(result != null) { result.close();}
		    	 if(statement != null) {statement.close();}
		    	 if(dbConnection != null) {dbConnection.close();}
		     }
				return temp;
		 }
	/**Retrieves Pokemon based on it's name
	 * 
	 * @param p_name
	 * @return
	 * @throws SQLException
	 */
	public Pokemon getPName(int p_name) throws SQLException {
		
		Connection dbConnection = null;
		Statement statement = null;
		ResultSet result = null;
		Pokemon temp = null;
		
		String query = "SELECT * FROM pokemon WHERE p_id = " + p_name + ";";
		
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();
			System.out.println("DBQuery = " + query);
			result = statement.executeQuery(query);
			
			while(result.next()) {
				
				String p_id = result.getString("p_id");
				int p_height = result.getInt("p_height");
				int p_weight = result.getInt("p_weight");
				String p_ptype = result.getString("p_type");
				String p_stype = result.getString("p_stype");
				String p_generation = result.getString("p_generation");
				String p_ability1 = result.getString("p_ability1");
				String p_ability2 = result.getString("p_ability2");
				String p_species = result.getString("p_species");
				
				temp = new Pokemon(p_name, p_id, p_height,p_weight, 
						p_ptype, p_stype, p_generation, p_ability1, p_ability2,
						p_species);
						}
			} finally {
		    	 if(result != null) { result.close();}
		    	 if(statement != null) {statement.close();}
		    	 if(dbConnection != null) {dbConnection.close();}
		     }
				return temp;
		 } 
}
	
	
