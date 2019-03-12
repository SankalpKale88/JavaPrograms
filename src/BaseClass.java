
public class BaseClass {

	public void hello(int a){
		System.out.println("Base");
	}
	
	public void hello(int a,int b){
		try{
		System.out.println("Base");
		}finally{
			System.out.println("hello");
		}
	}

}
