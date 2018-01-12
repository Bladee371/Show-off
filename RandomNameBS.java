package inclasspoststrike;
import java.util.Random;
public class RandomNameBS {
     static int a;
     @SuppressWarnings("empty-statement")
    public static void main(String[] args)
    {
        
        Random rand = new Random();
        a = rand.nextInt(1000000)+1;
        System.out.printf("The random number is %d%n", a );
       
        for(int x=1; x<=a; x++)
        {
          
            System.out.println("My name is Erik");
            
        }
    }
}
