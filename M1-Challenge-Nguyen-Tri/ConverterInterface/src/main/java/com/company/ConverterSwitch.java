package com.company;

public class ConverterSwitch implements Converter {

    public String convertDay (int dayNumber) {
        String dayConverted = "";

        switch (dayNumber) {
            case 1:
                dayConverted  = "Sunday";
                break;
            case 2:
                dayConverted  = "Monday";
                break;
            case 3:
                dayConverted  = "Tuesday";
                break;
            case 4:
                dayConverted  = "Wednesday";
                break;
            case 5:
                dayConverted  = "Thursday";
                break;
            case 6:
                dayConverted  = "Friday";
                break;
            case 7:
                dayConverted  = "Saturday";
                break;
            default:
                return "Please enter the value between 1 and 7 for the dayNumber.";
        }
        return dayConverted ;
    }

    public String convertMonth (int monthNumber) {
        String monthConverted = "";

        switch (monthNumber) {
            case 1:
                monthConverted = "January";
                break;
            case 2:
                monthConverted = "February";
                break;
            case 3:
                monthConverted = "March";
                break;
            case 4:
                monthConverted = "April";
                break;
            case 5:
                monthConverted = "May";
                break;
            case 6:
                monthConverted = "June";
                break;
            case 7:
                monthConverted = "July";
                break;
            case 8:
                monthConverted = "August";
                break;
            case 9:
                monthConverted = "September";
                break;
            case 10:
                monthConverted = "October";
                break;
            case 11:
                monthConverted = "November";
                break;
            case 12:
                monthConverted = "December";
                break;
            default:
                return "Please enter the value between 1 and 12 for the monthNumber.";
        }
        return monthConverted;
    }
}
