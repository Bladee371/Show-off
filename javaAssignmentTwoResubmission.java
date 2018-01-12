package inclasspoststrike;
/**
 *
 * @author erikt
 */
public class javaAssignmentTwoResubmission {  
    //define static strings to be used inside program
    static String students[] = {"Name", "Course 1", "Course 2", "Course 3", "Course 4", "Course 5"};;
    static String marks[][] =   {{"Erik", "40", "30", "56", "22", "42"},
                             {"PG13", "80", "60", "68", "82", "76"},
                             {"Jesus", "99", "99", "99", "99", "99"},
                             {"Mark", "40", "33", "16", "32", "22"},
                             {"Lyka", "90", "92", "89", "97", "92"}};;
    
    public static void main(String[] args)
    {
           //call methods outside main
        studentNames();
        chartOfMarks(marks, students);
        highestMark(marks);
        lowAverageWarning(marks);
       }
            //end of main method   
    
    //create a method to store static data of students and thier five grades as well as the header for the chart
    public static void studentNames()
    {
             //declare array and name the columns and student row
    
    }
    //end kf student names method
    
     //create a method displaying the highest average in the class with a line of text displaying name and avg %
public static void highestMark(String marks[][])
{
    //declare average double to pass grades through
    double average[] = new double[5];
    //declare int to store grades and calculate average with
    int y=0;
    //create nested forloop to read all data and calculate average
    for (int avg = 0; avg<=4; avg++)
    {
        for (int col = 1; col<=5; col++)
        {
            y+=Double.parseDouble(marks[avg][col]);  
        }
        average[avg]=y/5;
        y=0;
    }
    //create forloop to calculate the highest grade and print it out
    int calc=0;
    double a = average[calc];
    for (calc = 1; calc<=4; calc++)
    {
     if(a<average[calc])
        {
         a = average[calc];
        } 
    }
    //create array for names of students(we all know jesus is going to win)
    String studentNames[] = {"Erik", "PG13", "Jesus", "Mark", "Lyka"};
    int anyName = 0;
    //create forloop comparing double average with the names array
    for (int name = 0; name<=4; name++)
    {
        if (a == average[name])
        {
            anyName = name;
        }
    }
    System.out.printf("The highest mark in the grade belonged to(you guessed it): %s , with an average of %.2f%n", studentNames[anyName], a );
}
//end of average method

    //create a method for outputting students below 50% average with a line of text of their name and avg
public static void lowAverageWarning(String marks[][])
{
    //declare average double to pass grades through
    double average[] = new double[5];
    //declare int to store grades and calculate average with
    int y=0;
    //create nested forloop to read all data and calculate average
    for (int avg = 0; avg<=4; avg++)
    {
        for (int col = 1; col<=5; col++)
        {
            y+=Double.parseDouble(marks[avg][col]);  
        }
        average[avg]=y/5;
        y=0;
    }
    String studentNames[] = {"Erik", "PG13", "Jesus", "Mark", "Lyka"};
    int anyName = 0;
    //create forloop comparing double average with the names array
    for (int name = 0; name<=4; name++)
    {
        if (average[name]<50)
        {
         System.out.printf("%s is a concern, with an average of only %.2f%n", studentNames[name], average[name] );   
        }
    }
}
    //end of low average method

    //create a method to display the chart of marks
public static void chartOfMarks(String marks[][], String students[])
{
    //create forloop to display marks of students into a graph
    for (int top = 0; top<=5; top++)
    {
        System.out.print(students[top]+'\t');
    }
    System.out.println();
    //create nested forloop for displaying rows and columns in a chart
    for (int row = 0; row<=4; row++)
    {
        for (int col = 0; col<=5; col++)
        {
            System.out.print(marks[row][col]+'\t'+'\t');
        }
        System.out.println();
    }
}
  //end of chart method             
            
    }
//end of program (dont get lost!)
    
    
    
