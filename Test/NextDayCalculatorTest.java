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

    @Test
    @DisplayName("case 31/1/2024")
    void testGetNextDayCaseD31M1Y2024() {
        NextDayCalculator nextDay = new NextDayCalculator();
        int day = 31;
        int month = 1;
        int year = 2024;

        String result = "1/2/2024";
        String a = nextDay.getNextDay(day, month, year);
        assertEquals(result,a);
    }

    @Test
    @DisplayName("case 30/4/2024")
    void testGetNextDayCaseD30M4Y2024() {
        NextDayCalculator nextDay = new NextDayCalculator();
        int day = 30;
        int month = 4;
        int year = 2024;

        String result = "1/5/2024";
        String a = nextDay.getNextDay(day, month, year);
        assertEquals(result,a);
    }
    @Test
    @DisplayName("case 29/2/2024")
    void testGetNextDayCaseD29M2Y2024() {
        NextDayCalculator nextDay = new NextDayCalculator();
        int day = 29;
        int month = 2;
        int year = 2024;

        String result = "1/3/2024";
        String a = nextDay.getNextDay(day, month, year);
        assertEquals(result,a);
    }


}

