package inclasspoststrike;
import java.util.Scanner;

/**
 *
 * @author erikt
 */


     /**
        *ask user for time dropped
        *store user response
        *calculate and display height of bridge
        *calculate speed at impact
        *calculate speed in km/h
     **/


public class InClassPostStrike {

    public static void main(String[] args)
    {
   
    double time;
    Scanner keyboard = new Scanner(System.in);
    //prompt value of fall time
    System.out.println("How long was the brick dropping in Seconds: ");
    time = keyboard.nextDouble();

    System.out.printf("The Bridge is %f.1m high%n", calcHeight(time));
    System.out.printf("The brick will be travelling at %.2fm/s at impact %n", calcSpeed(time));
    System.out.printf("Whitch is %.0fKPH%n", convToKPH(calcSpeed(time)));
    
    loopTroop();
    }
    
    /**
    *This method will recieve a time in seconds and calculate the height
    *in whitch the object was dropped. It assumes the object doesnt reach 
    * terminal velocity
    */
    
    public static double calcHeight(double timeFalling)
    {
        //acceleration * time falling^2
        return 9.81*Math.pow(timeFalling, 2);
    }
    
    /**
    *This Method will calculate the speed at impact when
    *an object is dropped. It uses time falling as an
    *input
    **/
    
    public static double calcSpeed(double timeFalling)
    {
        //velocity = sq root of  (2 * distance * acceleration)
        double height = calcHeight(timeFalling);
        return Math.sqrt(2*height*9.81);
    }
    
    
    /**
     * This method converts m/s into km/ph
     */
    
    public static double convToKPH(double speedInMPS)
    {
        return speedInMPS * 3.6;
    }

    public static void loopTroop()
    {
        System.out.printf("%-6s %-10s %-15s %-15s %n"
                , "Time", "Height", "m/s at impact", "kph at impact");
        for (int t=1; t<=60000 ; t++)
        {
            System.out.printf("%3d %7.1f %10.1f %15.0f %n", t, calcHeight(t), calcSpeed(t), convToKPH(calcSpeed(t)));
        }
    }


}
