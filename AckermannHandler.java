package com.company;

public class AckermannHandler {

    private int ackermannFunction(int m, int n) {
            if (m < 0 || n < 0) {
                throw new IllegalArgumentException("EXCEPTION: m and n must be => 0");
            } else {
                if (m == 0) {
                    return n + 1;
                }
                if (m > 0 && n == 0) {
                    return ackermannFunction(m - 1, 1);
                }
                if (m > 0 && n > 0) {
                    return ackermannFunction(m - 1, ackermannFunction(m, n - 1));
                }
            }
            return n;
    }

    public int getAckermannResult(int m, int n) {
        if (m > 3 || n > 3) {
            throw new IllegalArgumentException("EXCEPTION: Maximum recursion depth exceeded");
        } else {
            return ackermannFunction(m, n);
        }
    }

}
