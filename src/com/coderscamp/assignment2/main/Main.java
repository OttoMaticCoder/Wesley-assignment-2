package com.coderscamp.assignment2.main;

import com.coderscamp.assignment2.game.GameLoop;

public class Main {
	
public static void main(String[] agrs) {
		
		
		GameLoop game = new GameLoop(1, 100, 5);
		System.out.println("random: " + game.getWinningNumber());
		game.playGame();
		
		
	}
}
