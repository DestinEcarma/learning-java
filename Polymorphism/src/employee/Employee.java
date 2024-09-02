package employee;

public class Employee {
    public double getTaxPercentage() {
        if (this instanceof Director) {
            return 0.4;
        } else if (this instanceof Manager) {
            return 0.35;
        } else if (this instanceof Secretary) {
            return 0.1;
        } else if (this instanceof Engineer) {
            return 0.3;
        }

        return 0.0;
    }
}
