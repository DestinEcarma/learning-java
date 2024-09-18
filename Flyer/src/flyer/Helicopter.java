package flyer;

public class Helicopter extends Airplane {
    @Override
    public void takeOff() {
        System.out.println("The helicopter has taken off!");
    }
    
    @Override
    public void land() {
        System.out.println("The helicopter has landed!");
    }
    
    @Override
    public void fly() {
        System.out.println("The helicopter is flying!");
    }
}
