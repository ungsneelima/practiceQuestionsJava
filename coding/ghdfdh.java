package coding;
import java.util.*;

public class ghdfdh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the first number: ");
		int a = sc.nextInt();
		int EvenSum = 0;
		int OddProduct = 1;
		for(int i=0; i<= a ; i++) {
			EvenSum += 2 *i;
			
		}
		for(int i=1; i<= a ; i++) {
			OddProduct *= (2*i-1);
			
		}
		System.out.println("The sum of first "+a+ " even numbers is " +EvenSum);
		System.out.println("The product of first "+a+ " odd numbers is " +OddProduct);
	}

}


