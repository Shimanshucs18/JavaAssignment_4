package Source;


public class Question3 {

    public static void main(String[] args)
    {
        Runnable myThread = () -> // Create a Thread
        {

            Thread.currentThread().setName("Hello Shimanshu"); // Used to current thread
            System.out.println(
                    Thread.currentThread().getName()
                            + " Sharma");
        };

        Thread run = new Thread(myThread); // Thread class by passing and References a Thread

        run.start(); // Thread Starting
    }
}

