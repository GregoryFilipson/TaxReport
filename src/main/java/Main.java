import java.util.concurrent.atomic.LongAdder;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TaxCalculator taxCalculator = new TaxCalculator();
        Thread countTax1 = new Thread(null, taxCalculator::generateAndSumArray, "Магазин 1");
        Thread countTax2 = new Thread(null, taxCalculator::generateAndSumArray, "Магазин 2");
        Thread countTax3 = new Thread(null, taxCalculator::generateAndSumArray, "Магазин 3");

        countTax1.start();
        countTax2.start();
        countTax3.start();

        countTax1.join();
        countTax2.join();
        countTax3.join();

        System.out.println(taxCalculator.sum);

    }
}
