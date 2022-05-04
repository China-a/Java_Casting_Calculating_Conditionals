package Lessons;
import java.util.Scanner;

// Your program runs and evaluates if that expression is true. 
// If the expression is true, then the program executes the code found inside of the code block in the if statement.
// 
// This is an example of how to create an if statement 
// public class Conditionals {
//     public static void main(String[] args) {
//         int number = 21;
//         if (number > 8) {
//             System.out.println("The number was greater than 8 by " + (number - 8));
//         }
//         // prints The number was greater than 8 by 13
//     }
// }


// public class Conditionals {
//     public static void main(String[] args) {
//         int number = 21;

//         if (number == 21) {
//                 System.out.println("The number is equal to 21");
//         } // prints The number is equal to 21
        
//         if (number != 21) {
//                 System.out.println("The number is not equal to 21");
//         } // doesn't print
        
//         if (number < 25) {
//                 System.out.println("The number is less than 25");
//         } // prints The number is less than 25
        
//         if (number <= 21) {
//                 System.out.println("The number is less than 21");
//         } // prints The number is less than 21
        
//         if (number >= 20) {
//                 System.out.println("The number is greater than 20");
//         } // prints The number is greater than 20
//     }
// }

// The else command is what allows the false statement to print 
// public class Conditionals {
//     public static void main(String[] args) {
//         int number = 21;

//     if (number != 21) {
//             System.out.println("The number is not equal to 21");
//     } else {
//             System.out.println("The number is equal to 21");
//     } // prints The number is equal to 21

//     }
// }

// This is an example of multiple conditions to be checked 
// public class Conditionals {
//     public static void main(String[] args) {
//         int number = 30;

//         if (number == 10) {
//                 System.out.println("The number is ten");
//         } else if (number == 20) {
//                 System.out.println("The number is twenty");
//         } else if (number == 30) {
//                 System.out.println("The number is thirty!");
//                 // execution will stop here and print The number is thirty
//         } else {
//                 System.out.println("The number is not ten, twenty or thirty!");
//         }
//     }
// }
// The conditional statements are executed from the top down
// Once one of the statements is true, that code block gets executed and the conditionals that follow will not be checked


// This is an example of comparing strings and using the equals() method to properly execute the comparison
// public class Conditionals {
//     public static void main(String[] args) {
//         String happy = "happy";

//         if (happy.equals("happy")) {
//                 System.out.println("The strings were the same!");
//                 // this statement will be executed
//         } else {
//             System.out.println("The strings were different!");
//         }
//     }
// }


// This is an example of a FizzBuzz coding exercise, but we're calling it the Buzz Lightyear exercise 
// Able to be the combination of the scanner and conditional statements and how it works together to to output information based on what the user inputs.
public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = Integer.valueOf(scanner.nextLine());
        
        if (number % 2 == 0 && number % 5 == 0) {
                System.out.println("Buzz Lightyear");
        } else if (number % 2 == 0) {
                System.out.println("Buzz");
        } else if (number % 3 == 0) {
                System.out.println("Lightyear");
        } else {
                System.out.println(number);
        }
        scanner.close();
    }
}
