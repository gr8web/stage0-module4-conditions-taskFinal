package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        int febDays = 1;
        if (year % 4 == 0 && year % 100 != 0) {
            febDays = 29;
        } else if (year % 100 == 0 && year % 400 == 0) {
            febDays = 29;
        } else {
            febDays = 28;
        }

        switch (month) {
            case 2 -> System.out.println(febDays);
            case 4, 6, 9, 11 -> System.out.println("30");
            default -> System.out.println("31");
        }
    }
}
