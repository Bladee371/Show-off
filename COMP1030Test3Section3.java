/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclasspoststrike;

import java.util.Scanner;
import static sun.font.GlyphLayout.done;

/**
 *  19 marks total
 * @author JWright
 */
public class COMP1030Test3Section3 {
    public static void main(String[] args)
    {
        /**
         * Question 1 - display your name and student number on the screen
         * 1 Mark
         */
        System.out.println("~~~~~~~~~~~~~~~~ Question 1 ~~~~~~~~~~~~~~~~");
        System.out.println("Name: Erik Turchi  Student Number: 200369051");
        
        /**
         * Question 2 - Continuously ask the user for a word until they enter the 
         * word "done".
         * 1 mark for prompting the user
         * 1 mark for creating the proper logic to keep asking the user for input
         * 
         * 2 marks total
         */
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~ Question 2 ~~~~~~~~~~~~~~~~");
        
      /**  
        System.out.println();
        String word = null;
        String Correct = "done";
        do
                {                
                    System.out.print("Enter a word: ");
                    word = keyboard.nextLine();               
                }
        while( word!=Correct );
        System.out.println();
      */  
      
        /**
         * Question 3 - Using an array, store the following words in order, 1 word per position
         * in the Array.  Note: nothing should be displayed to the screen
         * 
         * "Without requirements or design, programming is the art of adding bugs to an empty text file."
         * 1 Mark
         */
        System.out.println("\n~~~~~~~~~~~~~~~~Question 3 - no screen output for this question ~~~~~~~~~~~~~~~~");
        String wordsInOrder[] = {"Without", "requirements", "or", "design,","programming"
                , "is", "the", "art", "of", "adding", "bugs", "to", "an", "empty", "text", "file." };
       
        /**
         * Question 4 - using a for loop display the words to the screen on 1 line.
         * 2 Marks 
         */
         System.out.println("\n~~~~~~~~~~~~~~~~Question 4~~~~~~~~~~~~~~~~");
         
           for (int i = 0; i<wordsInOrder.length; i++)
        {
             System.out.printf("%s ",wordsInOrder[i]);
        }
         
         /**
          * Question 5 - Prompt the user to enter the cost of their new computer.
          * Send that cost to a method (write the method at the bottom of this file under the comment
          * for question 5).  The method should RETURN the tax (13%) on that computer.  Here in the main method
          * display the computer cost, tax and total cost for everything
          * 1 Mark for prompting the user and sending the info to the method          
          * 1 Mark for the method header
          * 1 Mark for returning the correct value from the method
          * 1 Mark for displaying the correct output
          * 
          * 4 Marks total
          */
        System.out.println("\n~~~~~~~~~~~~~~~~Question 5 ~~~~~~~~~~~~~~~~");
         
        
        System.out.println();
        System.out.print("Please enter the Total cost before tax of your PC: ");
        double cost = keyboard.nextDouble();
        System.out.printf("The Cost before Tax Was: %.2f%n", cost);
        System.out.printf("The tax on the PC was: %.2f%n", taxCalculator(cost));
        System.out.printf("The total of the PC including tax was: %.2f%n", taxCalculator(cost) + cost);  
        taxCalculator(cost);
        /**
         * Question 6 - Create a 4x2 array that can hold player names
         * and the amount of goals they have scored in this season.
         * 
         * In the space below, parse over the array to display names and scores.
         * As an example, the output could be 
         * 
         * Player       Goals
         * Daffy Duck   10
         * Mickey Mouse 15
         * Goofy        6
         * Mini Mouse   16
         * 
         * Marks 3 marks (1 mark for defining the array, 1 mark for adding content to the array, 1 mark for displaying
         * a table using formatted print and specific column widths)
         */
         System.out.println("\n~~~~~~~~~~~~~~~~Question 6~~~~~~~~~~~~~~~~");
        
         
         String chart[][] = {{"Jesus ", "9000"},
                             {"Erik ", "22"},
                             {"Lyka ", "36"},
                             {"Carlos ", "25"},
                             {"Hazard ", "250"}};
         System.out.printf("%-6s %-6s"
                , "Name", "Goals");  
         System.out.println();
         
        for (int row =0; row<=1 ; row++)
        {
            for (int col =0; col<=4; col++)
            {
                System.out.print(chart[row][col]);
            }
            System.out.println();
        }
         
       
        /**
         * Question 7 - Write a method that can receive the 2 dimensional array from question 6.  The method
         * should analyze all of the players and display to the screen the player with the lowest goals scored
         * 
         * 3 Marks (1 mark for the method header, 1 marks for the method contents, 1 mark for properly calling the method)
         */
         System.out.println("\n~~~~~~~~~~~~~~~~Question 7~~~~~~~~~~~~~~~~");
         
        
        lowestGoals(chart);
        /**
         * Question 8 - using the 2 dimension array from question 6, write the chart to a file called "players.txt"
         * 3 Marks (1 mark for creating a txt file, 1 mark for adding formatted output to the file, 1 mark for closing the
         * file properly)
         */
         System.out.println("\n~~~~~~~~~~~~~~~~Question 8~~~~~~~~~~~~~~~~");
            
         System.out.print("Enter a file name: ");
         String nameOfFile = keyboard.nextLine();
         
         
    }   //end of the main method

    /**
     * Method For Question 7
     */
     public static void lowestGoals(String chart[][])
        {
            
             
        }
    
    
    
    
    
    /**
     * Question 5 - put the method here
     */
    public static double taxCalculator(double cost)
    {
        double taxPercent = 0.13;
        double tax = cost * taxPercent;
        return tax;
    }
   
    
}   //end of the class