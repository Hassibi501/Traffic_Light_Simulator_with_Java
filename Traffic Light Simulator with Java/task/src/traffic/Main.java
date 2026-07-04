package traffic;
import java.util.Scanner;

public class Main {
  public static void intErrorHandling(Scanner scan) {
    while (!scan.hasNextInt()) {
      System.out.print("Incorrect Input please try again and input positive numbers: ");
      scan.next();
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int userInput = 999;


    System.out.print("Welcome to the traffic management system.\n");


    System.out.print("Input the number of roads: ");

    intErrorHandling(scan);

    int numOfRoad = scan.nextInt();
    while (true) {
      if (numOfRoad <= 0) {
        System.out.print("Incorrect Input please try again and input positive numbers: ");
        numOfRoad = scan.nextInt();
      }
      else{
        break;
      }
  }

    System.out.print("Input number of intervals: ");


    intErrorHandling(scan);


    int numOfInterval = scan.nextInt();
    while (true) {
      if (numOfInterval <= 0) {
        System.out.print("Incorrect Input please try again and input positive numbers: ");
        numOfInterval = scan.nextInt();
      }
      else{
        break;
      }
    }

    for (int i = 0; i < 50; i++){
      System.out.println();
    }

    while (userInput != 0){
      System.out.print("Menu:\n" + "1. Add road\n" + "2. Delete road\n" + "3. Open system\n" + "0. Quit");
      intErrorHandling(scan);
      userInput = scan.nextInt();
      if (userInput == 1) {
        System.out.print("Road added\n");
      }// if
      else if (userInput == 2) {
        System.out.print("Road deleted\n");
      }
      else if (userInput == 3) {
        System.out.print("System opened\n");
      }
      else if (userInput == 0) {
        System.out.print("Bye!");
        break;
      }
      else {
        System.out.print("Incorrect option. Try again.\n");
      }
    }// while

    // Why does this not work? How to do this with one loop?
//    System.out.print("Input the number of roads: ");
//    numOfRoad = scan.nextInt();
//    System.out.print("Input number of intervals: ");
//    numOfInterval = scan.nextInt();
//    while (true) {
//      if (numOfRoad <= 0 || numOfInterval <= 0) {
//        System.out.print("Incorrect Input please try again and input positive numbers: ");
//        numOfRoad = scan.nextInt();
//      }
//      else{
//        break;
//      }
//    }


  }
}
