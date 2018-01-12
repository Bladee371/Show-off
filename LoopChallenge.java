package inclasspoststrike;

/**
 *
 * @author erikt
 */
public class LoopChallenge {
   public static void main(String[] args)
   {    
   }
      
   
        public static void loopTroop()
    {
        System.out.printf("%-6s %-10s %-15s %-15s %n"
                , "Time", "Height", "m/s at impact", "kph at impact");
        for (int t=0; t<=4 ; t++)
        {
            System.out.printf("%3d", t);
        }
    }

}
