

public class FinalTest {

	{
		System.out.println("init");
	}
	
	static{
		System.out.println("static");
	}
	
	public FinalTest() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		FinalTest f = new FinalTest();
	}
}
