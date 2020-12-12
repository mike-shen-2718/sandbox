package stats.calculator;

/**
 * @author Mike.Shen
 * @date 2020/12/12
 **/
public class StatsCalculator {

    public static <T extends Comparable<T>> T minOf(T[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("No element provided");
        }
        T min = null;
        for(T t : arr){
            min = min == null ? t : (t.compareTo(min) < 0 ? t : min);
        }
        return min;
    }

}
