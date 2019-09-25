package com.example.beanpostprocessorsimple;

public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(max = 2, min = 7)
    private int repeat;
    private String message;

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("Message: " + message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
