//Add functions to file: getInput getInput = new getInput();
package SarahLibrary;
import java.util.Scanner;

public class getInput{

  private Scanner input;

  public getInput(){
  }

  public int integerSample(String prompt){
    input = new Scanner(System.in);
    System.out.print(prompt);
    return input.nextInt();
  }

  public double doubleSample(String prompt){
    input = new Scanner(System.in);
    System.out.print(prompt);
    return input.nextDouble();
  }

  public String stringSample(String prompt){
    input = new Scanner(System.in);
    System.out.print(prompt);
    return input.next();
  }

  public char characterSample(String prompt){
    input = new Scanner(System.in);
    System.out.print(prompt);
    return input.next().charAt(0);
  }

  public String stringLineSample(String prompt){
    input = new Scanner(System.in);
    System.out.print(prompt);
    return input.nextLine();
  }
}