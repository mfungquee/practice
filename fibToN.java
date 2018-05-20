/*
Given a positive integer N, print the Fibonacci series till the number N. If N is a part of the series, print N as well.

Input:
The first line of input is an integer T, denoting the number of test cases. For each test case, input an integer N, denoting the number up to which Fibonacci needs to be printed.

Output:
For each test case, there is only one line of input that will comprise of space separated elements of the Fibonacci series.

Constraints:
1<=T<=100
2<=N<10^8

Example:
Input:
3
5
15
50
Output:
0 1 1 2 3 5
0 1 1 2 3 5 8 13
0 1 1 2 3 5 8 13 21 34

*/
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		//args = new String[]{"3","5","15","50"}; //for testing cases
		Fibonacci myFib = new Fibonacci();
		myFib.testFibToN(args);
		//myFib.fibToN(5);
		//myFib.fibToN(15);
		//myFib.fibToN(50);
	}
}

class Fibonacci{
    public void fibToN(int n){
	    int fib1 = 0, fib2 = 1, fibn =0;
		String fibstr = "";
	    //insert first fib for base case
	    if (n >= 2){
	        fibstr += fib1; 
	    }
	    //as long as next fib# is <= given n
	    //add fib # to output string
	    while(fibn <= n){
	        fibstr = fibstr + " " + fib2;
	        fibn = fib1 + fib2;
	        fib1 = fib2;
	        fib2 = fibn;
	    }
	    
	    System.out.println(fibstr);
	}//fibToN
	
	//T = # of test cases, N = input for fibToN
	public void testFibToN(String[] c){
	    try{
    	    int[] myArgs = new int[c.length]; //length of main arg[]
    	    //convert each string into a number and insert in myArgs[]
    	    for (int j = 0; j < c.length; j++){
    	        myArgs[j] = Integer.parseInt(c[j]);
    	    }
    	   
    	    //T = 1st arg, N = all other airgs
    	    //Constraint 1: 1<=T<=100
    	    if (myArgs[0]<1 || myArgs[0] > 100 ){
    	        return;
    	    }
    	    //Constraint 2: 2<=N<10^8
    	    for (int k = 1; k < myArgs.length-1; k++){
    	        if ( myArgs[k] < 2 || myArgs[k] >= Math.pow(10,8) ){
    	            return;
    	        }
    	    }
    	    
    	    //print fib sets with respect to the test case limit
    	    int testCaseLimit = myArgs[0];
    	    for (int i = 1; i <= testCaseLimit; i++){
    	        fibToN(myArgs[i]);
    	    }
	    
	    } catch (IndexOutOfBoundsException e){
	        System.out.println("Exception: Not enough test cases to display for that value of T!");
	    }//catch
	    
	}//testFibToN
}