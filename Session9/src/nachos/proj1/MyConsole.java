package nachos.proj1;

import nachos.machine.Machine;
import nachos.machine.SerialConsole;
import nachos.threads.Semaphore;

public class MyConsole {
	
	private SerialConsole sercon = Machine.console();
	private Semaphore sem = new Semaphore(0);
	private int temp;
		
	public MyConsole() {
		sercon.setInterruptHandlers(new Runnable() {//recv
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				temp = sercon.readByte();
				sem.V();
			}
		}, new Runnable() {//send
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				sem.V();
			}
		});		
	}
	
	public void print (String s) {
		for(char c: s.toCharArray()) {
			sercon.writeByte(c);
			sem.P();
		}
	}
	
	public void println(String s) {
		print(s+"\n"); //cara 1
//		print(s);//cara 2
//		sercon.writeByte('\n');
//		sem.P();
	}
	
	public String nextLine() {
		String tempStr = new String();
		char tempChr;
		do {
			sem.P();
			tempChr = (char) temp;
			if(tempChr !='\n') tempStr += tempChr;
		} while (tempChr != '\n');
		return tempStr;
	}
	
	public int nextInt() {
		int tempInt;
		try {
			tempInt = Integer.parseInt(nextLine());
		} catch (Exception e) {
			tempInt = Integer.MIN_VALUE;
		}
		return tempInt;
	}
	
	public double nextDouble() {
		double tempDouble;
		try {
			tempDouble = Double.parseDouble(nextLine());
		} catch (Exception e) {
			tempDouble = -999;
		}
		return tempDouble;
	}
}
