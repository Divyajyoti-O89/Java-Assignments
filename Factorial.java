import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digit : ");
        int n= sc.nextInt();
        long fact=1;

        if (n<=20){
            for (int i=1 ; i<=n; i++){
                fact=fact*i;
            }
            
            System.out.println("Factorial : " + " "+fact);
            
            int sum = sumOfdigits(fact);
            System.out.println("sum of digits : " + sum);
        }
            
        else{
            System.out.println("Exceeded Limit (n>20)..Have no accurate results");
        }
        
    }
    //method for digits sum//
    public static int sumOfdigits(long fact){
        int sum=0;
        while (fact !=0){
            sum+=fact%10;
            fact/=10;

        }
        return sum;
    }
}
    
    

