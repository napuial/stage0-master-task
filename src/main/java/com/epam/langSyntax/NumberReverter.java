package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int s = (number - number % 100) / 100;
        number = number - s * 100;
        int d = (number - number % 10) / 10;
        int j = number - d * 10;
        System.out.println(j * 100 + d * 10 + s);
    }

}
