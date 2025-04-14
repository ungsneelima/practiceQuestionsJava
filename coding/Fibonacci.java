package coding;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms you want ");
		int a = sc.nextInt();
		int firstNum = 0;
		int secondNum = 1;
		for(int i = 1; i <= a; i++) {
			System.out.print(firstNum+" ");
			int next = firstNum+secondNum;
			firstNum = secondNum;
			secondNum = next;
			
		}
		System.out.println();

	}

}
