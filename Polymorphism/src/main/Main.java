package main;

import java.util.Scanner;

import employee.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Input a employee type: ");
        String type = scanner.nextLine();
        
        Employee employee = switch (type.toLowerCase()) {
            case "director" -> new Director();
            case "manager" -> new Manager();
            case "secretary" -> new Secretary();
            case "engineer" -> new Engineer();
            default -> new Employee();
        };
        
        System.out.println("Tax is " + employee.getTaxPercentage() * 100);
    }
}
