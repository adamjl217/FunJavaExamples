package lahey.implementation;

public class NumberModifiers {

    public static int factorial(int n) {
        int calc = 1;
        for(int i = 1; i < (n+1); i++) calc = calc * i;
        return calc;
    }

    public static void fizzBuzz() {
        for(int i = 1; i <= 100; i++) {
            System.out.print("\n" + i);

            if(i%3 == 0 && i%5 == 0)
                System.out.print("	FizzBuzz");
            else if(i%3 == 0)
                System.out.print("	Fizz");
            else if(i%5 == 0)
                System.out.print("	Buzz");

        }
    }

}
