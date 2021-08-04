package ru.netology.stats;

public class StatsService {
    public int salesAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageAmount(int[] sales) {
        int result = salesAmount(sales);
        int average = result / 12;

        return average;
    }


    public int maxAmount(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minAmount(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int SalesIsMoreAverage(int[] sales) {
        int average = averageAmount(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > average) {
                month = month + 1;
            }
        }
        return month;
    }

    public int SalesIsLessAverage(int[] sales) {
        int average = averageAmount(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < average) {
                month = month + 1;
            }
        }
        return month;
    }
}
