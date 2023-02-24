import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(            1l,"Temirlan", 3 ,LocalDate.of(2020, Month.DECEMBER, 13));
        Person p2 = new Person(            1l,"Temirlan", 3 ,LocalDate.of(2020, Month.DECEMBER, 13));

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.getName() + " "+p1.getDateOfBirth());
        System.out.println(p1.equals(p2));
    }
}

class Person{
    private Long id;
    private String name;
    private int age;
    private LocalDate dateOfBirth;

    public Person(Long id, String name, int age, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}