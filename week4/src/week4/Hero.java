package week4;

public class Hero {
	private String name;
	Integer hp;
	Integer attack;
	Integer energy;
	
	public Hero(String name, Integer hp, Integer attack, Integer energy) {
		super();
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.energy = energy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
