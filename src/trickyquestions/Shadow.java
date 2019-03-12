package trickyquestions;

public class Shadow {



public static void main(String S[]) {
    S1 s1 = new S1();
    S2 s2= new S2();
    System.out.println("Print S1 " + s1.S);  
    System.out.println("Print S2 " + s2.S);
    s1=s2;
    System.out.println("Print S1 now " + s1.S) ;
    System.out.println( "Print S1.gets() now " + s1.gets());
}
}
class S1{  
    public String S= "S1";
    public String gets() {
        return S;
    }
}
class S2 extends S1 {
    public String S = "S2";
    public String gets() {
        return S;
    } 
}

