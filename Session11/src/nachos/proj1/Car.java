package nachos.proj1;

public class Car implements Runnable{
	private String carBrand,carType;
	public Car(String carBrand, String carType) {
		super();
		this.carBrand = carBrand;
		this.carType = carType;
	}
	public Car (String dataToBeDeserialized) {
		String [] arr = dataToBeDeserialized.split(";");
		this.carBrand=arr[0];
		this.carType=arr[1];
	}
	public String serialize() {
		return this.carBrand+";"+this.carType;
	}
	
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//kirim NL
//		con.println("Type : "+carType );
//		con.println("Brand : "+carBrand );
		System.out.println("Sending");
		System.out.println("Type : "+carType);
		System.out.println("Brand : "+carBrand);
		Main.nl.send(0, this);
	}

}
