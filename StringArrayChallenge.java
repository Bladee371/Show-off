package inclasspoststrike;
import java.util.Scanner;
public class StringArrayChallenge {
    //prompt user for string and display it in reverse
    //use string method.charAt()
    public static void main(String[] args)
    {
    Scanner key = new Scanner(System.in);
    System.out.println("Please enter a word, im not gunna do anything to it dont worry >:w");
    String word = key.nextLine();
    
  
    for (int x = word.length()-1; x>=0; x--)
    {
       System.out.print(word.charAt(x));
    }
    
    }
}
