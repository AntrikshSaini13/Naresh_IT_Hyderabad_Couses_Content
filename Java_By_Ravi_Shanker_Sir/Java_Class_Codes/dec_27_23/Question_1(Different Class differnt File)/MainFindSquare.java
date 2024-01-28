// package Question_1;

// package com.ravi.pack2;

import java.util.Scanner;

//ELC(Executable Logic class)
public class MainFindSquare
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