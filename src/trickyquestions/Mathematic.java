package trickyquestions;

public class Mathematic {
	
	static int methodOne(int i)
    {
        return methodTwo(i *= 11);
    }
 
    static int methodTwo(int i)
    {
        return methodThree(i /= 11);
    }
 
    static int methodThree(int i)
    {
        return methodFour(i -= 11);
    }
 
    static int methodFour(int i)
    {
        return i += 11;
    }
 
    public static void main(String[] args)
    {
        System.out.println(methodOne(11));
        
        int i = 10 + + 11 - - 12 + + 13 - - 14 + + 15;
        
        System.out.println(i);
    }
}
