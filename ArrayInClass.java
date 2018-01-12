package inclasspoststrike;

import java.util.Scanner;

public class ArrayInClass {
    public static void main(String[] args)
    {
        String day[] = {"Tuesday","Wensday","Thursday","Friday","Saturday","Sunday"};
        int[] temps = new int[7];
        temps[0] =6;
        System.out.printf("The temperature on monday was %d%n", temps[0]);
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0 ; i<temps.length; i++)
        {
            System.out.printf("please enter the temp:");
            temps[i] = keyboard.nextInt();
        }
        for (int i = 0; i<day.length; i++)
        {
             System.out.printf("%s : %d%n",day[i],temps[i]);
        }
    }
}
