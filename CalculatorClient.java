import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Calculator calculator = (Calculator) registry.lookup("CalculatorService");

            double a = 10.0;
            double b = 5.0;

            System.out.println("Addition: " + calculator.add(a, b));
            System.out.println("Subtraction: " + calculator.subtract(a, b));
            System.out.println("Multiplication: " + calculator.multiply(a, b));
            System.out.println("Division: " + calculator.divide(a, b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
