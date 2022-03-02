package nachos.proj1;

import java.util.Vector;

import nachos.threads.KThread;
import nachos.threads.ThreadQueue;

public class Queue extends ThreadQueue{
	Vector<KThread> queue = new Vector<>();
	public Queue() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void waitForAccess(KThread thread) {
		// TODO Auto-generated method stub
		queue.add(thread);
	}
	@Override
	public KThread nextThread() {
		// TODO Auto-generated method stub
		if(queue.isEmpty()) return null;
		return queue.remove(0);
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
