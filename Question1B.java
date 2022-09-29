package Source;

import java.util.Scanner;
import java.util.function.Function;

public class Question1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no");
        int a = sc.nextInt();
        Function<Integer,Integer> f= x->x+1; // Functional Interface is that contains only one abstract Method
        System.out.println(f.apply(a));
    }
}
