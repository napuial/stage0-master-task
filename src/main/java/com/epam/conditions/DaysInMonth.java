package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if(year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31");
            case 4, 6, 9, 11 -> System.out.println("30");
            case 2 -> {
                if (leapYear(year))
                    System.out.println("29");
                else
                    System.out.println("28");
            }
        }
    }

    private boolean leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            else
                return true;
            }
        else
            return false;
    }

}
