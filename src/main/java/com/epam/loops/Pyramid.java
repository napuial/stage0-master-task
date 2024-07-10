package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        String[] result = new String[cathetusLength];
        String temp = "";
        int pyramidHeight = cathetusLength - 1;
        int counter = 0;
        for (int j = cathetusLength; j > 0 ; j--) {
            for (int i = cathetusLength; i > 1; i--) {
                temp += i;
            }
            for (int i = 1; i <= cathetusLength; i++) {
                temp += i;
            }
            result[counter] = temp;
            temp = "";
            counter++;
            cathetusLength--;
        }
        for (int i = pyramidHeight; i >= 0; i--) {
            System.out.print(" ".repeat(i));
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
