package Lessons;
import java.util.Scanner;

// The addition example shows how you can read input to print the sum of two numbers inputted by a user.
// public class Calculating {
//     public static void main(String[] args) {
//         int addedNums = 1 + 2;
//         System.out.println(addedNums);

//         // Add numbers together that are entered in the console
//         Scanner scanner = new Scanner(System.in);
//
//         System.out.println("Enter a number:");
//         int numOne = Integer.valueOf(scanner.nextLine());
//         System.out.println("Enter another number:");
//         int numTwo = Integer.valueOf(scanner.nextLine());

//         // Assign a variable to print the sum of the two numbers
//         int numbers = numOne + numTwo;
//
//         System.out.println(numOne + " + " + numTwo + " = " + numbers);

//         scanner.close();
//     }
// }


// This is an example of subtraction
// public class Calculating {
//     public static void main(String[] args) {
//         int subtractedNums = 14 - 8;
//         System.out.println(subtractedNums);
//     }
// }

// This is an example of division
//  public class Calculating {
//      public static void main(String[] args) {
//         int dividedNums = 22 / 11;
//         System.out.println(dividedNums);
//     }
//  }

//This is an example of Modulus 
// public class Calculating {
//     public static void main(String[] args) {
//         int remainderOfNums = 10 % 2;
//         System.out.println(remainderOfNums);
//    }
// }

// This is an example for using Parentheses to calculate (Also, keep in mind java follows PEMDAS)
// public class Calculating {
//     public static void main(String[] args) {
//         int parentheses = (2 + 2) + 4 * (1 + 3);
//         System.out.println(parentheses); // prints 20
        
//         int noParentheses = 2 + 2 + 4 * 1 + 3;
//         System.out.println(noParentheses); // prints 11
//    }
// }

// If you don't "type-cast" the number as a double, then the resulting value will be an integer if all the variables in the division expression are integers. 
// Recalling back to the variables section of the course, you may recall that type casting your number as a double is only necessary when the number isn't going to be whole. 
// This remains true when you're doing calculations, so if your result is not going to be a whole number, always be sure to use doubles.

// This an example of making sure that you know when you need to have a precise value 
// public class Calculating {
//     public static void main(String[] args) {
//         int usingInt = 5 / 2;
//         System.out.println(usingInt); // prints 2
//
//         double numOne = 5;
//         double numTwo = 2;
//         double usingDouble = numOne / numTwo;
//         System.out.println(usingDouble); // prints 2.5
//    }
// }

// When you ran the code in the "Finding the Average" section, you could see that the 'floatingPointNumbers1' and 'floatingPointNumbers2' variables printed different outputs. 
// The reason for this is that, 'floatingPointNumbers1' were whole numbers within the parentheses while 'floatingPointNumbers2' were doubles. This is a key thing to remember... when in doubt, be explicit when writing code in Java and you will avoid these types of headaches!
// 
// This is an example of finding the average 
public class Calculating {
    public static void main(String[] args) {
        int wholeNumbers = (2 + 2 + 2) / 3;
        System.out.println(wholeNumbers); // prints 2
        
        double floatingPointNumbers1 = (5 + 3 + 1) / 3;
        System.out.println(floatingPointNumbers1); // prints 3.0
        
        double floatingPointNumbers2 = (5.0 + 3.0 + 2.0) / 3;
        System.out.println(floatingPointNumbers2); // prints 3.33 repeating
   }
}