import java.util.Scanner;

public class isCoren {
    public static void main(String[] args) {
        double x = new Scanner(System.in).nextDouble();
        double rezerv = 0;
        rezerv = x;
        if (x % 2 == 0) {
            System.out.println(Math.sqrt(x));
        } else {
            System.out.println("Квадратный корень из " + rezerv + " не целое число.");
        }
    }
}
