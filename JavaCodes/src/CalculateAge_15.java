import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculateAge_15 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birthdate (dd/MM/yyyy): ");
        String dob = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);

        // Current date (today)
        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        System.out.println("Age: " + age.getYears() + " years, "
                + age.getMonths() + " months & "
                + age.getDays() + " days");


    }
}
