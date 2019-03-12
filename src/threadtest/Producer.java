package threadtest;


import java.util.Vector;


public class Producer implements Runnable{
	
	private Vector<Integer> vector;
	int element=0;
	
	public Producer(Vector vector) {
		super();
		this.vector = vector;
	}

	private void produce() throws InterruptedException{
		synchronized (vector) {
			if(vector.capacity() > 10){
				System.out.println("Producer is full");
				vector.wait();
				
			}
			
			element = element+1;
			vector.add(element);
			System.out.println("Producer"+element);
			vector.notify();
		}
		
	}

	@Override
	public void run() {
		System.out.println("Producer started");
		try {
			while(true){
				Thread.sleep(100);
			produce();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
