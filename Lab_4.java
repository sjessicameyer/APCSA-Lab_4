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

    /*if %3 equals 0 or 2 (100.len%3=0, 10000.len%3=2), print first num
      if %3 equals 1 (1000.len%3=1), print first num then comma
      if %3 equals 2 (1000.len%3=2),
    */
    int firstNum=num%(customMath.power(10, customMath.length(num)));
    int leftoverNum=num-firstNum*(int)customMath.power(10, customMath.countLength(num)-1);
    customMath.
    if ((customMath.countLength(num)%3==1)&&(leftoverNum!=0)){
      System.out.print(firstNum);
      System.out.print(",");
      printWithCommas(leftoverNum);
    }else if (leftoverNum==0){
      System.out.print(firstNum);
    }else if (num!=0){
      //TO DO: Make it so numbers ending in 0 still print correctly
      System.out.print(firstNum);
      printWithCommas(leftoverNum);
    }


  }

}