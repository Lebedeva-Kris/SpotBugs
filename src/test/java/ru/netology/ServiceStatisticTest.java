package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServiceStatisticTest {
    ServiceStatistic service = new ServiceStatistic();
    long[] incomesInBillions = {1, 2, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

    @Test
    void findMax() {
        long expected = 12;

        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}