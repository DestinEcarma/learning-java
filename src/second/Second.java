package second;

import IO.CLI;
import MathOp.ArithmeticOp;

public class Second {
    public static void main(String[] args) {
        double a = CLI.scanDouble("Input the first operand: ");
        double b = CLI.scanDouble("Input the second opearnd: ");
        
        double sum = ArithmeticOp.add(a, b);
        
        CLI.println("Sum: " + sum);
    }
}
