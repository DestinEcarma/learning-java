package second;

import IO.CLI;
import MathOp.Op;

public class Second {
    public static void main(String[] args) {
        double a = CLI.scanDouble("Input the first operand: ");
        double b = CLI.scanDouble("Input the second opearnd: ");
        
        double sum = Op.add(a, b);
        
        CLI.println("Sum: " + sum);
    }
}
