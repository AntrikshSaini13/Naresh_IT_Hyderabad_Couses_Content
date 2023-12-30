//A static method available in another class can be 
//call with class name

// package com.ravi.pack2;

import java.util.Scanner;

//ELC(Executable Logic class)
public class Test
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = sc.nextInt();		
		
		FindSquare.getSqureOfTheNumber(num); 
		sc.close();
	}
}