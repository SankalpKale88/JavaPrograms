package trickyquestions;

public class FinalyBlockEx {
	
	public static void main(String[] args) {
		boolean choice = true;
		 try { 
		        if (choice) {
		             while (true);
		        } else {
		            System.exit(1);
		        }
		}finally {
			System.out.println("FInaly");
		}
	}
}
