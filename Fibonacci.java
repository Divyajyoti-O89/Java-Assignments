import java.util.Scanner;

public class Fibonacci{
    public static void main (String[] args){
        System.out.print("Enter number of terms : ");
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }

        // Initialize the array to store Fibonacci numbers
        int[] fibonacci = new int[n];

        // Handle base cases for fibonacci series//
        
        fibonacci[0] = 0; // First term is 0
        
        
        if (n>=2){
            fibonacci[1] = 1;
        } // Second term is 1
        

        // Generate Fibonacci series for n > 2
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Print the Fibonacci sequence
        System.out.println("The first " + n + " terms of the Fibonacci series are:");
        for (int i=0;i<n; i++){
            System.out.print(fibonacci[i] + " ");
        }  

    }
}
    
    
