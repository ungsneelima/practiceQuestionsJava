package coding;
import java.util.*;
public class AreaOfRec {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = s.nextLine();
		
		
		for(int i=1 ; i< name.length(); i =i+2) {
			System.out.print(name.charAt(i)+ " ");
			System.out.print(i);
		}
		
	}

}
