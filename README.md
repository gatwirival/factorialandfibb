### Author:VALENTINE GATWIRI:EBS3/58403/22
## Language: Java
## COSC 333B Programs (FACTORIAL,FIBONACCI,SORTING,MATRIX)
This documentation explains six simple Java programs that calculate the factorial of a number and the Fibonacci sequence up to a given number,implements sorting algorithms, and carry out matrix operations.

Fibonacci and factorial  programs also measure how long it takes to perform these calculations. Let’s break it down!
## [Factorial](https://github.com/gatwirival/factorialandfibb/blob/main/src/factorial.java)

 ### What Does It Do?
 This program calculates the factorial of a number (e.g., 5!) is the product of all positive integers up to that number. For example:

`5! = 5 × 4 × 3 × 2 × 1 = 120`

It also measures how long it takes to compute the factorial.
### How Does It Work?
- Input: The program asks you to enter a number.

- Calculation: It uses a recursive method to compute the factorial.

   If the number is 0 or 1, it returns 1 (since 0! and 1! are both 1).

    Otherwise, it multiplies the number by the factorial of the number minus one.

- Output: It prints the factorial and the time taken (nanoseconds).

  ### Output
![Screenshot from 2025-02-22 09-39-09](https://github.com/user-attachments/assets/218f7bd1-9624-406f-af71-e1d49f3a7397)


## Code Highlights
Method: factorial(int n)

Computes the factorial recursively.

Timing: Uses System.nanoTime() to measure how long the calculation takes.

## [Fibonacci](https://github.com/gatwirival/factorialandfibb/blob/main/src/fibonacci.java)

### What Does It Do?
This program calculates the Fibonacci number at a specific position in the Fibonacci sequence. 
The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones (e.g., 0, 1, 1, 2, 3, 5, 8, 13, ...).

It also measures how long it takes to compute the Fibonacci number.

 ### How Does It Work?
- Input: The program asks you to enter a number (position in the Fibonacci sequence).

- Calculation: It uses an iterative method to compute the Fibonacci number.

   If the number is 0 or 1, it returns the number itself.

  Otherwise, it iteratively adds the previous two numbers to compute the result.

- Output: It prints the Fibonacci number and the time taken (in nanoseconds).
  ### Output
  
 ![Screenshot from 2025-02-22 11-49-09](https://github.com/user-attachments/assets/389db786-ec41-4a8a-b296-3507fd827bd9)
 
### Code Highlights
Method: fibonacci(int n)

Computes the Fibonacci number iteratively.

Timing: Uses System.nanoTime() to measure how long the calculation takes.

> I prefer using iteration in Fibonacci because It runs in O(n) time complexity instead of O(2^n).
Works efficiently even for large numbers (e.g., 50, 100) without stack overflow.

 > While in factorial, recursion is better because: It is faster because it avoids function call overhead.
Uses O(1) space, since it only maintains a single variable and has no risk of stack overflow, even for large n(number).

## [ Insertion Sort](https://github.com/gatwirival/factorialandfibb/blob/main/src/insertionsort.java) 

This program implements the Insertion Sort algorithm to sort an array of integers in ascending order.

### Code Structure
`insertionSort(int[] arr)` – Sorts the array using insertion sort.

`printArray(int[] arr)` – Prints the array elements.

`main(String[] args)` – Runs the program with a sample array {12, 11, 13, 5, 6}.
### How It Works
The insertionSort method iterates through the array, picking one element at a time.It shifts larger elements to the right to make space for the current element in its correct position. The sorted portion of the array grows with each iteration.
### Output

![Screenshot from 2025-03-28 13-12-02](https://github.com/user-attachments/assets/4631d954-7fb3-4dc4-9517-2ebd6becd75a)

## [Matrix Operations](https://github.com/gatwirival/factorialandfibb/blob/main/src/matrix.java) 

This program performs element-wise operations (addition, subtraction, and multiplication) on two 1D arrays.

### How It Works
Two arrays A and B of size 4 are defined.

Three operations are performed on corresponding elements of A and B:

Sum (A + B)

Difference (A - B)

Element-wise Product (A * B)

The results are printed.

### Code Structure
`printMatrix(int[] matrix)` – Prints array elements.

`main(String[] args)` – Performs operations and displays results.

## Output
![Screenshot from 2025-03-28 14-12-16](https://github.com/user-attachments/assets/899f18a3-b9b8-463c-83cf-51383720a772)

### [Merge Sort (Ascending Order)](https://github.com/gatwirival/factorialandfibb/blob/main/src/mergesortascending.java) 
This program implements the Merge Sort algorithm to sort an array in ascending order.

### How It Works
Divide – The array is recursively split into two halves until single elements remain.

Conquer – Each half is sorted recursively.

Merge – The sorted halves are merged back together in order.

### Code Structure
`merge(int arr[], int left, int mid, int right)` – Merges two sorted subarrays.

`sort(int arr[], int left, int right)` – Recursively sorts the array.
### Output
![Screenshot from 2025-03-28 14-14-05](https://github.com/user-attachments/assets/aedfd687-ac7e-480d-94fb-2d25e9607aa1)


## [Merge Sort (Descending Order)]( https://github.com/gatwirival/factorialandfibb/blob/main/src/mergesortdescending.java) 
This  program implements Merge Sort to sort an array in descending order.

### How It Works
Divide – The array is recursively split into two halves until only single elements remain.

Conquer – Each half is sorted recursively.

Merge – The sorted halves are merged back in descending order.

### Code Structure
`merge(int arr[], int left, int mid, int right)` – Merges two sorted subarrays in descending order.

`sort(int arr[], int left, int right)` – Recursively sorts the array.
### Output

![Screenshot from 2025-03-28 14-15-23](https://github.com/user-attachments/assets/9649b352-b8f4-4e18-becf-fddb829b79c9)

