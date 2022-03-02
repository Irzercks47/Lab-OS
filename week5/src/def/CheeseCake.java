package def;

public class CheeseCake extends Item {
	private String cheeseType;
	private double milkPercentage;
	private boolean isVegan;
	public CheeseCake(String nama, int qty, int rating, String cheeseType, double milkPercentage, boolean isVegan) {
		super(nama, qty, rating);
		this.cheeseType = cheeseType;
		this.milkPercentage = milkPercentage;
		this.isVegan = isVegan;
	}
	public void printData() {
		super.printData();
		System.out.println("Cheese Type :" + cheeseType);
		System.out.println("Milk Percentage :" + milkPercentage);
		System.out.println("Is Vegan :" + isVegan);
	}
	public String getCheeseType() {
		return cheeseType;
	}
	public void setCheesetype(String cheeseType) {
		this.cheeseType = cheeseType;
	}
	public double getMilkPercentage() {
		return milkPercentage;
	}
	public void setMilkPercentage(double milkPercentage) {
		this.milkPercentage = milkPercentage;
	}
	public boolean isVegan() {
		return isVegan;
	}
	public void setVegan(boolean isVegan) {
		this.isVegan = isVegan;
	}
}
