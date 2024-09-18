package flyer;

public class Main {
    public static void main(String[] args) {
        SeaPlane seaPlane = new SeaPlane();
        Helicopter helicopter = new Helicopter();
        
        seaPlane.takeOff();
        seaPlane.fly();
        seaPlane.land();
        
        helicopter.takeOff();
        helicopter.fly();
        helicopter.land();
        
        Bird bird = new Bird();
        Superman superman = new Superman();
        
        bird.eat();
        bird.takeOff();
        bird.fly();
        bird.land();
        bird.layEggs();
        
        superman.eat();
        superman.takeOff();
        superman.fly();
        superman.land();
    }
}
