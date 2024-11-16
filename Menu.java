import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an operation (1-5): ");
            int choice = scanner.nextInt();
        

        
            if (choice == 5) {
                System.out.println("Exit!");
            break;
        }
        
            System.out.print("Enter the first number: ");
            double n1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double n2 = scanner.nextDouble();
            if (choice == 1) {
                System.out.println("Result: " + n1 + "+" + n2 + "=" + (n1 + n2));
            }
            else if (choice == 2) {
                System.out.println("Result: "+ n1 + "-" + n2 +  "=" + (n1 - n2));
            }
            else if (choice == 3) {
                System.out.println("Result: " + n1 + "*" + n2 + "=" +  (n1 * n2));
            }
            else if (choice == 4) {
                if (n2 != 0) {
                    System.out.println("Result: " + n1 + "/ "+ n2 + "="  +  (n1 / n2));
                } 
                else {
                    System.out.println("Error: Division by zero is undefined.");
                }
            }
            else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

