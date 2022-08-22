
import ru.netology.javaqa.stats.service.StatsService;

public class Main {
    public static void main(String[] args) {
        int[] daysOfSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int summa = service.amountOfSales(daysOfSales);
        System.out.println(summa);

        int avSale = service.averageAmountOfSales(daysOfSales);
        System.out.println(avSale);

        int max = service.maxSales(daysOfSales);
        System.out.println(max);

        int min = service.minSales(daysOfSales);
        System.out.println(min);

        int lowSales = service.lowAverageSales(daysOfSales);
        System.out.println(lowSales);

        int highSales = service.highAverageSales(daysOfSales);
        System.out.println(highSales);
    }
}