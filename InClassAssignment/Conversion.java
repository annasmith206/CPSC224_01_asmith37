import java.util.*;

public class Conversion{
  public static void main(String args[]) {
    Scanner console = new Scanner(System.in);
    double dist;
    String choice;

    // Gets distance from user
    System.out.println();
    System.out.print("Enter a distance in meters: ");
    dist = console.nextDouble();

    // Check for negative input
    while(dist < 0)
    {
      System.out.print("Negative numbers are invalid. Please try again: ");
      dist = console.nextDouble();
    }

    // Prints out menu until user enters 4
    do{
      menu();
      choice = console.next();
      if (choice.equals("4")){}
      else if (choice.equals("1"))
        showKilometers(dist);
      else if (choice.equals("2"))
        showInches(dist);
      else if (choice.equals("3"))
        showFeet(dist);
      else
        System.out.println("Invavlid input. Please Try again.");
      System.out.println();
    } while (!choice.equals("4"));

    // Prints after user has exited the program
    System.out.println("Bye!");
  }

//------------------------------- Helper Methods -------------------------------

  // Converts from meters to kilometers
  public static void showKilometers(double dist){
    System.out.print((int) dist + " meters is " + (dist * 0.001) + " kilometers.");
    System.out.println();
  }

  // Converts from meters to inches
  public static void showInches(double dist){
    System.out.print((int) dist + " meters is " + (dist * 39.37) + " inches.");
    System.out.println();
  }

  // Converts from meters to feet
  public static void showFeet(double dist){
    System.out.print((int) dist + " meters is " + (dist * 3.281) + " feet.");
    System.out.println();
  }

  // Prints the menu
  public static void menu(){
    System.out.println("1. Convert to kilometers");
    System.out.println("2. Convert to inches");
    System.out.println("3. Convert to feet");
    System.out.println("4. Quit the program\n");
    System.out.print("Enter your choice: ");
  }
}
