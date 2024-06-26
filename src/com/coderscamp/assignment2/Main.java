package com.coderscamp.assignment2;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
public static void main(String[] agrs) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick a number between 1-100");
		String userInput = scanner.nextLine();
		Integer convertedInput = Integer.parseInt(userInput);
		Integer winCondition = (int)(Math.random() * 100 + 1);
		
		GameLoop game = new GameLoop();
		game.GuessGame(convertedInput, winCondition, scanner);
		
	}
}
