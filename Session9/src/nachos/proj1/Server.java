package nachos.proj1;

public class Server {
	private MyNetworkLink mnl;
	private MyConsole console;
	public Server(MyNetworkLink mnl) {
		this.mnl = mnl;
		console = new MyConsole();
		console.println("Server Address: " +Integer.toString(this.mnl.getAddress()));
		while(true) {//nunggu untuk input selamanya
			console.print("Press 1 to see all received string");
			String s = console.nextLine();
			if(s.equals("1")) viewString();
		}
	}
	
	private void viewString() {
		int count = 1;
		for (String s : mnl.getStringList()) {
			console.println(Integer.toString(count++)+". "+s);
		}
	}

}
