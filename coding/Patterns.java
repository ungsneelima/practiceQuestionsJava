package coding;
import java.util.*;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int a = scanner.nextInt();
		
		/*Right angled triangle using *
		 * for(int i=1; i<=a; i++) { for(int j=1; j<=i; j++) { System.out.print("*"); }
		 * System.out.println(); }
		 */
		
		/*Right angled triangle using A
		 * for(int i=1; i<=a; i++) { for(int j=1; j<=i; j++) { System.out.print("A"); }
		 * System.out.println(); }
		 */
		
		/* Square outline pattern
		 * for(int i=1; i<=a; i++) { for(int j=1; j<=a; j++) {
		 * 
		 * if( i==1 || i==a || j==1 || j==a) { System.out.print("*"); } else {
		 * System.out.print(" "); } }
		 * 
		 * System.out.println(); }
		 */
		
		/*1 22 333 4444 55555 
		 * for(int i=1; i<=a; i++) { for(int j=1; j<=i; j++) { System.out.print(i); }
		 * System.out.println(); }
		 */
		
		/*1 12 123 1234 12345
		 * for(int i=1; i<=a; i++) { for(int j=1; j<=i; j++) { System.out.print(j); }
		 * System.out.println(); }
		 */
		
		/*1 23 456 78910 1112131415
		 * int number = 1; for(int i=1; i<=a; i++) { for(int j=1; j<=i; j++) {
		 * System.out.print(number); number++; } System.out.println(); }
		 */
	}

}
