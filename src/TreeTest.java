import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TreeTest {

	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<Integer>();
		s.add(4);
		s.add(1);
		s.add(5);
		
		Iterator<Integer> i = s.iterator();
		while (i.hasNext()) {
			Integer integer = (Integer) i.next();
			System.out.println(integer);
		}
	}
}
