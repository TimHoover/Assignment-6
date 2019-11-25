/**
* Client program to test our StudentGrades class.
*
*/
import java.util.*;
import java.util.Random;
public class GradesTest{

  public static void main(String[] args) {

    //instasiate the Scanner
    Scanner keyboard = new Scanner(System.in);

    // Test #1: Testing studentGrades(int) constructor
    System.out.println("\nTest #1: Testing studentGrades(int) constructor.");
    System.out.println("------------------------------------------------");
    StudentGrades testClass1 = new StudentGrades(5);
    System.out.println("\nExpected: [0, 0, 0, 0, 0]");
    System.out.print("  Actual: " + displayArray(testClass1.getGrades()));
    System.out.println();

    // Test #2: Testing studentGrades(int) constructor
    System.out.println("\nTest #2: Testing studentGrades(int[]) constructor.");
    System.out.println("--------------------------------------------------");
    StudentGrades testClass2 = new StudentGrades(new int[] {60,70,80});
    System.out.println("\nExpected: [60, 70, 80]");
    System.out.print("  Actual: " + displayArray(testClass2.getGrades()));

    //Test #3: Testing setGrades(int[]) : void
    System.out.println("\nTest #3: Testing setGrades(int[]) : void");
    System.out.println("----------------------------------------");
    StudentGrades testClass3 = new StudentGrades(15);
    testClass3.setGrades(new int[] {99,88,77,66,55});
    System.out.println("\nExpected: [99, 88, 77, 66, 55]");
    System.out.print("  Actual: " + displayArray(testClass3.getGrades()));


    //Test #4: Testing sortedGrades() : int[]
    System.out.println("\nTest #4: Testing sortedGrades() : int[]");
    System.out.println("----------------------------------------");
    System.out.println("Expected: [55, 66, 77, 88, 99]");
    System.out.print("  Actual: " + displayArray(testClass3.sortedGrades()));

    //System.out.print(displayArray(testClass3.sortedGrades()));

    //Test #5: Testing highestGrade(): int
    System.out.println("\nTest #5: Testing highestGrade(): int");
    System.out.println("------------------------------------");
    System.out.println("Expected: 99");
    System.out.println("  Actual: "+ testClass3.highestGrade());

    //Test #6: Testing averageGrade(): int
    System.out.println("\nTest #6: Testing averageGrade(): int");
    System.out.println("------------------------------------");
    System.out.println("Expected: 77.00");
    System.out.printf("  Actual: %.2f%n", testClass3.averageGrade());

    //Test #7: Testing toString() : String
    System.out.println("\nTest #7: toString() : String");
    System.out.println("------------------------------");
    System.out.println("Expected: the above array formatted properly.");
    System.out.println(testClass3);
  }

  public static String displayArray(int[] a){
    String result = "[";
    for(int i = 0; i < a.length; i++){
        result += a[i];
        if (i < a.length - 1){
          result += ", ";
        }
    }
    result += "]\n";
    return result;
  }



}
