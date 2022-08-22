package ru.netology.javaqa.stats.service;

public class StatsService {

    public int amountOfSales(int[] daysOfSales) {
        int amount = 0;
        for (int i = 0; i < daysOfSales.length; i++) {
            amount += daysOfSales[i];
        }
        return amount;
    }

    public int averageAmountOfSales(int[] daysOfSales) {
        int average = 0;
        int amount = 0;
        for (int i = 0; i < daysOfSales.length; i++) {
            amount += daysOfSales[i];
        }
        average = amount / daysOfSales.length;
        return average;
    }


    public int maxSales(int[] daysOfSales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : daysOfSales) {
            if (sale >= daysOfSales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] daysOfSales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : daysOfSales) {
            if (sale <= daysOfSales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lowAverageSales(int[] daysOfSales) {
        int aver = averageAmountOfSales(daysOfSales);
        int low = 0;
        for (int i=0; i < daysOfSales.length; i++) {
            int x = daysOfSales[i];
            if (x < aver){
                low = low + 1;
            }
        }
        return low;
        }

    public int highAverageSales(int[] daysOfSales) {
        int aver = averageAmountOfSales(daysOfSales);
        int high = 0;
        for (int i = 0; i < daysOfSales.length; i++){
            int x = daysOfSales[i];
            if (x > aver) {
                high = high +1;
            }
        }
        return high;
    }
}


        /*int amount = 0;
        int average = 0;
        for (int sale : daysOfSales) {
            int x = 0;
            amount += daysOfSales[x];
        }
        average = amount / daysOfSales.length;

        int lowAv = 0;
        for (int avMonth : daysOfSales) {
            if (avMonth < lowAv) {
                lowAv = avMonth; }
        }
        return lowAv;
    }

    }

         */



