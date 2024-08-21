package second;

import IO.CLI;
import MathOp.ArithmeticOp;

public class Second {
    public static void main(String[] args) {
        CLI cli = new CLI();
        ArithmeticOp math = new ArithmeticOp();
        
        double a = cli.scanDouble("Input the first operand: ");
        double b = cli.scanDouble("Input the second opearnd: ");
        
        double sum = math.add(a, b);
        
        System.out.println("Sum: " + sum);
    }
}
