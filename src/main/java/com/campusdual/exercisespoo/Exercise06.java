package com.campusdual.exercisespoo;

import java.util.Calendar;

public class Exercise06 {
    // Comprobar cuál es la estación del año
    // Comprobar si es de mañana, de tarde o de noche

    public static String checkSeason(int month){
        String season = "";
        switch (month+1) {
            case 1:
            case 2:
            case 3:
                season="Winter";
                break;
            case 4:
            case 5:
            case 6:
                season="Spring";
                break;
            case 7:
            case 8:
            case 9:
                season="Summer";
                break;
            case 10:
            case 11:
            case 12:
                season="Autumn";
                break;
            default:
                season="Month must be 0-11";
                break;
        }
        return season;
    }

    public static void checkHour(int hour){
        switch (hour) {
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Night");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Morning");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("Afternoon");
                break;
            default:
                System.out.println("Hour must be 0-23");
                break;

        }
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        System.out.println(checkSeason(month));
        checkHour(hour);

    }
}
