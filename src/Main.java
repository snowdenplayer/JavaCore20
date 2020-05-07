import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the number");

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        MyThread myThread = new MyThread(t);
        myThread.run();

        Runnable runnable = new RunnableThread(t);
        runnable.run();
    }
}
