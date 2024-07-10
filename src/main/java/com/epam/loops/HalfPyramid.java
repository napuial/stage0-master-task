package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int j = 1; j <= cathetusLength; j++) {
            System.out.print(" ".repeat(cathetusLength - j));
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
