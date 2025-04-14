package coding;
import java.util.*;
public class reverseSentence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
	    String sentence = sc.nextLine();
	    // reversing the words in a sentence
	    String[] words = sentence.split(" ");
	    String reversedSentence = " ";
	    for(int i=words.length-1; i>=0; i--) {
	    	reversedSentence +=words[i];
	    	if(i!=0) {
	    		reversedSentence += " ";
	    	}
	    }
		System.out.println("The reversed sentence is");
		System.out.println(reversedSentence);
		
	}

}
