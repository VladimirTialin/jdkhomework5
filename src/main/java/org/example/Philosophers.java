package org.example;

import java.util.Random;

public class Philosophers {
    private  boolean flag=true;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public  boolean isFlag() {
        return flag;
    }

    public void lunch() {
        try{
        Thread.sleep(500);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

        System.out.println(getName()+": Обедаю!");

        flag=false;

    }
    public void thinking(){
        Random rnd =new Random();
        try{
        Thread.sleep(rnd.nextInt(3000));
        }catch (InterruptedException ex)
        {
           ex.printStackTrace();
        }
        System.out.println(getName()+": Я размышляю....");

        flag=true;
    }

}
