package Calculations_Activity;
import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                System.out.println("Enter a number:");
                int numOne = Integer.valueOf(scanner.nextLine());
                
                System.out.println("Enter another number:");
                int numTwo = Integer.valueOf(scanner.nextLine());
        
                // Assign a variable to print the sum of the two numbers
                int numbersadded = numOne + numTwo;
                int numberssubstracted = numOne - numTwo;
                int numbersmultiplied = numOne * numTwo;
                float numbersdivided = (float)numOne / (float)numTwo;
                int numbersmodulus = numOne % numTwo;
        
                System.out.println(numOne + " + " + numTwo + " = " + numbersadded);
                System.out.println(numOne + " - " + numTwo + " = " + numberssubstracted);
                System.out.println(numOne + " * " + numTwo + " = " + numbersmultiplied);
                System.out.println(numOne + " / " + numTwo + " = " + numbersdivided);
                System.out.println(numOne + " % " + numTwo + " = " + numbersmodulus);
                scanner.close();
}

}
