package com.game;
import java.util.Scanner;
import java.util.Random;

public class RandomNumberGenerator
{
	int choice;
	Random rd = new Random();
	Scanner s = new Scanner(System.in);
	
	void DisplayRules()
	{
		System.out.println("=========== Welcome To The Number Guessing Game ================");
		System.out.println();
		System.out.println("=========== RULE FOR GAME =========");
		System.out.println("1.The Game will generated random number Between 1 to 10 ");
		System.out.println("2.You have to enter Your guess number");
		System.out.println("3.After each guess, you will be told \n  if your guess is too high,  too low, or correct.");
		System.out.println("4.Keep Going until you find correct output!");
		System.out.println("=============================================");
	}
	
	void ShowMenu()
	{
		System.out.println("==== Number Guessing Game ====");
		System.out.println("1. Start the Game");
		System.out.println("2. Quit the Game");
		System.out.println("Please select a option :");
		choice = s.nextInt();
		
		switch (choice) 
		{
		case 1 :
			start();
			break;
		case 2:
			System.out.println("Game Exited!");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}

	void start()
	{
		boolean guessedCorrect = false;
		int noOfAttempt = 0;
		int randomNo = rd.nextInt(0, 10);
		System.out.println(randomNo);
		
		while(guessedCorrect=true)
		{
			System.out.println("Enter your guess :");
			int userGuess = s.nextInt();
			noOfAttempt++;
			
			if(userGuess < 0 || userGuess > 10)
			{
				System.out.println("Please enter a number between 0  to 10");
			}
			else if(userGuess == randomNo)
			{
				System.out.println("Congraulations, You Won!");
				System.out.println("You have guessed the number in " + noOfAttempt + " Attempts");
				System.out.println("Do you want to play again?");
//				boolean yes = s.nextBoolean();
//				System.out.println(yes);
//				if(true)
//					ShowMenu();
//				else
//					break;
			}
			else
			{
				int difference = randomNo - userGuess;
				if( difference > 2 )
				{
					System.out.println("You are far away from the answer :(");
				}
				else
				{
					System.out.println("You are very close to the answer :)");
				}
				System.out.println("Try Again!");
			}
		}
//		System.out.println(noOfAttempt);
	}
	public static void main(String[] args) 
	{
		RandomNumberGenerator game = new RandomNumberGenerator();
		game.DisplayRules();
		game.ShowMenu();
		
		
	}
}
