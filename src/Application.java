import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService ex = Executors.newFixedThreadPool(20);
        ex.awaitTermination(5, TimeUnit.SECONDS);
        ex.execute(new RunnableThread(5));

        ex.shutdown();
    }
}
