package org.example;
public class Main {
    public static void main(String[] args)  {
        String[] namesPhilosoph= {"Конфуций","Платон","Сократ","Геродот","Лао","Петька"};
        Life[] lives= new Life[namesPhilosoph.length];
        Thread[] thread= new Thread[namesPhilosoph.length];
        for (int i = 0; i < namesPhilosoph.length; i++){
            lives[i]=new Life();
            lives[i].name(namesPhilosoph[i]);
            thread[i]= new Thread(lives[i]);
        }
        for (int i = 0; i < thread.length; i++) {
            thread[i].start();
        }
    }
}