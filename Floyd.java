import java.util.Scanner;
public class Floyd {
    public static void main(String[] args ){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter no. of rows :  ");
        int n, num=1;
        n = sc.nextInt();
        System.out.println("-- Floyd's Triangle --");
        for (int i=1; i<=n;i++){
            for (int j=1; j<=i;j++ ){
                System.out.print(num + "  ");
                num++; //Increment the number for nxt position
            }
            //Move to next line after each row//
            System.out.println();
        }

    }
}
