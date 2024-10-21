public class NextDayCalculator {

    public static final String CONCATSTRING = "/";
    public static final int FIRST_DAY_OF_THE_MONTH = 1;
    public static final int JANUARY = 1;
    public static final int DECEMBER = 12;

    public String getNextDay (int day, int month, int year) {
        String result = "";
        if (day == getDaysOfMonth(month, year) && month == DECEMBER) {
            int nextYear = ++year;
            result =  FIRST_DAY_OF_THE_MONTH + CONCATSTRING + JANUARY + CONCATSTRING + nextYear;
        } else if (day == getDaysOfMonth(month, year) && month < DECEMBER) {
            int nextMonth = ++month;
            result = FIRST_DAY_OF_THE_MONTH + CONCATSTRING + nextMonth + CONCATSTRING + year;
        } else if  (day < getDaysOfMonth(month, year)) {
            int nextDay = ++day;
            result = nextDay + CONCATSTRING + month + CONCATSTRING + year;
        }
        return result;
    }

    public int getDaysOfMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) return 29;
                else return 28;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
    }

    public boolean isLeapYear (int year) {
        boolean isDividedBy4 = year % 4 == 0;
        boolean isDividedBy100 = year % 100 != 0;
        boolean isDividedBy400 = year % 400 == 0;
        return isDividedBy4 && isDividedBy100 || isDividedBy400;
    }
}
