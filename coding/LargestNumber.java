package coding;
import java.util.Scanner;
public class LargestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second number: ");
		int b = sc.nextInt();
		System.out.println("Enter Third number: ");
		int c = sc.nextInt();
		System.out.println("Enter Four number: ");
		int d = sc.nextInt();
		int max = a; 
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        System.out.println("The Largest number is: " + max);
		sc.close();
	}
}
