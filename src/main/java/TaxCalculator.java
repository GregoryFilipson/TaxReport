import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.LongAdder;


public class TaxCalculator {
    LongAdder sum = new LongAdder();
    final int ARRAY_SIZE = 3;
    final int MAX_VALUE = 1000;

    public void generateAndSumArray() {
        Random random = new Random();
        long[] profit = new long[ARRAY_SIZE];
        for (int i = 0; i < profit.length; i++) {
            profit[i] = Math.abs(random.nextInt(MAX_VALUE));
            sum.add(profit[i]);
        }
        System.out.println(Arrays.toString(profit));
    }
}
