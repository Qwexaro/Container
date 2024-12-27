import java.util.Scanner;

public class poSymbol {
    public static void main(String[] args) {
        String slovo = new Scanner(System.in).nextLine();

        for (char i : slovo.toCharArray())
        {
            if (i != 'a' && i != 'A' && i != 'b' && i != 'B' && i != 'c' && i != 'C') {
                System.out.println(i);
            }
        }
    }
}
