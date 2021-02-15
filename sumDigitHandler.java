package com.company;

public class sumDigitHandler {

    private SumCounter counter;

    public sumDigitHandler(SumCounter counter) {
        this.counter = counter;
    }

    public int sumDigits(int number) {
        return counter.count(number);
    }
}
