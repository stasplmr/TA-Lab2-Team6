package com.company;

public class Main {

    public static void main(String[] args) {

        try {
            sumDigitHandler RecursiveHandler = new sumDigitHandler(new RecursiveCounter());
            System.out.println("TASK 1: Recursive sum of digits");
            System.out.println("Sum of digits of 123: " + RecursiveHandler.sumDigits(123));
            System.out.println("Sum of digits of 0: " + RecursiveHandler.sumDigits(0));
            System.out.println("Sum of digits of 1: " + RecursiveHandler.sumDigits(1));
            System.out.println("Sum of digits of 36: " + RecursiveHandler.sumDigits(36));
            System.out.println("Sum of digits of -231: " + RecursiveHandler.sumDigits(-231));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            sumDigitHandler IterativeHandler = new sumDigitHandler(new IterativeCounter());
            System.out.println("\nIterative sum of digits");
            System.out.println("Sum of digits of 123: " + IterativeHandler.sumDigits(123));
            System.out.println("Sum of digits of 0: " + IterativeHandler.sumDigits(0));
            System.out.println("Sum of digits of 1: " + IterativeHandler.sumDigits(1));
            System.out.println("Sum of digits of 36: " + IterativeHandler.sumDigits(36));
            System.out.println("Sum of digits of -231: " + IterativeHandler.sumDigits(-231));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            AckermannHandler obj = new AckermannHandler();
            System.out.println("\nTASK 2: Ackermann function");
            System.out.println("A(3, 3) = " + obj.getAckermannResult(3, 3));
            System.out.println("A(0, 0) = " + obj.getAckermannResult(0, 0));
            System.out.println("A(1, 2) = " + obj.getAckermannResult(1, 2));
            System.out.println("A(3, 3) = " + obj.getAckermannResult(4, 4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
