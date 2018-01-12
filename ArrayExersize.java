package inclasspoststrike;
import java.util.Scanner;
/*
 *
 * @author erikt
 */
public class ArrayExersize {
    public static void main(String[] args)
    {
        int[] num = new int[4];
        Scanner keyboard = new Scanner(System.in);
        //enter 4 nums into array
        for (int i = 0; i<num.length; i++)
        {
            System.out.println("Enter 4 nums:");
            num[i] = keyboard.nextInt();
        }
       System.out.printf("the largest number is: %d", max(num));
    }
    //method 'max' to return largest num in array
    public static int max(int[] big)
    {
        int highest = big[0];
        for(int x = 1; x>=big.length; x++)
        {
          if (big[x]>highest)
              highest = big[x];
        }
        return highest;
    }
}
