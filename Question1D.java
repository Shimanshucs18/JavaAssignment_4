package Source;

import java.util.Scanner;
import java.util.function.Function;

public class Question1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String a1 = sc.next();

        Function<String,String> f= (x)->x.toUpperCase();
        System.out.println(f.apply(a1));
    }
}
