package nachos.proj1;

import nachos.machine.Machine;

public class MainSystem {
	private MainConsole console;
	private int count = 0;
	private long getTime() {
		return Machine.timer().getTime();
	}
	private String getTimeinString() {
		return Long.toString(Machine.timer().getTime());
	}
	public MainSystem() {
		Machine.timer().setInterruptHandler(new Runnable() {
			
			@Override
			public void run() {
				if(getTime()%1000000 == 0) {//semua print kecuali di interrupt harus console kalau di interrupt pake sysou
					System.out.println("COUNT : " + (++count));
				}
				
			}
		});
		console = new MainConsole();
//		console.println(console.scan());
		//karena return int dan error maka harus di integer.tostring
//		console.println(Integer.toString(console.scanInt()));
//		console.println(String.format("--%d--",console.scanInt()));
		console.println("welcome please input a number!");
		console.println(Integer.toString(console.scanInt()));
		console.println("Program is finished");
		console.println(getTimeinString());
		//1. ada print dengan comsole 4660
		//2. tidak ada isi 2130
//		System.out.println("world calss university");
		//tick akan 2130 karena tidak ke increment kalau tidak diinterrupt
	}

}
