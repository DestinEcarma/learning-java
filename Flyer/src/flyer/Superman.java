package flyer;

public class Superman extends Kryptonian implements Flyer {
    @Override
    public void takeOff() {
        System.out.println("Supermas has taken off!");
    }
    
    @Override
    public void land() {
        System.out.println("Superman has laneded!");
    }
    
    @Override
    public void fly() {
        System.out.println("Superman is flying!");
    }
    
    @Override
    public void eat() {
        System.out.println("Superman is eating!");
    }

}
