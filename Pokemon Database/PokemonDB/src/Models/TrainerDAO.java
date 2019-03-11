package Models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TrainerDAO {
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

	/**Returns all Trainer in database
	 * 
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Trainer> allTrainer() throws SQLException {

		ArrayList<Trainer> trainerList = new ArrayList<>();
		try {
			String sql = "SELECT * FROM trainers";
			ResultSet rs = getConnection().executeQuery(sql);
			
			if(rs != null) {
			while(rs.next()) {
				
				Trainer Trainer = new Trainer();
					try {
					Trainer.setG_ID(rs.getInt(1));
					Trainer.setG_Name(rs.getString("g_Name"));
					Trainer.setG_Gender(rs.getString("g_Gender"));
					Trainer.setG_Type(rs.getString("g_Type"));
					Trainer.setG_Hometown(rs.getString("g_Hometown"));
					Trainer.setG_Region(rs.getString("g_Region"));
					Trainer.setG_Badge(rs.getString("g_Badge"));
					
					} catch (SQLException s) {
						s.printStackTrace();
					}
					trainerList.add(Trainer);
		
				}	
				rs.close();
			}
		} catch (SQLException s) {
			System.out.println(s);
		}
		closeConnection();
		return trainerList;
	}
}