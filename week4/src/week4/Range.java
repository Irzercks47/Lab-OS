package week4;

public class Range extends Hero {
	private Integer agility;

	public Range(String name, Integer hp, Integer attack, Integer energy, Integer agility) {
		super(name, hp, attack, energy);
		this.agility = agility;
		// TODO Auto-generated constructor stub
	}

	public Integer getAgility() {
		return agility;
	}

	public void setAgility(Integer agility) {
		this.agility = agility;
	}

}
