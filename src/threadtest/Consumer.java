package threadtest;

import java.util.Vector;

public class Consumer implements Runnable{
	
	private Vector vector;
	
	
	public Consumer(Vector vector) {
		super();
		this.vector = vector;
	}

	public void consume() throws InterruptedException{
		synchronized (vector) {
			while(vector.isEmpty()){
				System.out.println("Vector is empty");
				vector.wait();
			}
			
			System.out.println(Thread.currentThread().getName() +  vector.remove(0));
			vector.notify();
		}
		
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ " started");
		try {
			while(true){
			Thread.sleep(200);
			consume();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
