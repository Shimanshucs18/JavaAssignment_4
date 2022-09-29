package Source;


import java.util.function.BiFunction;

class demo{
    public int add(int a, int b) { return a+b; }
    public int subtract (int a, int b) { return a-b; }
}

public class Question2 {
    public static int multiply(int a, int b) { return a*b; }
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> add = new demo()::add;
        BiFunction<Integer,Integer,Integer> subtract = new demo()::subtract;
        BiFunction<Integer,Integer,Integer> multiply = Question2::multiply;
        System.out.println(add.apply(1,2));
        System.out.println(subtract.apply(2,3));
        System.out.println(multiply.apply(3,4));


    }
}
