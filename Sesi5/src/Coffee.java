public class Coffee extends Item implements Upgradable{
	private int extraShot;
	private String coffeeBeanType;
	public Coffee(String nama, int qty, int rating,String bean, int extra ) {
		super(nama, qty, rating,20000);
		this.coffeeBeanType = bean;
		this.extraShot = extra;
		// TODO Auto-generated constructor stub
	}
	
	public void printData() {
		super.printData();
		System.out.println("extrashot        : "+extraShot);
		System.out.println("coffee bean type : "+coffeeBeanType);
	} 

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		int extraShotPrice = 5000;
		extraShotPrice*=extraShot;
		
		return (getBasePrice()+extraShotPrice);
	}

	@Override
	public int getPrice(Double discount) {
		// TODO Auto-generated method stub
		return (int) (getPrice() - (getPrice()*discount));
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

	@Override
	public void changeSize() {
		// TODO Auto-generated method stub
		System.out.println("THIS COFFEE WILL BE UPGRADED TO GRANDE");
		
	}

}
