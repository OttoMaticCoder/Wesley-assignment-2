package com.coderscamp.assignment2;

import java.util.Scanner;

public class GameLoop {
	
	public void GuessGame(Integer convertedInput, Integer winCondition,Integer chances, Scanner scanner) {
		
		
		while(true) {

			 if (convertedInput < 1 || convertedInput > 100 ) {
				convertedInput = InputCollector.collectInput(scanner, convertedInput,
						"Invalid Input, No Chance used. Try Again: ");
			}
			else if(convertedInput == winCondition) {
				break;	
			}
			else if(chances == 4) {
				break;
			}
			
			else if(convertedInput > winCondition) {
				chances++;
				convertedInput = InputCollector.collectInput(scanner, convertedInput,
						convertedInput + " is Wrong guess Lower!");
			}	
			else if (convertedInput < winCondition) {
				chances++;
				convertedInput = InputCollector.collectInput(scanner, convertedInput,
						convertedInput + " is wrong guess Higher");	
			}	
		}
		
			if(convertedInput == winCondition) {
			System.out.println("You Win! Number was " + winCondition);
			
			} else {
			System.out.println("You Lose! Winning Number was: " + winCondition);
			}
		}
	}


