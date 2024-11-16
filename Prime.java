import java.util.Scanner;

public class Prime {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int[] n= new int[10];
        System.out.println("Enter 10 integers");



        for (int i =0;i<10;i++){
            System.out.print("Enter integer no."+ (i+1)  +"  ");
            n[i]= sc.nextInt();

        }
//Iterate to print only the prime numbers//
        System.out.println("Prime numbers in array :");
        for (int num: n){
            if (isPrime(num)){
                System.out.print(num + " , ");
            }
        }
    }


//Method to check and return true or false if a number is prime or not//
    public static boolean isPrime(int num){
        if (num<=1){
            return false;

        }
        for ( int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }




}
