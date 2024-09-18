package flyer;

public class Bird extends Animal implements Flyer {
    @Override
    public void takeOff() {
        System.out.println("The bird has taken off!");
    }
    
    @Override
    public void land() {
        System.out.println("The bird has landed!");
    }
    
    @Override
    public void fly() {
        System.out.println("The bird is flying!");
    }
    
    @Override
    public void eat() {
        System.out.println("The bird is eating!");
    }
    
    public void layEggs() {
        System.out.println("The bird has just laid an egg!");
    }
}
