import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Calculator calculator = (Calculator) registry.lookup("CalculatorService");

            double a = 8.0;
            double b = 5.0;
            System.err.println("Valores: " + a + " e " + b);
            System.out.println("Adição (+): " + calculator.add(a, b));
            System.out.println("Subtração (-): " + calculator.subtract(a, b));
            System.out.println("Multiplicação (*): " + calculator.multiply(a, b));
            System.out.println("Divisão (/): " + calculator.divide(a, b));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
