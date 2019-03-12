package threadtest;

public class TestThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		SimpleTask task = new SimpleTask();
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		Thread t3 = new Thread(task);
		Thread main = Thread.currentThread();
		t1.setName("pahla");
		t2.setName("dusra");
		t3.setName("tisra");
		
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		main.join();
	}
}
