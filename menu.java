import java.util.Scanner;

import SarahLibrary.getInput;

public class menu {
  private Scanner input;
  Lab_4 customRecursion = new Lab_4();
  getInput getInput = new getInput();

  public menu() {

    runMenu();

  }

  public void runMenu() {
    input = new Scanner(System.in);
    int choice = 0;
    System.out.println("Welcome to The Recursion Lab!");
    do {
      System.out.println("");
      System.out.println("Please Choose a method:");
      System.out.println("1. twos");
      System.out.println("2. powerOf3");
      System.out.println("3. reverse");
      System.out.println("4. base5");
      System.out.println("5. printWithCommas");
      System.out.println("0. Quit");
      choice = input.nextInt();

      if (choice == 1) {
        System.out.println("");
        int input = getInput.integerSample("Input a number (int):");
        int answer = customRecursion.twos(input);
        System.out.println("The number of twos ("+input+") is "+answer+".");
      } 
      else if (choice == 2) {
        System.out.println("");
        int input = getInput.integerSample("Input a number (int):");
        boolean answer = customRecursion.powerOf3(input);
        if (answer){
          System.out.println(input+" is a powerOf3("+input+").");
        }else{
          System.out.println(input+" is not a powerOf3.");
        }
        
      } 
      else if (choice == 3) {
        System.out.println("");
        int input = getInput.integerSample("Input a number (int):");
        System.out.print("The display of reverse("+input+") is ");
        customRecursion.reverse(input);
        System.out.println(".");
      } 
      else if (choice == 4) {
       System.out.println("");
       int input = getInput.integerSample("Input a number (int):");
       System.out.print("The display of base4("+input+") is ");
       customRecursion.base5(input);
       System.out.println(".");
      } 
      else if (choice == 5) {
        System.out.println("");
        int input = getInput.integerSample("Input a number (int):");
        System.out.print("The display of printWithCommas("+input+") is ");
        customRecursion.printWithCommas(input);
        System.out.println(".");
      }else if (choice == 0) {
       System.out.println("");
       System.out.println("Thank you for using my program");
      }

    } while (choice != 0);
    
  }

}