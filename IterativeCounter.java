package com.company;

public class IterativeCounter implements SumCounter {

    @Override
    public int count(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("EXCEPTION: Not natural number!");
        } else {
            int result = 0;
            while (number > 0) {
                int mod = number % 10;
                result += mod;
                number /= 10;
            }
            return result;
        }
    }
}
