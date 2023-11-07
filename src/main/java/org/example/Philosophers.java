package org.example;

import java.util.Random;

public class Philosophers  implements Runnable{
    private  boolean flag=true;
    Life life;
    String name;
    int count=0;

    public Philosophers(Life eat, String name) {
        this.life = eat;
        this.name = name;
    }

    public  boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public void thinking(){
        Random rnd =new Random();
        try{
            System.out.printf("%s: Я размышляю....(%d раз)%n",name,count+1);
            Thread.sleep(rnd.nextInt(2000));
            flag=!flag;
        }catch (InterruptedException ex)
        {
           ex.printStackTrace();
        }

    }

    @Override
    public void run() {
        while(count!=3){
            if(this.flag){
             life.eat(this);
             thinking();
            }
            count++;
        }
    }
}
