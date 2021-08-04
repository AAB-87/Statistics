package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class MyStatServiceTest {
    @Test
    public void salesAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.salesAmount(sales);

        assertEquals(expected, actual);

    }

    @Test
    public void averageAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageAmount(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthWithMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxAmount(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void numberOfMonthWithMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minAmount(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void TheAmountOfSalesIsMoreAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.SalesIsMoreAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void TheAmountOfSalesIsLessAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.SalesIsLessAverage(sales);

        assertEquals(expected, actual);
    }
}
