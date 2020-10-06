import java.util.Scanner;
/**
 * Asks user for number between 1 and 10 and prints out that number of stars
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user to input a number between 1 and 10
    System.out.println("Please enter a number between 1 and 10");
    // create a variable for user input
    int integer = input.nextInt();

    for(int count = 1; count <= integer; count++){
      System.out.print("*");
    }
    
  }
}
