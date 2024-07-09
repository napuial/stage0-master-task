package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        String code = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i <= code.length() - 1; i++) {
            sum += Integer.parseInt(String.valueOf(code.charAt(i)));
        }
        System.out.println(sum);
    }
}
