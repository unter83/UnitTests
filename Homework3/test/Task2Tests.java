import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task2Tests {

    @ParameterizedTest
    @CsvSource(value = {"2, true",
            "3, false",
            "6, true",
            "13, false"})
    void evenOddTesting(int value, boolean result) {
        assertThat(Task2.evenOddNumber(value)).isEqualTo(result);
    }

    @ParameterizedTest
    @CsvSource(value = {"25, true",
            "13, false",
            "60, true",
            "130, false"})

    void numberInIntervalTesting(int value, boolean result) {
        assertThat(Task2.numberInInterval(value)).isEqualTo(result);
    }
}
