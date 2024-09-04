package main;

public class Bottom extends Middle {
    public Bottom() {
        System.out.println("This is inside the Bottom class");
    }
    
    public Bottom(String name) {
        System.out.println("This is inside the Bottom class, name: " + name);
    }
}
