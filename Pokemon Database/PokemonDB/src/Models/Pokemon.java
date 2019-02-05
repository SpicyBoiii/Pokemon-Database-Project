package Models;

public class Pokemon { 
	
	public Pokemon() {
		
	}
	
	private int p_id;
	private String p_name;
	private String p_ptype;    
	private String p_stype;
	private String p_generation;
	private String p_ability1;
	private String p_ability2;
	private int p_total;
	private int p_hp;
	private int p_attack;
	private int p_defense;
	private int p_sattack;
	private int p_sdefense;
	private int p_speed;
	private String p_species;
	
	public Pokemon(int p_id, String p_name, String p_ptype, 
			String p_stype, String p_generation, String p_ability1, 
			String p_ability2, int p_total, int p_hp, int p_attack, 
			int p_defense, int p_sattack, int p_sdefense, int p_speed, 
			String p_species)
	{
		//initialise variabless
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_ptype = p_ptype;
		this.p_stype = p_stype;
		this.p_generation = p_generation;
		this.p_ability1 = p_ability1;
		this.p_ability2 = p_ability2;
		this.p_total = p_total;
		this.p_hp = p_hp;
		this.p_attack = p_attack;
		this.p_defense = p_defense;
		this.p_sattack = p_sattack;
		this.p_sdefense = p_sdefense;
		this.p_speed = p_speed;
		this.p_species = p_species;
		
	}

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

	public int getP_total() {
		return p_total;
	}

	public void setP_total(int p_total) {
		this.p_total = p_total;
	}

	public int getP_hp() {
		return p_hp;
	}

	public void setP_hp(int p_hp) {
		this.p_hp = p_hp;
	}

	public int getP_attack() {
		return p_attack;
	}

	public void setP_attack(int p_attack) {
		this.p_attack = p_attack;
	}

	public int getP_defense() {
		return p_defense;
	}

	public void setP_defense(int p_defense) {
		this.p_defense = p_defense;
	}

	public int getP_sattack() {
		return p_sattack;
	}

	public void setP_sattack(int p_sattack) {
		this.p_sattack = p_sattack;
	}

	public int getP_sdefense() {
		return p_sdefense;
	}

	public void setP_sdefense(int p_sdefense) {
		this.p_sdefense = p_sdefense;
	}

	public int getP_speed() {
		return p_speed;
	}

	public void setP_speed(int p_speed) {
		this.p_speed = p_speed;
	}

	public String getP_species() {
		return p_species;
	}

	public void setP_species(String p_species) {
		this.p_species = p_species;
	}

	@Override
	public String toString() {
		return "Pokemon [p_id=" + p_id + ", p_name=" + p_name + ", p_ptype=" + p_ptype + ", p_stype=" + p_stype
				+ ", p_generation=" + p_generation + ", p_ability1=" + p_ability1 + ", p_ability2=" + p_ability2
				+ ", p_total=" + p_total + ", p_hp=" + p_hp + ", p_attack=" + p_attack + ", p_defense=" + p_defense
				+ ", p_sattack=" + p_sattack + ", p_sdefense=" + p_sdefense + ", p_speed=" + p_speed + ", p_species="
				+ p_species + "]";
	}
}