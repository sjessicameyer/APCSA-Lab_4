/** Lab 4**********************************************/
/*	Your name: Sarah Meyer
		Class block:G				Date Started: 10/29/21
		Lab Number: 4
		Title: Recursion
		Purpose: To gain proficiency implementing recursive methods in Java.
*/

public class Lab_4{
  public int twos(int num){
    //returns the number of factors of 2 in num
    if (num%2!=1){
      return 1 + twos(num/2);
    }
    return 0;
  }

  public boolean powerOf3(int num ){
    if (num>1){
      if (num%3 != 0){
      return false;
      }
      return powerOf3(num/3);
    }
    return true;
  }

  public void reverse(int num){
    //displays the result of reversing num's digits
    if(num!=0){
      System.out.print(num % 10);
      reverse(num / 10);
    }
  }

  public void base5(int num){
    //displays num's base 5 equivalent
    if (num!=0){
      System.out.print(num % 5);
      base5(num/5);
    }
  }

  public void printWithCommas(int num){
    //displays num with commas inserted properly

    if(num < 1000){
      System.out.print(num);
    }
    else {
      printWithCommas(num / 1000);
      System.out.print("," + (num % 1000) / 100 + "" + (num % 100) / 10 + "" + num % 10);
    }

  }

}