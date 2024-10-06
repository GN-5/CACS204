import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String str = input.nextLine();

        String[] tokens = str.split(" ");

        System.out.println("Tokens in reverse order:");
        for (int i = tokens.length - 1; i >= 0; i--) {
            System.out.println(tokens[i]);
        }

        input.close();
    }
}
