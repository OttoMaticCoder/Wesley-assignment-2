package com.coderscamp.assignment2;

import java.util.Scanner;

public class InputCollector {
	
	public static Integer collectInput(Scanner scanner, Integer convertedInput,  String consoleMessage) {
		String userInput;
		System.out.println(consoleMessage);
		userInput = scanner.nextLine();
		convertedInput = Integer.parseInt(userInput);
		return convertedInput;
		}

}
