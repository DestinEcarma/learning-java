package main;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    
    private static enum Difficulty {
        Low,
        Medium,
        High,
    }
    
    public static void main(String[] args) {
        System.out.print("Enter a difficulty: ");
        String input = scanner.nextLine();
        
        Difficulty difficulty = switch (input.toLowerCase()) {
            case "low" -> Difficulty.Low;
            case "medium" -> Difficulty.Medium;
            case "high" -> Difficulty.High;
            default -> Difficulty.Medium;
        };
        
        printDifficulty(difficulty);
    }
    
    private static void printDifficulty(Difficulty difficulty) {
        System.out.println("Difficulty: " + difficulty);
    }
}
