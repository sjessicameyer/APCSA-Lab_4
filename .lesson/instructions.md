# Lab 4
### Recursion

#### Objective: To gain proficiency implementing recursive methods in java.


Write a *menu-driven* program that completes each task using only primitive data types.  Each task below must be a recursive method that solves the problem and meets the specifications, returning or printing as required. (The name of the method is in italics).  

 
1. *twos* takes a single positive integer as its argument and **returns** the number of factors of 2 in the number.  (Hint: odd numbers have no factors of 2, numbers that are twice an odd number have one, numbers that are four times an odd have two, and so on.) 

2. *powerOf3* takes a single positive integer argument and **returns** true iff the integer is a perfect power of 3 such as 1, 3, 9, 27, 81, …, or false otherwise.
 
3. *reverse* takes a single positive integer argument and **displays** the result of reversing its digits.

4. *base5* takes a single positive integer argument and **displays** its base five equivalent.

5. *printWithCommas* takes a single positive integer argument and **displays** it with commas inserted properly.  **No use of String.**


#### Notes
* No class variables other than Scanner
* No arrays should be used.
* No Math methods allowed.
* No other classes or libraries are allowed.
* Your programs output should match the sample run.
* Reminder you may only use the knowledge of things we have discussed in class.

***

### Scoring Guide

| Requirement | Possible Points |
| :---        |    :----:   | 
| On time submission | 4 | 
| Header filled in with name, block, etc. | 2 |
| Correctly uploaded zipped replit project to Google Classroom | 2 |
| NO class variables. Only primitive types | 2 |
| Menu that repeats until user is done | 3 |
| Correct *twos* method value returned | 4 |
| Correct *powerOf3* method value returned | 4 |
| Correct *reverse* method value displayed | 4 |
| Correct *base5* method value displayed | 4 |
| Correct *printWithCommas* method value displayed | 4 |
| **Total:** | **33** |

***  

### Here is what a couple sample runs of this program should look like: 

```
Welcome to The Recursion Lab!

Please Choose a method: 
1. twos
2. powerOf3
3. reverse
4. base5
5. printWithCommas
0. Quit
1

Input a number (int):12
The number of twos(12) is 2.

Please Choose a method: 
1. twos
2. powerOf3
3. reverse
4. base5
5. printWithCommas
0. Quit
2

Input a number (int):81
81 is a powerOf3(81).

Please Choose a method: 
1. twos
2. powerOf3
3. reverse
4. base5
5. printWithCommas
0. Quit
3

Input a number (int):120
The display of reverse(120) is 021.

Please Choose a method: 
1. twos
2. powerOf3
3. reverse
4. base5
5. printWithCommas
0. Quit
3

Input a number (int):1234567
The display of reverse(1234567) is 7654321.

Please Choose a method: 
1. twos
2. powerOf3
3. reverse
4. base5
5. printWithCommas
0. Quit
4

Input a number (int):136
The display of base5(136) is 1021.

Please Choose a method: 
1. twos
2. powerOf3
3. reverse
4. base5
5. printWithCommas
0. Quit
4

Input a number (int):5
The display of base5(5) is 10.

Please Choose a method: 
1. twos
2. powerOf3
3. reverse
4. base5
5. printWithCommas
0. Quit
5

Input a number (int):12045670
The display of printWithCommas(12045670) is 12,045,670.

Please Choose a method: 
1. twos
2. powerOf3
3. reverse
4. base5
5. printWithCommas
0. Quit
5

Input a number (int):1
The display of printWithCommas(1) is 1.

Please Choose a method: 
1. twos
2. powerOf3
3. reverse
4. base5
5. printWithCommas
0. Quit
0

Thank you for using my program.
```
