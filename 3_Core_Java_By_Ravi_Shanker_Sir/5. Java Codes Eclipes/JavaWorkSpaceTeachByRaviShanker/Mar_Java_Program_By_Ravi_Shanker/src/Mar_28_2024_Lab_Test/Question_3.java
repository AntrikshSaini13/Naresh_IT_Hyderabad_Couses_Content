package Mar_28_2024_Lab_Test;

//Program Statement: Palindrome Finder
//
//
//
//Objective:
//
//The program aims to identify palindromic numbers from an array of integers using functional interfaces and lambda expressions.
//
//
//
//Instructions:
//
//
//
//Initialize an array of integers with sample data.
//
//Define a functional interface PalindromeChecker with a single method isPalindrome(int number) to check if a given number is a palindrome.
//
//Implement the main method to execute the program logic.
//
//Within the main method:
//
//Create a functional interface implementation using a lambda expression to check for palindromes.
//
//Iterate through the array of integers and check each number using the isPalindrome method of the functional interface.
//
//Print the palindromic numbers found in the array.


//package com.kunal.test;

public class Question_3 
{
	interface PalindromeChecker
	{
		boolean isPalindrome(int number);
	}

	public static void main(String[] args)
	{
		int[]numbers = {121,12321,123321,12345};
		PalindromeChecker checker=number->{String str=Integer.toString(number);
		return str.equals(new StringBuilder(str).reverse().toString());
		};
		System.out.println("palindrome numbers in array");
		for(int num:numbers) {
			if(checker.isPalindrome(num)) {
				System.out.println(num);
			}
			
		}
		

	}

}
