package com.interviewcode;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseSentence
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a sentence :");		// taking input from user
		String sentence = s.nextLine();
		String arr[]=sentence.split(" ");
		for (int i = arr.length-1; i>=0; i--) {
		
			System.out.print(arr[i]+"");
}
	}
	}