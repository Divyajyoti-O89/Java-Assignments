import java.util.Scanner;
public class Char{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.print("Enter the character to search : ");
        char ch = sc.next().charAt(0);
        int times = findOccurences(str, ch);
        System.out.println( ch  + "   " +"occured" +  "  "+  times  +" " + "times in the given string "  );
    }
//Method to count occurences of a chararcter in a string
    public static int findOccurences(String str, char ch) {
        int count = 0;
        // check for matches through each character in the string 
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}
