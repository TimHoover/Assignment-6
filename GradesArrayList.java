/**
* Client program to use StudentGrades class with ArrayList
*
* @author Tim Hoover
* @version 1.0.0
*/
import java.util.*;
public class GradesArrayList{
  public static void main(String[] args) {
    //insansiate and declare
    Scanner keyboard = new Scanner(System.in);
    int numStudents;


    //1. Instasiate array list with 3 objects
    ArrayList<StudentGrades> listOfClasses;
    listOfClasses = new ArrayList<StudentGrades>(3);


    //2. Construct each of these objects using a value of 4 for the numberOfStudents argument.
    System.out.print("\nEnter the number of students in the course: [User Input]:");
    numStudents = keyboard.nextInt();

    for (int i =0; i < 3 ; i++ ) {
      StudentGrades newClass = new StudentGrades(numStudents);
      newClass.setGrades(randomGrades(numStudents));
      listOfClasses.add(newClass);
    }

    //3. Use the enhanced for loop to display each of the StudentGrades objects as a String to the console.
    System.out.println("\nHere are all " + listOfClasses.size() + " elements of this ArrayList:");
    System.out.println("(Each is populated with a random set of grades.)");
    for (StudentGrades a : listOfClasses ) {
      System.out.println(a);
    }

    //4. Print the value of the final element
    System.out.println("\nLAST ELEMENT BEFORE REMOVE:");
    System.out.println(listOfClasses.get(listOfClasses.size()-1));
    System.out.println("(Size of our array is " + listOfClasses.size() + ")");

    //5. Remove the final StudentGrades objects from the ArrayList.
    System.out.println("Removing the final element...");
    listOfClasses.remove(listOfClasses.size()-1);
    System.out.println("(Size of our array is now " + listOfClasses.size() + ")");

    //6. Trim the ArrayList and print the value of the final element
    System.out.println("\nHere is the value of the (new) final element:");
    System.out.println(listOfClasses.get(listOfClasses.size()-1));
    System.out.println("(Size of our array is " + listOfClasses.size() + ")");
  }
  /**
  * Returns an int array of random numbers 0-100
  *
  */
  public static int[] randomGrades(int length){
    int[] result = new int[length];
    Random r = new Random();
    for (int i = 0; i < length; i++){
      result[i] = r.nextInt(101);
    }
    return result;
  }

}
