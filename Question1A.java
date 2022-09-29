package Source;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Question1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner is the util package and get user Input
        System.out.println("Enter the First no.");
        int num1 = sc.nextInt();
        System.out.println("Enter the second no.");
        int num2 = sc.nextInt();

        BiFunction<Integer,Integer,Boolean> b=(x, y)->x>y; // BiFunction is the basically Util Function they are Accept Two Arguments and produces a results
        System.out.println(b.apply(num1,num2));
    }
}
