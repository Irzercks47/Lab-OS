package def;

public class Coffee extends Item {
	private int extraShot;
	private String coffeeBeanType;
	public Coffee(String nama, int qty, int rating, int extraShot, String coffeeBeanType) {
		super(nama, qty, rating);
		this.extraShot = extraShot;
		this.coffeeBeanType = coffeeBeanType;
	}
	public int getExtraShot() {
		return extraShot;
	}
	public void setExtraShot(int extraShot) {
		this.extraShot = extraShot;
	}
	public String getCoffeeBeanType() {
		return coffeeBeanType;
	}
	public void setCoffeeBeanType(String coffeeBeanType) {
		this.coffeeBeanType = coffeeBeanType;
	}
	
}
