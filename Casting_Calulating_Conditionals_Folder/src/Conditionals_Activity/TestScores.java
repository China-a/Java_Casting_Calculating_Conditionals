package Conditionals_Activity;
import java.util.Scanner;
public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name a number between 0 and 100");
        int number = Integer.valueOf(scanner.nextLine());
        
        if (number <= 100 && number >= 90 ) {
            System.out.println("Your grade is a A");
        }
         else if ( number < 90 && number >= 80) {
            System.out.println("Your grade is a B");
        }
        else if ( number < 80 && number >= 70) {
            System.out.println("Your grade is a C");
        }
        else if ( number < 70 && number >= 60) {
            System.out.println("Your grade is a D");
        }
        else {
            System.out.println("Your grade is a F :(");
        }
        scanner.close();
    }
}
