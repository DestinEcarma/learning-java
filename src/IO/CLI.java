package IO;

import java.util.*;

public class CLI {
    private static Scanner scanner = new Scanner(System.in);
    
    public static int scanInt(String description) {
        if (description != null) {
           print(description);
        }
        
        return scanner.nextInt();
    }
    
    public static double scanDouble(String description) {
        if (description != null) {
           print(description);
        }
        
        return scanner.nextDouble();
    }
    
    public static String scanString(String description) {
        if (description != null) {
           print(description);
        }
        
        return scanner.nextLine();
    }
    
    // print
    
    public static void print(byte out) {
        System.out.print(out);
    }
    
    public static void print(short out) {
        System.out.print(out);
    }
    
    public static void print(int out) {
        System.out.print(out);
    }
    
    public static void print(long out) {
        System.out.print(out);
    }
    
    public static void print(float out) {
        System.out.print(out);
    }
    
    public static void print(double out) {
        System.out.print(out);
    }
    
    public static void print(boolean out) {
        System.out.print(out);
    }
    
    public static void print(char[] out) {
        System.out.print(out);
    }
    
    public static void print(String out) {
        System.out.print(out);
    }
    
    public static void print(Object out) {
        System.out.print(out);
    }
    
    // println
    
    public static void println(byte out) {
        System.out.println(out);
    }
    
    public static void println(short out) {
        System.out.println(out);
    }
    
    public static void println(int out) {
        System.out.println(out);
    }
    
    public static void println(long out) {
        System.out.println(out);
    }
    
    public static void println(float out) {
        System.out.println(out);
    }
    
    public static void println(double out) {
        System.out.println(out);
    }
    
    public static void println(boolean out) {
        System.out.println(out);
    }
    
    public static void println(char[] out) {
        System.out.println(out);
    }
    
    public static void println(String out) {
        System.out.println(out);
    }
    
    public static void println(Object out) {
        System.out.println(out);
    }
}
