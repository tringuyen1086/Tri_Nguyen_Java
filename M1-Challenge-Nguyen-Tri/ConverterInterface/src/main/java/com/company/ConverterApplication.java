package com.company;

import java.util.Scanner;

public class ConverterApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Converter input1 = new ConverterIf();
        Converter input2 = new ConverterSwitch();

        int dayNumber = 0;
        while (dayNumber == 0 || dayNumber > 7) {
            System.out.print("Please enter the value for the dayNumber: ");
            dayNumber = Integer.parseInt(input.nextLine());
            System.out.println("ConverterIf says: " + input1.convertDay(dayNumber));
            System.out.println("ConverterSwitch says: " + input2.convertDay(dayNumber));
        }

        int monthNumber = 0;
        while (monthNumber == 0 || monthNumber > 12) {
            System.out.print("Please enter the value for the monthNumber: ");
            monthNumber = Integer.parseInt(input.nextLine());
            System.out.println("ConverterIf says: " + input1.convertMonth(monthNumber));
            System.out.println("ConverterSwitch says: " + input2.convertMonth(monthNumber));
        }
    }
}
