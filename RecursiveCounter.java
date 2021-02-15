package com.company;

public class RecursiveCounter implements SumCounter {

    @Override
    public int count(int number) {
        if (number < 0) {
          throw new IllegalArgumentException("EXCEPTION: Not natural number!");
        } else if (number < 10) {
            return number;
        } else {
            int result = (count(number / 10)) + number % 10;
            return result;
        }
    }
}
