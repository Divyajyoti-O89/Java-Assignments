import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your String :" + " ");
        String s = sc.next();
        String rev= "";
        for (int i = s.length()-1  ; i>=0;i--){
            rev=rev + s.charAt(i);

        }
        if (s.equals(rev)){
            System.out.println( " It is a  Palindrome" );

        }
        else {
            System.out.println( " Is not a palindrome");
        }
    }
    
}
