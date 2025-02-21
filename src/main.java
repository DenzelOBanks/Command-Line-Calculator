import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter First Number: ");
            int i = scanner.nextInt();

            System.out.print("Enter Operation: (* / % + - ) ");
            int k = scanner.next().charAt(0);

            System.out.print("Enter Second Number: ");
            int j = scanner.nextInt();

            switch (k) {

                case '+':
                    System.out.println(i + j);
                    break;

                case '-':
                    System.out.println(i - j);
                    break;

                case '*':
                    System.out.println(i * j);
                    break;

                case '/':
                    System.out.println(i / j);
                    break;

                case '%':
                    System.out.println(i % j);
                    break;

                default:
                    System.out.println("Not an Integer");
                    break;

            }
        }catch(InputMismatchException e){
            System.out.println(e);
        }
    }
}
