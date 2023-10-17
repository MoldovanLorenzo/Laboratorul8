import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Operatii operatii = new Operatii();

        double n1 = 5.0;
        double n2 = 0.0;

        try {
            double Add = operatii.add(n1, n2);
            System.out.println("Addition result: " + Add);
        } catch (Exception e) {
            System.err.println("Error in addition: " + e.getMessage());
        }

        try {
            double Divide = operatii.divide(n1, n2);
            System.out.println("Division result: " + Divide);
        } catch (Exception e) {
            System.err.println("Error in division: " + e.getMessage());
        }

        List<Double> valori = new ArrayList<>();
        valori.add(10.0);
        valori.add(20.0);
        valori.add(30.0);

        try {
            double Average = operatii.avarage(valori);
            System.out.println("Average result: " + Average);
        } catch (Exception e) {
            System.err.println("Error in average calculation: " + e.getMessage());
        }
    }
}
