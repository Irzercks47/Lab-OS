package nachos.proj1;

import java.util.Vector;

import nachos.threads.KThread;

public class Main {
	private MyConsole console = new MyConsole();
	private Vector<Activity> activityVector = new Vector<>();
	public Main() {
		//to do list
		//nama aktivitas - waktu
		//mandi - 5s
		//makan - 2s
		//nonton - 1s
		
		//menu
		Integer menu= 0;
		while (true) {			
			do {
				console.println(" 1. Add Activity ");
				console.println(" 2. Do Activity ");
				console.print(" >> ");
				menu = console.nextInt();
			} while (menu < 1 || menu > 2);
			switch (menu) {
			case 1:
				addActivity();
				break;
			case 2:
				doActivity();
				break;
			default:
				break;
			}
		}
	}
	private void doActivity() {
		//mandi - 5s
		//makan - 2s
		//nonton - 1s
		//kita juga harus hapus dari main vectornya juga
		//activity | KThread
		while(!activityVector.isEmpty()) {
			//fork untuk ngerun class activity nya
			new KThread(activityVector.remove(0)).fork();
		}
		
	}
	private void addActivity() {
		//name and time
		String name;
		Integer time;
		
		console.println(" Activity Name: ");
		name = console.nextLine();
		console.println(" Activity Time: ");
		time = console.nextInt();
		
		activityVector.add(new Activity(name, time));
		
	}

}
