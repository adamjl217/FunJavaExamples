package lahey.application;

import lahey.implementation.Fibonacci;
import lahey.implementation.NumberModifiers;
import lahey.implementation.StringModifiers;

public class Application {

    public static void main(String[] args) {
        String testString = "test string";

        System.out.println(testString + " is reversed here: " + StringModifiers.reverseString(testString));
        
        System.out.println(testString + " is a palindrome: " + StringModifiers.isPalindrome(testString));

        int count = 20;

        System.out.println("\n\nThe " + count + " number of Fibonacci is " + Fibonacci.iterative(count));
        System.out.println("The " + count + " number of Fibonacci is " + Fibonacci.recursive(count));

        NumberModifiers.fizzBuzz();

        int calc = 5;
        System.out.println("\n\nThe factorial of " + calc + " is " + NumberModifiers.factorial(calc));

        System.out.println("\n\nThe modified string is " + StringModifiers.reverseString(testString));


    }

}
