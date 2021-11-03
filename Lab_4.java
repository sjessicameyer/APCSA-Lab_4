/** Lab 4**********************************************/
/*	Your name: Sarah Meyer
		Class block:G				Date Started: 10/29/21
		Lab Number: 4
		Title: Recursion
		Purpose: To gain proficiency implementing recursive methods in Java.
*/

import SarahLibrary.*;

public class Lab_4{
  SarahLibrary.customMath customMath = new SarahLibrary.customMath();
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
    int currentDigit=customMath.findDigit(num,1);
    System.out.print(currentDigit);
    int newNum= (num-currentDigit)/10;
    if (newNum!=0){
      reverse(newNum);
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
    
  }

}