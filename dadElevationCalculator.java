package inclasspoststrike;
import java.util.Scanner;

/**
 *
 * @author erikt
 */
public class dadElevationCalculator {
    public static void main(String[] args)
    {
        System.out.println("Elevation Calculator");
                Scanner keyboard = new Scanner(System.in);
                                                                                                                                                                                 
        System.out.printf("Please eneter the eleveation above sea level: " + '\n');
        double elevation = keyboard.nextDouble();
        
        System.out.printf("The elevation after the first subratction queue is: %f%n", elevationCalc(elevation));
        System.out.printf("The second pass is: %f%n", secondPass(elevation));
        System.out.printf("The third pass is: %f%n", thirdPass(elevation));
       
    }
    public static double elevationCalc(double elevation)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("please enter the first grade deduction: ");
        double gr1 = keyboard.nextDouble();
        return elevation - gr1;
    }
    
    public static double secondPass(double elevationCalc)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("please enter the second grade deduction: ");
        double gr2 = keyboard.nextDouble();
        return elevationCalc - gr2;
    }
    
    public static double thirdPass(double secondPass)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("please enter the third grade deduction: ");
        double gr3 = keyboard.nextDouble();
        return secondPass - gr3;
    }
    
    
   /* 
    public static void conversionChart()
    {
        System.out.printf("%-2s %-9s %-6s %-5s %n", "#", "elevation", " second", "   third");
        for (int t=1; t<=1 ; t++)
        {
            System.out.printf("%1d %7.1f %10.1f %7.0f %n",t ,elevationCalc(t)
                    , secondPass(elevationCalc(t)), thirdPass(secondPass(elevationCalc(t))));
        }
    }

    */
}
