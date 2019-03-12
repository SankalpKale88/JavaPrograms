package threadtest;

import java.util.Vector;

public class ProducerConsumer {

	
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>();
		Producer p = new Producer(vector);
		Consumer c = new Consumer(vector);
		Thread producer = new Thread(p);
		Thread consumer = new Thread(c);
		Thread consumer1 = new Thread(c);
		
		consumer.setName("Consumer1");
		consumer1.setName("Consumer2");
		producer.start();
		consumer.start();
		consumer1.start();
	}
}
