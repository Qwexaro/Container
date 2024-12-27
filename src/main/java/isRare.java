import java.util.Scanner;

public class isRare {
    public static void main(String[] args) {
        String slovo = new Scanner(System.in).nextLine();

        for (char i : slovo.toCharArray())
        {
            if(i == 'Ф' || i == 'ф') System.out.println("Слово уникальное");
        }
    }
}
