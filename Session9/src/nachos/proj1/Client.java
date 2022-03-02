package nachos.proj1;

public class Client {
	private MyNetworkLink mnl;
	private MyConsole console;
	public Client(MyNetworkLink mnl) {
		this.mnl = mnl;
		console = new MyConsole();
		console.println("Client Address: " +Integer.toString(this.mnl.getAddress()));
		while (true) {
			String s = console.nextLine();
			if(!s.isEmpty()) this.mnl.sendMsg(0, s);
		}
	}
}
