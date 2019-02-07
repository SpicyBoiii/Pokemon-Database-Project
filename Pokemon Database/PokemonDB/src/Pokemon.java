
public class Pokemon { //declare variables
	private int p_id;
	private String p_name;
	private int p_height;
	private int p_weight;
	private String p_ptype;    
	private String p_stype;
	private String p_generation;
	private String p_ability1;
	private String p_ability2;
	private String p_species;
	
	public Pokemon(int p_id, String p_name, int p_height, int p_weight,
			String p_ptype, String p_stype, String p_generation,
			String p_ability1, String p_ability2, String p_species)
	{
		//initialise variabless
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_height = p_height;
		this.p_weight = p_weight;
		this.p_ptype = p_ptype;
		this.p_stype = p_stype;
		this.p_generation = p_generation;
		this.p_ability1 = p_ability1;
		this.p_ability2 = p_ability2;
		this.p_species = p_species;
		
	}
	//create getters and setters
	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_height() {
		return p_height;
	}

	public void setP_height(int p_height) {
		this.p_height = p_height;
	}

	public int getP_weight() {
		return p_weight;
	}

	public void setP_weight(int p_weight) {
		this.p_weight = p_weight;
	}

	public String getP_ptype() {
		return p_ptype;
	}

	public void setP_ptype(String p_ptype) {
		this.p_ptype = p_ptype;
	}

	public String getP_stype() {
		return p_stype;
	}

	public void setP_stype(String p_stype) {
		this.p_stype = p_stype;
	}

	public String getP_generation() {
		return p_generation;
	}

	public void setP_generation(String p_generation) {
		this.p_generation = p_generation;
	}

	public String getP_ability1() {
		return p_ability1;
	}

	public void setP_ability1(String p_ability1) {
		this.p_ability1 = p_ability1;
	}

	public String getP_ability2() {
		return p_ability2;
	}

	public void setP_ability2(String p_ability2) {
		this.p_ability2 = p_ability2;
	}

	public String getP_species() {
		return p_species;
	}

	public void setP_species(String p_species) {
		this.p_species = p_species;
	}

	//write toString method
	@Override
	public String toString() {
		return "Pokemon [p_id=" + p_id + ", p_name=" + p_name + ", p_height=" + p_height + ", p_weight=" + p_weight
				+ ", p_ptype=" + p_ptype + ", p_stype=" + p_stype + ", p_generation=" + p_generation + ", p_ability1="
				+ p_ability1 + ", p_ability2=" + p_ability2 + ", p_species=" + p_species + "]";
	}	
}
