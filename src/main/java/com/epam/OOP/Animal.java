package com.epam.OOP;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public Animal() {

    }

    public String getDescription() {
        return ("This animal is mostly "
                .concat(this.color)
                .concat(". It has ")
                .concat(String.valueOf(this.numberOfPaws))
                .concat(" ")
                .concat(checkPaws())
                .concat(" and ")
                .concat(checkFur())
                .concat(" fur."));
    }

    private String checkPaws() {
        return this.numberOfPaws != 1 ? "paws" : "paw";
    }

    private String checkFur() {
        return this.hasFur ? "a" : "no";
    }

    public static void main(String[] args) {
        System.out.println(new Bird().getDescription());
        System.out.println(new Dog().getDescription());
    }
}
