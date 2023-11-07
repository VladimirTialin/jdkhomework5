package org.example;

public class Life {
     public synchronized void eat(Philosophers philosophers){
         if (philosophers.isFlag()) {
             try {
                 Thread.sleep(500);
                 philosophers.setFlag(false);
                 System.out.printf("%s: Обедаю!(%d раз)%n",philosophers.name,philosophers.count+1);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
     }
}
