package Conditionals_Activity;
import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String txt1 = scanner.nextLine();
        
        System.out.println("Enter another word:");
        String txt2 = scanner.nextLine();
        
        if (txt1.equalsIgnoreCase(txt2)) {
            System.out.println("The words are the same");
       
        } else {
            System.out.println("The words are different");
        }
        scanner.close();
    }
}
