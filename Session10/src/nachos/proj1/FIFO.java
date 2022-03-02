package nachos.proj1;

import java.util.Vector;

import nachos.threads.KThread;
import nachos.threads.ThreadQueue;

public class FIFO extends ThreadQueue {
	
	Vector<KThread> threads = new Vector<KThread>();
	
	@Override
	public void waitForAccess(KThread thread) {
		// TODO Auto-generated method stub
		//akan tambahin semua proses dlu nanti akan di proses
		threads.add(thread);
	}

	@Override
	public KThread nextThread() {
		// TODO Auto-generated method stub
		// p1 p2 p3
		// 0  1  2
		//jika vector kosong maka return null
		if(threads.isEmpty()) return null;
		//akan remove index 0 karena dia fifo masuk pertama keluar pertama
//		return threads.remove(0);
		//untuk lifo karena dia index yang masuk terakhir yang keluar pertama maka menggunakan size thread yang dikurangi 1
		return threads.remove(threads.size()-1);
	}

	@Override
	public void acquire(KThread thread) {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

}
