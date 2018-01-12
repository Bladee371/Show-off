package inclasspoststrike;
//author Erik Turchi

import java.util.Scanner;

public class gradeAssignment {
    //include Scanner
       static Scanner keyboard = new Scanner(System.in);

       public static void main(String[] args)
   { 

     //promp user to enter grades
       System.out.printf("Enter the first grade:  ");
         double num1 = keyboard.nextDouble();
       System.out.printf("Enter the second grade:  ");
         double num2 = keyboard.nextDouble();
       System.out.printf("Enter the third grade:  ");
         double num3 = keyboard.nextDouble();
        System.out.printf("Enter the fourth grade:  ");
         double num4 = keyboard.nextDouble();
        System.out.printf("Enter the fifth grade:  ");
         double num5 = keyboard.nextDouble();

         //Print out the grade and letter assignment of the grade as a string
         System.out.printf("The first grade was: "+num1 + " And the letter grade was: " + Character.toString(gradeLetter(num1)) + '\n' );
         System.out.printf("The second grade was: "+num2 + " And the letter grade was: " + Character.toString(gradeLetter(num2)) + '\n' );
         System.out.printf("The third grade was: "+num3 + " And the letter grade was: " + Character.toString(gradeLetter(num3)) + '\n' );
         System.out.printf("The fourth grade was: "+num4 + " And the letter grade was: " + Character.toString(gradeLetter(num4)) + '\n' );
         System.out.printf("The fifth grade was: "+num5 + " And the letter grade was: " + Character.toString(gradeLetter(num5)) + '\n' );

         //call overall average method to generate the average and declare as a double
         double avg = OverallAverage(num1,num2,num3,num4,num5);
         //print out overall letter grade and average of course in one line
         System.out.printf("The Overall letter grade and Average for all your courses was: " + Character.toString(gradeLetter(avg)) + " : " + avg + '\n');
   }
public static double OverallAverage(double num1, double num2, double num3, double num4, double num5){

    double average = ((num1 + num2 + num3 + num4 + num5) / 5);
    return average;

}

    /**
     *
     * @param grade
     * @return
     */
    public static char gradeLetter(double grade){
 //write logic for grade letter and save as a char
  char result = ' ';
   if(grade < 50) {result = 'F';}
   else if (grade < 60) {result = 'D';}
   else if (grade < 70) {result = 'C';}
   else if (grade < 80) {result = 'B';}
   else if (grade >= 80) {result = 'A';}

   return result;
}

}