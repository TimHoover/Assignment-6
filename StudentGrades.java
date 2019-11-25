/**
* Class encapsulating the concept of student grades.
*
*
*/

public class StudentGrades{

  //attribute to store student grades
  private int[] grades;

  /**
  * Constructor for StudentGrades, Initializes grades to a new array with
  * the specified number of elements. The grade values are zero.
  *
  * @param numberOfStudents This is the total number of students.
  *
  */
  public StudentGrades(int numberOfStudents){
    this.grades = new int[numberOfStudents];
  }

  /**
  * Constructor for StudentGrades, initializes grades to the specified array.
  *
  * @param grades This is an int array containing student grades.
  *
  */
  public StudentGrades(int[] grades){
    this.grades = copyArray(grades);
  }

  /**
  * Private method to create a copy of an array
  *
  * @param toCopy This is the array we are going to copy.
  *
  * @return Returns a copy of the array.
  *
  */
  private int[] copyArray(int[] toCopy){
    int[] copy = new int[toCopy.length];
    for (int i = 0; i < toCopy.length; i++){
      copy[i] = toCopy[i];
    }
    return copy;
  }

  /**
  * Accesor to get the array of grades.
  *
  * @return Returns an int[] containing the grades.
  *
  */
  public int[] getGrades(){
    return copyArray(this.grades);
  }

  /**
  * Mutator to set the array of grades.
  *
  * @param grades An int array of grades.
  *
  */
  public void setGrades(int[] grades){
    this.grades = copyArray(grades);
  }

  /**
  * Method which returns an array containing the values of the
  * grades attribute sorted in ascending order (uses insertion sort).
  *
  * @return Returns an int[] containing the grades in ascending order.
  *
  */
  public int[] sortedGrades(){
    int[] sorted;
    int temp;
    sorted = copyArray(this.grades);
    for (int i = 1; i < this.grades.length; i++){
      for(int j = i; j > 0; j--){
        if (sorted[j] < sorted[j-1]){
          temp = sorted[j];
          sorted[j] = sorted[j-1];
          sorted[j-1] = temp;
        }
      }
    }
    return sorted;
  }

  /**
  * Method which returns the the value of the highest grade in the grades.
  *
  * @return The highest value grade in grades.
  *
  */
  public int highestGrade(){
    return this.sortedGrades()[this.grades.length - 1];
  }

  /**
  * Method which returns the average grade.
  *
  * @return Returns a double representing the average grade.
  *
  */
  public double averageGrade(){
    int sum = 0;
    for (int i = 0; i < this.grades.length; i++){
      sum += this.grades[i];
    }
    return (double) sum / this.grades.length;
  }

  /**
  * Method to return the class as a formatted string.
  *
  * @return Returns the class as a formated string.
  *
  */
  public String toString(){
      String message = "===================\n"
          + "Student       Grade\n"
          + "===================\n";
          for (int i = 0; i < this.grades.length; i++){
            message += String.format("%-3d%15d%n", i + 1, this.grades[i]);
          }
          return message;
  }
}
