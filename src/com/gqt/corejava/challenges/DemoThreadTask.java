package com.gqt.corejava.challenges;
interface Runnable {
    void run();
}

interface Callable {
    void call();
}

class ThreadClass implements Runnable {
    public void run() { System.out.println("Thread is running..."); }
}

class TaskClass implements Callable {
    public void call() { System.out.println("Task is being executed..."); }
}
public class DemoThreadTask {
    public static void main(String[] args) {
        ThreadClass thread = new ThreadClass();
        thread.run();

        TaskClass task = new TaskClass();
        task.call();
    }
}
