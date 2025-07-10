package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) throws InterruptedException {
        System.out.println(new App().getMessage());
	Thread.sleep(100000);
    }

    private final String getMessage() {
        return message;
    }

}
