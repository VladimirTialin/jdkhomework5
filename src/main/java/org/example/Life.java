package org.example;

public class Life implements Runnable{
    private String name;

    public void name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        try {
            lifePhilosopher(getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void lifePhilosopher(String name) throws InterruptedException {
        int count=0;
        Philosophers philosophers = new Philosophers();
        philosophers.setName(name);
        while(count<3) {
            if (!philosophers.isFlag()) {
                count++;
                philosophers.thinking();
            }
            else philosophers.lunch();
        }
    }

}
