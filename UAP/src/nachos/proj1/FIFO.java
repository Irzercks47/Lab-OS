package nachos.proj1;

import java.util.Vector;

import nachos.threads.KThread;
import nachos.threads.ThreadQueue;

public class FIFO extends ThreadQueue {
	
	Vector<KThread> threads = new Vector<KThread>();
	
	@Override
	public void waitForAccess(KThread thread) {
		// TODO Auto-generated method stub
		threads.add(thread);
	}

	@Override
	public KThread nextThread() {
		// TODO Auto-generated method stub
		if(threads.isEmpty()) return null;
		return threads.remove(0);

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
