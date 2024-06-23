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
				convertedInput = InputCollector.collectInput(scanner, convertedInput,
						"Invalid Input, No Chance used. Try Again: ");
			}
			else if(convertedInput > winCondition) {
				i++;
				convertedInput = InputCollector.collectInput(scanner, convertedInput,
						convertedInput + " is Wrong guess Lower!");
			}	
			else if (convertedInput < winCondition) {
				i++;
				convertedInput = InputCollector.collectInput(scanner, convertedInput,
						convertedInput + " is wrong guess Higher");	
			}	
		}
		
			if(convertedInput == winCondition) {
			System.out.println("You Win! Number was " + convertedInput);
			
			} else {
			System.out.println("You Lose! Winning Number was: " + winCondition);
			}
		}
}
