package com.coderscamp.assignment2.game;

import java.util.Scanner;

public class GameLoop {
	
	private int minimum;
	private int maximum;
	private int guessAmount;
	private int winningNumber;
	private boolean gameWon;
	
	public GameLoop(Integer minimum, Integer maximum,Integer chanceCount) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.guessAmount = chanceCount;
		generateRandomNumber();
		
	}
	
	private void generateRandomNumber() {
		winningNumber = (int) (Math.random() * maximum + minimum);
		
	}
	

	public int getWinningNumber() {
		return winningNumber;
	}
	
	public void playGame() {
		try(Scanner scanner =  new Scanner(System.in)) {
            int guessesUsed = 0;
            while (guessesUsed < guessAmount && !gameWon) {
                System.out.println("Pick a number between 1-100...");
                String userInput = scanner.nextLine();
                Integer convertedInput = Integer.parseInt(userInput);
                if (convertedInput < minimum || convertedInput > maximum) {
                    System.out.println("Invalid guess....Please use a vaild guess...");
                    continue;
                }
                guessesUsed++;

                    if (convertedInput == winningNumber) {
                        gameWon = true;
                        System.out.println("You Win");
                    }
                    else if (guessesUsed == guessAmount) {
                    	System.out.println("You Lose");
                    }
                    else if (convertedInput < winningNumber) {
                        System.out.println("Guess is too low...Try a higher number...");
                    } else {
                        System.out.println("Guess is too high..Try a lower number");
                    }
                }
            }
        }
    }
	

