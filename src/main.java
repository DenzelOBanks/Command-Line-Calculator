import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;

        while (continueCalculating) {
            try {

                System.out.print("Enter First Number: ");
                double operand1 = scanner.nextDouble();

                System.out.print("Enter Operation: (* / % + - ) ");
                char operator = scanner.next().charAt(0);

                System.out.print("Enter Second Number: ");
                double operand2 = scanner.nextDouble();

                switch (operator) {

                    case '+':
                        System.out.println(operand1 + operand2);
                        break;

                    case '-':
                        System.out.println(operand1 - operand2);
                        break;

                    case '*':
                        System.out.println(operand1 * operand2);
                        break;

                    case '/':
                        if (operand2 == 0) {
                            System.out.println("Error: Cannot divide by zero.");
                            break;
                        }
                        System.out.println(operand1 / operand2);
                        break;

                    case '%':
                        if (operand2 == 0) {
                            System.out.println("Error: Cannot calculate remainder with zero.");
                        break;
                        }
                        System.out.println(operand1 % operand2);
                        break;

                    default:
                        System.out.println("Error: Invalid operator. Please enter one of: +, -, *, /, %.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter numbers only.");
                scanner.next();
            }
            while(true){
            System.out.print("Would you like to continue? yes/no ");
            String input = scanner.next();
            if(input.equalsIgnoreCase("no")) {
                continueCalculating = false;
                break;
            } else if(input.equalsIgnoreCase("yes")){
                break;
                }else{
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
            }
        }
        scanner.close();
    }
}
