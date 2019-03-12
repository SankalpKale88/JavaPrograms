package trickyquestions;

public class CallMethod {

	 int methodOfA()
	    {
	        return (true ? null : 0);
	    }
	 
	 public static void main(String[] args) {
		CallMethod c = new CallMethod();
		c.methodOfA();
	}
}
