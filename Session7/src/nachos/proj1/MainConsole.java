package nachos.proj1;

import nachos.machine.Machine;
import nachos.machine.SerialConsole;
import nachos.threads.Semaphore;

public class MainConsole {
	private SerialConsole sercon;
	private Semaphore sem;
	private char c;
	
	public MainConsole() {
		sercon = Machine.console();
		//kalau mau output dan input harus pake semaphore
		sem = new Semaphore(0);
		//1. buat object runnable sebagai anon inner type
		//2. buat anon inner typenya di dalam method handler untuk set interrupt handler
		sercon.setInterruptHandlers(new Runnable() {
			
			@Override
			public void run() { //recv
				c = (char)sercon.readByte();//nampung int jadi harus di typecast
				sem.V();
				
			}
		}, new Runnable() {
			
			@Override
			public void run() { //send
				sem.V();
			}
		});
	}
	public String scan() {
		String s = new String();
		do {
			sem.P();//pause dulu untuk scan 
			if(c!='\n') s +=c;
		} while (c!='\n');
		return s;
	}
	public int scanInt() {
		String s = scan();
		int num;
		try {
			num = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			num = Integer.MIN_VALUE;
		} //try catch dengan cepat : di blok dlu yang mau di try catch lalu alt shift z
		return num;
	}
	public void print(String s) {
		for (char c : s.toCharArray()) {
			sercon.writeByte(c);
			sem.P();
		}
	}
	
	public void println(String s) {
		print(s);
		sercon.writeByte('\n');
		sem.P();
	}

}
