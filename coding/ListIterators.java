package coding;
import java.util.*;
public class ListIterators {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Neelima");
		names.add("Anjani");
		names.add("Siri");
		names.add("Geetha");
		ListIterator<String> itr = names.listIterator();
		System.out.println("Forward Traversing:");
		while (itr.hasNext()) {
			System.out.println(itr.next()+ "  ");
		}
		System.out.println();
		System.out.println("Backward Traversing :");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous()+ "  ");
		}
	}
}

