package Source;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class Question1C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String:");
        String a1 = sc.next();
        System.out.println("Enter Second String:");
        String a2 = sc.next();
        BiConsumer<String, String> f1 = (value1, value2) ->
                System.out.println(value1+" "+value2);
        f1.accept(a1, a2);

    }
}
