package Models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PokemonDAO {
	Connection c = null;
	Statement s = null;
	ResultSet r = null;

	/**
	 * Get Database Connection
	 * 
	 * @return Statement Object
	 */
	public Statement getConnection() {

		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:pokemon.sqlite");
			s = c.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
		}

		return s;
	}
	
	/**
	 * Close any open database connection
	 * 
	 */
	public void closeConnection() {
		try {
			if (s != null) {
				s.close();
			}
			if (c != null) {
				c.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**Returns all pokemon in database
	 * 
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Pokemon> allPokemon() throws SQLException {

		ArrayList<Pokemon> pokemonList = new ArrayList<>();
		try {
			String sql = "SELECT * FROM pokemon";
			ResultSet rs = getConnection().executeQuery(sql);
			
			if(rs != null) {
			while(rs.next()) {
				
				Pokemon pokemon = new Pokemon();
					try {
					pokemon.setP_id(rs.getInt(1));
					pokemon.setP_name(rs.getString("p_name"));
					pokemon.setP_ptype(rs.getString("p_ptype"));
					pokemon.setP_stype(rs.getString("p_stype"));
					pokemon.setP_total(rs.getInt("p_total"));
					pokemon.setP_hp(rs.getInt("p_hp"));
					pokemon.setP_attack(rs.getInt("p_attack"));
					pokemon.setP_defense(rs.getInt("p_defense"));	
					pokemon.setP_sattack(rs.getInt("p_sattack"));
					pokemon.setP_sdefense(rs.getInt("p_sdefense"));
					pokemon.setP_speed(rs.getInt("p_speed"));
					pokemon.setP_species(rs.getString("p_species"));
					
					} catch (SQLException s) {
						s.printStackTrace();
					}
					pokemonList.add(pokemon);
		
				}	
				rs.close();
			}
		} catch (SQLException s) {
			System.out.println(s);
		}
		closeConnection();
		return pokemonList;
	}
}