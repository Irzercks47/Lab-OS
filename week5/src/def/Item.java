package def;

public abstract class Item {
	private String nama;
	private int qty,rating;
	private int basePrice;
	
	public int getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}
	public Item(String nama, int qty, int rating) {
		super();
		this.nama = nama;
		this.qty = qty;
		this.rating = rating;
		this.basePrice = basePrice;
	}
	public abstract int getPrice();
	public abstract int getPrice(Double discount);
	public void printData() {
		System.out.println("Nama :" +nama);
		System.out.println("Quantity :" +qty);
		System.out.println("Rating :" +rating);
	}
	public String getNama() {
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
