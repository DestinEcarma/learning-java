package main;

import io.CLI;
import math.Op;

public class Main {
    public static void main(String[] args) {
        double a = CLI.scanDouble("Input the first operand: ");
        double b = CLI.scanDouble("Input the second opearnd: ");
        
        int sum = (int) Op.add(a, b);
        
        CLI.println("Sum: " + sum);
    }
}
