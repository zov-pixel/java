
import java.time.LocalDate;
import java.util.Locale;
import java.time.format.DateTimeFormatter;

public class BirthdayDates {

    public static void main(String[] args) {

        System.out.println(collectBirthdays(2023, 01, 25));

    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now().plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        DateTimeFormatter dayOfWeekShot = DateTimeFormatter.ofPattern("EEE", Locale.US);
        String yearOfBirth = birthday.format(DateTimeFormatter.ofPattern("YYYY")).toString();
        String yearOfToday = today.format(DateTimeFormatter.ofPattern("YYYY")).toString();
        Integer yearOfDifference = Integer.parseInt(yearOfToday)-Integer.parseInt(yearOfBirth);
        LocalDate everyYear;
        String result = "";
        for (int i = 0; i <= yearOfDifference; i++) {
            everyYear = birthday.plusYears(i);
            if (today.isAfter(everyYear)) {
                result = result + i + " - " + everyYear.format(formatter) + " - " + everyYear.format(dayOfWeekShot) + "\n";
        }
        }
        return result;

    }
}
