package ExecutorsEx;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exp {

    public static void main(String[] args) {
        
   
    
    ExecutorService service = Executors.newFixedThreadPool(5);

    Runnable r1 = () -> {
        System.out.println("Runnable 1:" + Thread.currentThread().getName());
    };

    Runnable r2 = () -> {
        System.out.println("Runnable 1:" + Thread.currentThread().getName());
    };

    Runnable r3 = () -> {
        System.out.println("Runnable 1:" + Thread.currentThread().getName());
    };

    Runnable r4 = () -> {
        System.out.println("Runnable 1:" + Thread.currentThread().getName());
    };

   Runnable r5 = () -> {
        System.out.println("Runnable 1:" + Thread.currentThread().getName());
    };

    service.submit(r1);
     service.submit(r2);
      service.submit(r3);
       service.submit(r4);
        service.submit(r5);

        service.shutdown();


 }



    
}
