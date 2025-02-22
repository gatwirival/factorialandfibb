## Author:VALENTINE GATWIRI
##       :EBS3/58403/22
## Language: Java
## Factorial and Fibonacci Programs
This documentation explains two simple Java programs that calculate the factorial of a number and the Fibonacci sequence up to a given number. 
Both programs also measure how long it takes to perform these calculations. Let’s break it down!
## [Factorial](https://github.com/gatwirival/factorialandfibb/blob/main/src/factorial.java)
 ### What Does It Do?
 This program calculates the factorial of a number (e.g., 5!) is the product of all positive integers up to that number. For example:

`5! = 5 × 4 × 3 × 2 × 1 = 120`

It also measures how long it takes to compute the factorial.
## How Does It Work?
- Input: The program asks you to enter a number.

- Calculation: It uses a recursive method to compute the factorial.

   If the number is 0 or 1, it returns 1 (since 0! and 1! are both 1).

    Otherwise, it multiplies the number by the factorial of the number minus one.

- Output: It prints the factorial and the time taken (in nanoseconds).

  ## Output
![Screenshot from 2025-02-22 09-39-09](https://github.com/user-attachments/assets/218f7bd1-9624-406f-af71-e1d49f3a7397)


## Code Highlights
Method: factorial(int n)

Computes the factorial recursively.

Timing: Uses System.nanoTime() to measure how long the calculation takes.

## [Fibonacci](https://github.com/gatwirival/factorialandfibb/blob/main/src/fibonacci.java)
What Does It Do?
This program calculates the Fibonacci number at a specific position in the Fibonacci sequence. 
The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones (e.g., 0, 1, 1, 2, 3, 5, 8, 13, ...).

It also measures how long it takes to compute the Fibonacci number.

 ## How Does It Work?
- Input: The program asks you to enter a number (position in the Fibonacci sequence).

- Calculation: It uses an iterative method to compute the Fibonacci number.

   If the number is 0 or 1, it returns the number itself.

  Otherwise, it iteratively adds the previous two numbers to compute the result.

- Output: It prints the Fibonacci number and the time taken (in nanoseconds).
  ## Output
  ![Screenshot from 2025-02-22 10-04-52](https://github.com/user-attachments/assets/6901e24e-033e-4eec-9ac2-24653c9747e4)
  
  ## Code Highlights
Method: fibonacci(int n)

Computes the Fibonacci number iteratively.

Timing: Uses System.nanoTime() to measure how long the calculation takes.

> I prefer using iteration in fibonacci because :It iuns in O(n) time complexity instead of O(2^n).
Works efficiently even for large numbers (e.g., 50, 100, etc.) without stack overflow.

> While in factorial, recursion is better because: It is faster because it avoids function call overhead.
Uses O(1) space, since it only maintains a single variable and has no risk of stack overflow, even for large n(number).

