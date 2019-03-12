package trickyquestions;

public class FasterForLoop {
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		for(int i = 100000; i > 0; i--) {}
		long end = System.currentTimeMillis() - start;
		
		long start1 = System.currentTimeMillis();
		for(int i = 1; i < 100001; i++) {}
		long end1 = System.currentTimeMillis() - start1;
		
		System.out.println(end);
		System.out.println(end1);
	}
}
