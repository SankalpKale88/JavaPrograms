package trickyquestions;

public class OverrideInt {
	
	class A
	{
	    void method(int i)
	    {
	        //method(int)
	    }
	}
	 
	class B extends A
	{
	   // @Override
	    void method(Integer i)
	    {
	        //method(Integer)
	    }
	}
}
