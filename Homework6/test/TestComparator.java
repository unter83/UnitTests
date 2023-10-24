import org.junit.jupiter.api.Test;

import task1.Comparator;
import task1.ConsoleInterface;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestComparator {
    @Test
    void testAverageCalculation() {
        Comparator comparator = new Comparator();
        int[] array = new int[] {1,2,3};
        assertThat(comparator.getAverage(array)).isEqualTo(2.0);
        array = new int[] {0,0,0};
        assertThat(comparator.getAverage(array)).isZero();
    }
    @Test
    void testComparator() {
        Comparator comparator = new Comparator();
        int[] arrayA = new int[] {1,2,3};
        int[] arrayB = new int[] {2,3,4};
        assertThat(comparator.compare(arrayA, arrayA)).isZero();
        assertThat(comparator.compare(arrayA, arrayB)).isEqualTo(-1);
        assertThat(comparator.compare(arrayB,arrayA)).isEqualTo(1);
    }

    @Test
    void testTestComparatorWithEqualArrays() {
        ConsoleInterface consoleInterface = new ConsoleInterface();
        int[] arrayA = new int[] {1,2,3};
        int[] arrayB = new int[] {3,2,1};
        assertEquals("Средние значения равны", consoleInterface.showResult(arrayA, arrayB));
    }
    @Test
    void testTestComparatorWithBiggestFirstArray() {
        ConsoleInterface consoleInterface = new ConsoleInterface();
        int[] arrayA = new int[] {10,2,3};
        int[] arrayB = new int[] {1,2,3};
        assertEquals("Первый список имеет большее среднее значение", consoleInterface.showResult(arrayA, arrayB));
    }




}
