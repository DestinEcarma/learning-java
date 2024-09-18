package flyer;

public class Airplane extends Vehicle implements Flyer  {
    @Override
    public void takeOff() {
        System.out.println("The airplane has taken off!");
    }

    @Override
    public void land() {
        System.out.println("The airplane has landed!");
    }

    @Override
    public void fly() {
        System.out.println("The airplane is flying!");
    }
}
