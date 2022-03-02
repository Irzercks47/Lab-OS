public class CheeseCake extends Item {
	private String cheeseType;
	private double milkPercentage;
	private boolean isVegan;
	public CheeseCake(String nama, int qty, int rating, String cheeseType, double milk, boolean vegan) {
		super(nama, qty, rating,30000);
		this.cheeseType = cheeseType;
		this.isVegan = vegan;
		this.milkPercentage = milk;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void printData() {
		super.printData();
		System.out.println("cheese type     : "+cheeseType);
		System.out.println("milk percentage : "+milkPercentage);
		System.out.println("is vegan cheese : "+isVegan);
	} 

	public String getCheeseType() {
		return cheeseType;
	}

	public void setCheeseType(String cheeseType) {
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

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public int getPrice(Double discount) {
		// TODO Auto-generated method stub
		return 0;
	}

}
