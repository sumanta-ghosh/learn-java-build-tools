package org.example;

import java.util.StringJoiner;

public class Add {
    public static void main(String[] args) {
        double sum = 0;
        StringJoiner numbers = new StringJoiner(" + ");
        for (String arg : args) {
            try {
                double num = Double.parseDouble(arg);
                sum += num;
                numbers.add(arg);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + arg);
            }
        }
        System.out.println("Sum of ");
        System.out.println(numbers + " = " + sum);
    }
}
