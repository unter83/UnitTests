package task1;


import java.util.Arrays;

public class Comparator {

    public double getAverage(int[] array) {
        return Arrays.stream(array).average().getAsDouble();
    }

    public int compare(int[] arrayA, int[] arrayB) {
        return Double.compare(getAverage(arrayA), getAverage(arrayB));
    }


}
