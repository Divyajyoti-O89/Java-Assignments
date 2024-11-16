import java.util.Scanner;
public class Secondlrg {
    public static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        
        for (int num : arr) {
            
            if (num > first) {
                second = first;
                first = num;
            } 
            else if (num > second && num != first) {
                second = num;
            }
        }
    
        return second;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        while (true){
            if (arr.length<2){
                System.out.println("Array must contain atleast two elements for comparsion");
                break;
            }
            
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // Finding and displaying the second largest number
        int secondLargest = findSecondLargest(arr);
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number.");
        }  
        else {
            System.out.println("The second largest number is: " + secondLargest);
        }
        }
        
        scanner.close();
    }

}     
    

