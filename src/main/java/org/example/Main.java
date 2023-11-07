package org.example;
public class Main {
    public static void main(String[] args) {
        String[] namesPhilosoph= {"Конфуций","Платон","Сократ","Геродот","Лао"};
        Life life=new Life();
        Thread[] thread= new Thread[namesPhilosoph.length];
        for (int i = 0; i < namesPhilosoph.length; i++){
            thread[i]= new Thread(new Philosophers(life,namesPhilosoph[i]));
        }
        for (int i = 0; i < thread.length; i++) {
            thread[i].start();
        }
    }
}