package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'square of 10 in the range from min to max', 100, 101, 1",
            "'square of 99 in the range from min to max', 9800, 9801, 1",
            "'square of 9 out the range from min to max', 0, 99, 0",
            "'square of 100 out the range from min to max', 9802, 9803, 0",
            "'square of 11 in the range from min to max', 120, 121, 1",
            "'square of 98 in the range from min to max', 9604, 9605, 1",
            "'3 squares in the range from min to max', 200, 300, 3",
            "'all squares in the range from min to max', 100, 9801, 90"})
    void shouldCalculateSqr(String testName, int min, int max, int expected) {
        SQRService service = new SQRService();

        int actual = service.sqrCalculate(min, max);

        assertEquals(expected, actual);
    }
}