package inclasspoststrike;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class LabWeek6 {


    public static void main(String[] args)
    {      
        int a = 1;
        Scanner keyboard = new Scanner(System.in);
        
        /**
         * 1.  Using a while loop, display the numbers 1-100 on the screen - 1 # on each line
         */

        System.out.println("first Q");
        System.out.println();
        while ( a<=100 )
        {
            System.out.println(a);
            a++;
        }
        
        /**
         * 2.  Using a while loop, display the numbers 2-100 on the screen
         *     going up in units of 2.  For example 2, 4, 6, 8 ... 96, 98, 100
         */
        
        System.out.println();
        System.out.println("second Q");
        System.out.println();
        a = 2;
        while ( a<=100 ){
            System.out.println(a);
            a+=2;
        }
        /**
         * 3.  Using a while loop, display the numbers 100-1 on the screen
         *     going down in units of 5.  For example 100, 95, 90, 85...10, 5
         */
        System.out.println();
        System.out.println("third Q");
        System.out.println();
        a = 100;
        while ( a>=0 ){
            System.out.println(a);
            a-=5;
        }
        
        /**
         * 4.  Using a while loop, ask the user to enter a number, continue
         *     asking for a number until the user enters the number 10
         */
        System.out.println();
        System.out.println("fourth Q");
        System.out.println();
        a = 0;
        while (a!=10){
            System.out.println("please enter the number 10: ");
            a = keyboard.nextInt();
        }
        
        /**
         * 5.  Using a do...while loop, ask the user to enter a number, continue
         *     asking for a number until the user enters the number 15
         */
        System.out.println();
        System.out.println("fifth Q");
        System.out.println();
        a = 15;
        do{
            System.out.println("enter the number 15: ");
            a = keyboard.nextInt();
           }
        while (a!=15);
   
        /**
         * 6.  Using a for loop, display the numbers 1-100 on the screen
         */
        System.out.println();
        System.out.println("sixth Q");
        System.out.println();
        for (int i = 1; i <= 100; i++ )
        {
            System.out.println(i);
        }
              
        
        
        /**
         * 7.  Using a for loop, display the numbers 2-100 on the screen, going up in steps of 2
         */
        System.out.println();
        System.out.println("seventh Q");
        System.out.println();
        for (int i = 2; i <= 100; i+=2)
        System.out.println(i);
        
        
        /**
         * 8.  Using a for loop, display the numbers 100-0 on the screen, going down in steps of 1
         */
        System.out.println();
        System.out.println("eighth Q");
        System.out.println();
        for (int i = 100; i>=0; i--)
            System.out.println(i);
        
        /**
         * 9.  Using a for loop, display the numbers 100-0 on the screen, going down in steps of 5
         */
        System.out.println();
        System.out.println("ninth Q");
        System.out.println();
        for (int i = 100; i >= 0; i-=5)
            System.out.println(i);
        
        /**
         * 10. Using the loop style of your choice, write a program that will display the numbers 1-100, where each
         *     number is on it's own line.  
         *      
         *     ->If the number displayed is divisible by 4, write your first name after the number.
         *     ->If the number displayed is divisible by 9, write your last name
         *     ->If the number displayed is divisble by both 4 & 9, write your first name a space and then your last name.
         */
    
        System.out.println();
        System.out.println("tenth Q");
        System.out.println();
        for (int i = 1; i <=100; i++)
        if (i%4==0)
        {
           if (i%9==0) 
           {
               System.out.println(i + " Erik Turchi");
           }
           else
               System.out.println(i + " Erik");
        }
           else if(i%9==0)
                System.out.println(i + " Turchi");
           else 
               System.out.println(i);

    }
    
}