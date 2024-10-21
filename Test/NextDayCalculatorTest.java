import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NextDayCalculatorTest {
    @Test
    @DisplayName("case 1/1/2024")
    void testGetNextDayCaseD1M1Y2024() {
        NextDayCalculator nextDay = new NextDayCalculator();
        int day = 1;
        int month = 1;
        int year = 2024;

        String result = "2/1/2024";
        String a = nextDay.getNextDay(day, month, year);
        assertEquals(result,a);
    }
}

