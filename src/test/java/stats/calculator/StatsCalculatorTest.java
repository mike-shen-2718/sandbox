package stats.calculator;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import org.junit.Before;
import org.junit.Test;

public class StatsCalculatorTest {
    Random random = new Random();
    Integer[] arr;

    @Before
    public void setUp(){
        arr = new Integer[10];
        for(int i = 0; i < 10; i++){
            arr[i] = random.nextInt(100);
        }
    }

    @Test
    public void minOfWithSomeElements(){
        Integer min = Arrays.stream(arr).mapToInt(Integer::intValue).min().getAsInt();
        Integer minCal = StatsCalculator.minOf(arr);
        assertThat(minCal.equals(min));
    }

    @Test(expected = IllegalArgumentException.class)
    public void minOfWithNoElements(){
        StatsCalculator.minOf(new Integer[]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void minOfWithNoElements_2(){
        StatsCalculator.minOf(null);
    }

}
