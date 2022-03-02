public abstract class Item{
	private String nama;
	private int qty,rating,basePrice;
	public Item(String nama, int qty, int rating, int basePrice) {
		super();
		this.nama = nama;
		this.qty = qty;
		this.rating = rating;
		this.basePrice = basePrice;
	}
	public abstract int getPrice();
	public abstract int getPrice(Double discount);
	public void printData() {
		System.out.println("Nama   :" +nama);
		System.out.println("Qty	   :" +qty);
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
	
	public int getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}
	
}
