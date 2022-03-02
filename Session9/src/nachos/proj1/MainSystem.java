package nachos.proj1;

public class MainSystem {
	private MyConsole console;
	private MyNetworkLink mnl;
	public MainSystem() {
		console = new MyConsole();
		mnl = new MyNetworkLink();
		if(mnl.getAddress()==0) new Server(mnl);
		else new Client(mnl);
//		console.println(console.nextLine());
//		console.println(Double.toString(console.nextDouble()));
	}

}
