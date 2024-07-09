package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide < 0 || secondSide < 0 || thirdSide < 0){
            System.out.println("it's not a triangle");
            return;
        }
        double max = Math.max(Math.max(firstSide, secondSide), thirdSide);
        if (max == firstSide) {
            if (firstSide < secondSide + thirdSide) System.out.println("this is a valid triangle");
            else System.out.println("it's not a triangle");
        } else if (max == secondSide) {
            if (secondSide < firstSide + thirdSide) System.out.println("this is a valid triangle");
            else System.out.println("it's not a triangle");
        } else if (max == thirdSide) {
            if (thirdSide < firstSide + secondSide) System.out.println("this is a valid triangle");
            else System.out.println("it's not a triangle");
        }
    }
}
