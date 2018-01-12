/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclasspoststrike;

import java.util.Scanner;

/**
 *
 * @author krn4293
 */
public class assignmentTwo {


    public static void main(String[] args)
    { 
        int a = 1;
        Scanner keyboard = new Scanner(System.in);
        
        /**
         * 1.  Using a while loop, display the numbers 1-100 on the screen - 1 # on each line
         */
        System.out.print("First Question");
        System.out.println();
        while( a<=100 )
                {
                    System.out.println(a);
                    a++;               
                }
        
        /**
         * 2.  Using a while loop, display the numbers 2-100 on the screen
         *     going up in units of 2.  For example 2, 4, 6, 8 ... 96, 98, 100
         */
        System.out.println();
        System.out.print("Second Question");
        System.out.println();
        a = 2;
        while( a<=100 )
                {                
                    System.out.println(a);
                    a+=2;               
                }  
        
        /**
         * 3.  Using a while loop, display the numbers 100-1 on the screen
         *     going down in units of 5.  For example 100, 95, 90, 85...10, 5
         */
        System.out.println();
        System.out.print("Third Question");
        System.out.println();
        a = 100;
        while( a>=1 )
                {                
                    System.out.println(a);
                    a--;               
                }

        

        /**
         * 4.  Using a while loop, ask the user to enter a number, continue
         *     asking for a number until the user enters the number 10
         */
        System.out.println();
        System.out.print("Fourth Question");
        System.out.println();
        a = 0;
        while( a!=10 )
                {                
                    System.out.print("Enter a number: ");
                    a = keyboard.nextInt();               
                }
        
        
                if ( word == Correct )
                {                
                    System.out.println("Enter a word: ");
                    word = keyboard.nextLine();               
                } else
                        {
                        System.out.println("Correct!");
                        } 
        
        /**
         * 5.  Using a do...while loop, ask the user to enter a number, continue
         *     asking for a number until the user enters the number 15
         */
        System.out.println();
        System.out.print("Fifth Question");
        System.out.println();
        a = 15;
        do
                {                
                    System.out.print("Enter a number: ");
                    a = keyboard.nextInt();               
                }
        while( a!=15 );
        
        
        /**
         * 6.  Using a for loop, display the numbers 1-100 on the screen
         */
        System.out.println();
        System.out.print("Sixth Question");
        System.out.println();
        for (int i = 1; i<=100; i++ )
           System.out.println(i); 

        /**
         * 7.  Using a for loop, display the numbers 2-100 on the screen, going up in steps of 2
         */
        System.out.println();
        System.out.print("Seventh Question");
        System.out.println();
        for (int i = 2; i<=100; i+=2 )
           System.out.println(i); 
        
        
        /**
         * 8.  Using a for loop, display the numbers 100-0 on the screen, going down in steps of 1
         */
        System.out.println();
        System.out.print("Eighth Question");
        System.out.println();
        for (int i = 100; i>=0; i-- )
           System.out.println(i);

        
        /**
         * 9.  Using a for loop, display the numbers 100-0 on the screen, going down in steps of 5
         */
        System.out.println();
        System.out.print("Ninth Question");
        System.out.println();
        for (int i = 100; i>=0; i-=5 )
           System.out.println(i);
        
        
        /**
         * 10. Using the loop style of your choice, write a program that will display the numbers 1-100, where each
         *     number is on it's own line.  
         *      
         *     ->If the number displayed is divisible by 4, write your first name after the number.
         *     ->If the number displayed is divisible by 9, write your last name
         *     ->If the number displayed is divisible by both 4 & 9, write your first name a space and then your last name.
         */
        System.out.println();
        System.out.print("Tenth Question");
        System.out.println();
        for (int i = 1; i<=100; i++ )
            if(i%4==0)
            {
                if(i%9==0)
                {
           System.out.println(i + " Karankumar Patel");
                }
                else
           System.out.println(i + " Karankumar");
            }
            else if(i%9==0)
           System.out.println(i + " Patel");
               
             else
           System.out.println(i);
                 
    }
    
}