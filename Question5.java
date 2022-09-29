package Source;
interface Demo{
    static void displayStatic(){
        System.out.println("This is demo static method");
    }
    default void defaultmethod(){
        System.out.println("Default method");
    }
    void method();
}
interface Demo1{
    static void displayStatic1(){
        System.out.println("This is demo Static method");
    }
    default void defaultmethod(){
        System.out.println("Default method");
    }
}

public class Question5 implements Demo,Demo1{
    @Override
    public void method() {
        System.out.println("Shimanshu");
    }
    @Override
    public void defaultmethod(){
        System.out.println("Override default");
    }

    public static void main(String[] args) {
        Question5 S = new Question5();
        S.method();
        Demo.displayStatic();
        S.defaultmethod();

    }
}
