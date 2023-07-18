package day25;

import java.util.ArrayList;

public class Concurrency {

    public static void main(String[] args) {
        
        
        Runnable runner = () -> {

              

         {
            System.out.println("Inturrepd for " + Thread.currentThread().getName() +" "+ Thread.currentThread().isInterrupted());
              if(Thread.currentThread().isInterrupted()){
                return;
               }
               System.out.println("Running in " + Thread.currentThread().getName());
                
              
        }

  
         
        };
        Thread thread1 = new Thread(runner);
        thread1.setName("Ismail");
       


         Thread thread2 = new Thread(runner);
        thread2.setName("Bilal");
      

            Thread thread3 = new Thread(runner);
        thread3.setName("Ayse");
       

        ArrayList<Thread> threads = new ArrayList<>();
        threads.add(thread1);
          threads.add(thread2);
                threads.add(thread3);

                for(Thread t : threads){

                    t.start();
                 

                }

                thread3.interrupt();
                 
    }
    
   

    } 

