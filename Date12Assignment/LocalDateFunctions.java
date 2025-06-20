package Date12Assignment;

import java.time.LocalDate;

public class LocalDateFunctions {
    public static void main(String[] args) {
        LocalDate  local=LocalDate.now();
        System.out.println(local.plusDays(2));
        System.out.println(local.minusDays(2));
        System.out.println(local);
        LocalDate specific=LocalDate.of(2025,6,3);
        System.out.println(specific);

        //adding 5 days to current date
        LocalDate add5=LocalDate.now().plusDays(5);

        //substrracting months from the current date
        LocalDate montthminus=LocalDate.now().minusMonths(2);

        int a=LocalDate.now().getDayOfMonth();
        String dayy=String.valueOf(LocalDate.now().getDayOfWeek());
        String montht=String.valueOf(LocalDate.now().getMonth());
        String weekk=String.valueOf(LocalDate.now().getMonthValue());
        System.out.println(a);
        System.out.println(dayy);
    }
}
