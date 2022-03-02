package nachos.proj1;

import java.util.ArrayList;

import nachos.machine.Machine;
import nachos.machine.MalformedPacketException;
import nachos.machine.NetworkLink;
import nachos.machine.Packet;
import nachos.threads.Semaphore;

public class MyNetworkLink {
	private NetworkLink nl = Machine.networkLink();
	private Semaphore sem = new Semaphore(0);
	private ArrayList<String> stringList = new ArrayList<>();
	public ArrayList<String> getStringList() {
		return stringList;
	}
	public void setStringList(ArrayList<String> stringList) {
		this.stringList = stringList;
	}
	public int getAddress() {
		return nl.getLinkAddress();
	}
	public MyNetworkLink() {
		Runnable receiveInterruptHandler = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Packet p = nl.receive();
				String str = new String(p.contents);
				System.out.println("YOU GOT A NEW MESSAGE");
				stringList.add(str);
				sem.V();
			}
		};
		Runnable sendInterruptHandler = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				sem.V();
			}
		};
		nl.setInterruptHandlers(receiveInterruptHandler, sendInterruptHandler);
	}
	
	public void sendMsg(int destAddr, String msg) {
		Packet p;
		try {
			p = new Packet(destAddr, getAddress(), msg.getBytes());
			nl.send(p);
			sem.P();
		} catch (MalformedPacketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
