package IO;

import java.util.*;

public class CLI {
    Scanner scanner = new Scanner(System.in);
    
    public int scanInt(String description) {
        if (description != null) {
           System.out.print(description);
        }
        
        return scanner.nextInt();
    }
    
    public double scanDouble(String description) {
        if (description != null) {
           System.out.print(description);
        }
        
        return scanner.nextDouble();
    }
    
    public String scanString(String description) {
        if (description != null) {
           System.out.print(description);
        }
        
        return scanner.nextLine();
    }
}
