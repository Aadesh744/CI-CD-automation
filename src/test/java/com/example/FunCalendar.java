import java.util.Scanner;
import java.time.YearMonth;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class FunCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("📅 Welcome to the Fun Calendar Generator! 📅");
        System.out.print("Enter year (e.g., 2025): ");
        int year = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter a number between 1 and 12.");
            return;
        }

        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();
        LocalDate firstDay = yearMonth.atDay(1);
        int startDay = firstDay.getDayOfWeek().getValue();

        String monthName = firstDay.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println("\n   " + monthName + " " + year);
        System.out.println("Mo Tu We Th Fr Sa Su");

        for (int i = 1; i < startDay; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((startDay + day - 1) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nThanks for using the Fun Calendar Generator! 🎉");
        scanner.close();
    }
}

