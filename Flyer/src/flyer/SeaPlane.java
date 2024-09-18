package flyer;

public class SeaPlane extends Airplane {
    @Override
    public void takeOff() {
        System.out.println("The sea plane has taken off!");
    }
    
    @Override
    public void land() {
        System.out.println("The sea plane has landed!");
    }
    
    @Override
    public void fly() {
        System.out.println("The sea plane is flying");
    }
}
