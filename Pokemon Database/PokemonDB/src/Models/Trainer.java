package Models;

public class Trainer {

	public Trainer() {

	}
	private int g_ID;
	private String g_Name;
	private String g_Gender;
	private String g_Type;
	private String g_Hometown;
	private String g_Region;
	private String g_Badge;

	public Trainer( String g_Name, String g_Gender, String g_Type, String g_Hometown, String g_Region, String g_Badge) {
		// initialise variabless
		this.g_ID = g_ID;
		this.g_Name = g_Name;
		this.g_Gender = g_Gender;
		this.g_Type = g_Type;
		this.g_Hometown = g_Hometown;
		this.g_Region = g_Region;
		this.g_Badge = g_Badge;
	}

	public int getG_ID() {
		return g_ID;
	}

	public void setG_ID(int g_ID) {
		this.g_ID = g_ID;
	}
	
	public String getG_Name() {
		return g_Name;
	}

	public void setG_Name(String g_Name) {
		this.g_Name = g_Name;
	}

	public String getG_Gender() {
		return g_Gender;
	}

	public void setG_Gender(String g_Gender) {
		this.g_Gender = g_Gender;
	}

	public String getG_Type() {
		return g_Type;
	}

	public void setG_Type(String g_Type) {
		this.g_Type = g_Type;
	}

	public String getG_Hometown() {
		return g_Hometown;
	}

	public void setG_Hometown(String g_Hometown) {
		this.g_Hometown = g_Hometown;
	}

	public String getG_Region() {
		return g_Region;
	}

	public void setG_Region(String g_Region) {
		this.g_Region = g_Region;
	}

	public String getG_Badge() {
		return g_Badge;
	}

	public void setG_Badge(String g_Badge) {
		this.g_Badge = g_Badge;
	}

	@Override
	public String toString() {
		return "Trainer [g_Name=" + g_Name + ", g_Gender=" + g_Gender + ", g_Type=" + g_Type + ", g_Hometown="
				+ g_Hometown + ", g_Region=" + g_Region + ", g_Badge=" + g_Badge + "]";
	}

}