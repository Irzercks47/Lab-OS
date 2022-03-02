package nachos.proj1;

import java.util.ArrayList;

import nachos.machine.Machine;
import nachos.machine.NetworkLink;
import nachos.machine.Packet;
import nachos.threads.Semaphore;

public class MyNetworkLink {
	private NetworkLink nl = Machine.networkLink();
	private Semaphore sem = new Semaphore(0);
	
	
	public static ArrayList<Car> carList = new ArrayList<>();
	
	public int getAddr() {
		return nl.getLinkAddress();
	}
	
	public MyNetworkLink() {
		// TODO Auto-generated constructor stub
		Runnable recv = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Packet p = nl.receive();
				String msg = new String(p.contents);
				carList.add(new Car(msg));
				System.out.println("NEW CAR ORDER RECEIVED !");
				sem.V();
			}
		};
		Runnable send = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				sem.V();
			}
		};
		nl.setInterruptHandlers(recv, send);
	}
	public boolean send(int dest,Car c) {
		String data = c.serialize();
		byte[] bytes = data.getBytes();
		try {
			Packet p = new Packet(dest,getAddr(),bytes);
			nl.send(p);
			sem.P();
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}
}
