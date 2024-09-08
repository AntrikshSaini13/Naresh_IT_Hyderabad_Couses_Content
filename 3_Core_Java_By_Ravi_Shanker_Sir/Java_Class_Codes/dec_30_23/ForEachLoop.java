// Program on for-each loop :
// --------------------------
// package com.ravi.for_each_loop;

import java.util.Arrays;

public class ForEachLoop
{
	public static void main(String[] args) 
	{
		int []values = {89,67,45,23,15}; //variable
		
		Arrays.sort(values);		// sort method apply here for sorting purpose
		
		for(int value : values)
		{
			System.out.print(value);
		}
		
		String []fruits = {"Mango","Orange","Apple"};
		
		Arrays.sort(fruits);
		
		for(String fruit : fruits)
		{
			System.out.println(fruit);
		}
		
	}

}