import java.util.Date;

final class Person {

    private final String name;
    private final int age;
    private final Date dateOfBirth; // Mutable object

    public Person(String name, int age, Date dateOfBirth) {
        this.name = name;
        this.age = age;
        // Defensive copy in constructor
        this.dateOfBirth = new Date(dateOfBirth.getTime());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getDateOfBirth() {
        // Defensive copy in getter
        return new Date(dateOfBirth.getTime());
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age +
                ", dateOfBirth=" + dateOfBirth + '}';
    }
}

public class ImmutableDemo {

    public static void main(String[] args) {

        Date dob = new Date();
        Person person = new Person("nimesh", 22, dob);

        System.out.println("Before modification attempt:");
        System.out.println(person);

        //  modify original Date object
        dob.setTime(0);

        System.out.println("\nAfter modifying original Date :");
        System.out.println(person);

        // modify through getter
        Date retrievedDate = person.getDateOfBirth();
        retrievedDate.setTime(100000);

        System.out.println("\nAfter modifying Date from getter:");
        System.out.println(person);
}
}