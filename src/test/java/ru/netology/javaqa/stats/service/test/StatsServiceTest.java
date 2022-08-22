package ru.netology.javaqa.stats.service.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.stats.service.StatsService;

public class StatsServiceTest {
    @Test
    public void AmountCounting() {
        StatsService service = new StatsService();
        int[] daysOfSales = {-1, -2, -3, 4};
        int expected = -2;
        int actual = service.amountOfSales(daysOfSales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AverageCounting(){
        StatsService service = new StatsService();
        int [] daysOfSales = {0, 1, -5};
        int expected = -1;
        int actual = service.averageAmountOfSales(daysOfSales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxSalesCounting(){
        StatsService service = new StatsService();
        int [] daysOfSales = {-54, 76, 0, 28};
        int expected = 2;
        int actual = service.maxSales(daysOfSales);

        Assertions.assertEquals(expected, actual);

        }

        @Test
    public void MinSalesCounting(){
        StatsService service = new StatsService();
        int [] daysOfSales = {-5, 0, 58};
        int expected = 1;
        int actual = service.minSales(daysOfSales);

        Assertions.assertEquals(expected, actual);
        }

        @Test
    public void LowAverageCounting(){
        StatsService service = new StatsService();
        int [] daysOfSales = {-1, 0, 55, 10};
        int expected = 3;
        int actual = service.lowAverageSales(daysOfSales);

        Assertions.assertEquals(expected, actual);
        }

        @Test
    public void HighAverageCounting(){
        StatsService service = new StatsService();
        int [] daysOfSales = {-1, 0, 55, 10};
        int expected = 1;
        int actual = service.highAverageSales(daysOfSales);

        Assertions.assertEquals(expected, actual);
        }

        }


