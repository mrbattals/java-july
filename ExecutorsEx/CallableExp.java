package ExecutorsEx;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class CallableExp {

    public static void main(String[] args) {
        
        Callable<String> t1 = () -> {
            return "anything";
        };

        ExecutorService service1 = Executors.newSingleThreadExecutor();
        service1.submit(t1);
        
        FutureTask<String> futureTask = new FutureTask<String>(t1);

        futureTask.run();
        try {
            String result = futureTask.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        service1.shutdown();
    }

    
    
}
