import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main{
    public static void main(String[] args) {
        newExecutorService executorService = new newExecutorService(2);
        executorService.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We run it 1");
        });
        executorService.submit(() -> System.out.println("Start 1"));

        ExecutorService newexecutorService = Executors.newSingleThreadExecutor();
        newexecutorService.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("We run it 2");
        });
        newexecutorService.submit(() -> System.out.println("Start 2"));
    }
    }