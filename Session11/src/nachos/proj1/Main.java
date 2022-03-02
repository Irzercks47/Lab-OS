package nachos.proj1;

import java.util.ArrayList;

import nachos.threads.KThread;

public class Main {
	private MyConsole con = new MyConsole();
	public static MyNetworkLink nl = new MyNetworkLink();
	public Main() {
		if(nl.getAddr()==0) {
			server();
		}else client();
//		con.print("Halo");
//		String s = con.nextLine();
//		con.println(s);
//		Car c = new Car("Camry","SUV");
//		new KThread(c).fork();
//		String s = con.nextLine();
	}
	private void server() {
		String input;
		while(true) {			
			con.println("Press 1 to see all received car! ");
			con.println("Press 2 to exit! ");
			input = con.nextLine();
			if(input.equals("1")) {
				for(Car c : nl.carList) {
					//print data
					con.println("Type : " + c.getCarType());
					con.println("Brand : " + c.getCarBrand());
				}
			}else if(input.equals("2")) return;
		}
	}
	private void client() {
		ArrayList<Car> carList = new ArrayList<>();
		String input;
		while(true) {			
			con.println("Press 1 to see all received car! ");
			con.println("Press 2 to Send all car! ");
			con.println("Press 3 to Exit! ");
			input = con.nextLine();
			if(input.equals("1")) {
				for(Car c : nl.carList) {
					//print data
					con.println("Input Type : " + c.getCarType());
					String type = con.nextLine();
					con.println("Brand : " + c.getCarBrand());
					String brand = con.nextLine();
					carList.add(new Car(type,brand));
					con.println("all car");
					for (Car car : carList) {
						con.println("Type : " + car.getCarType());
						con.println("Brand : " + car.getCarBrand());
					}
				}
			}else if(input.equals("2")) {
				ArrayList<Car> cloneList = (ArrayList<Car>) carList.clone();
				while(!cloneList.isEmpty()) {
					new KThread(cloneList.remove(0)).fork();
				}
				con.print("Press Enter");
				con.nextLine();
			}else if(input.equals("3")) return;
		}
	}
}
