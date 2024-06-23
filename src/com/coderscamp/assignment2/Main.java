package com.coderscamp.assignment2;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
public static void main(String[] agrs) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick a number between 1-100");
		String userInput = scanner.nextLine();
		Integer convertedInput = Integer.parseInt(userInput);
		Integer winCondition = (int) (Math.random() * 100 + 1);
		
		int i = 0;
		while(i < 4) {

			if(convertedInput == winCondition) {
				break;	
			}
			
			else if (convertedInput < 1 || convertedInput > 100 ) {
				convertedInput = collectInput(scanner, "Invalid Input, No Chance used. Try Again: ", convertedInput);
//				System.out.println("Invalid Input, No Chance used. Try Again: ");
//				userInput = scanner.nextLine();
//				convertedInput = Integer.parseInt(userInput);
			}
			
			else if(convertedInput > winCondition) {
				i++;
				convertedInput = collectInput(scanner, convertedInput + " is Wrong guess Lower!", convertedInput);
//				System.out.println(convertedInput + " is Wrong guess Lower!");
//				userInput = scanner.nextLine();
//				convertedInput = Integer.parseInt(userInput);
			}
				
			else if (convertedInput < winCondition) {
				i++;
				convertedInput = collectInput(scanner, convertedInput + " is wrong guess Higher", convertedInput);	
//				System.out.println(convertedInput + " is Wrong guess Lower!");
//				userInput = scanner.nextLine();
//				convertedInput = Integer.parseInt(userInput);
				}
		}
		
		if(convertedInput == winCondition) {
			System.out.println("You Win!");
			
		} else {
			System.out.println("You Lose! Winning Number was: " + winCondition);
		}
	}

	private static Integer collectInput(Scanner scanner, String consoleMessage,  Integer convertedInput) {
	String userInput;
	System.out.println(consoleMessage);
	userInput = scanner.nextLine();
	convertedInput = Integer.parseInt(userInput);
	return convertedInput;
}
}
