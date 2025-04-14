package coding;
import java.util.*;
public class revWordsInSen {



	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        
        String result = "";
        
        
        for (int i = 0; i < words.length; i++) {
            
            String word = words[i];
            String reversedWord = "";
            
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }
            
           
            result += reversedWord;
            
            
            if (i < words.length - 1) {
                result += " ";
            }
        }
        
       
        System.out.println("Sentence with each word reversed:");
        System.out.println(result);
        
        // Close the scanner
        scanner.close();
    }
}