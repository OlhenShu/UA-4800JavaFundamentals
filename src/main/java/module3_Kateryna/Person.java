package module3_Kateryna;

import java.time.Year;
import java.util.Scanner;

import static java.lang.System.in;

public class Person {
    private static final Scanner SCANNER = new Scanner(in);
    private static int counter = 0;
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - this.birthYear;
    }

    public void input() {
        counter++;
        System.out.println("Person " + counter);
        System.out.print("Enter first name: ");
        this.firstName = SCANNER.nextLine();
        System.out.print("Enter last name: ");
        this.lastName = SCANNER.nextLine();
        System.out.print("Enter birth year: ");
        this.birthYear = SCANNER.nextInt();
        SCANNER.nextLine();
    }

    public void output() {
        System.out.println("Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", age=" + getAge() +
                '}');
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }

    public static void main(String[] args) {
        System.out.println("Information about people");
        Person person1 = new Person();
        person1.setFirstName("Kate");
        person1.setLastName("Green");
        person1.setBirthYear(1996);
        System.out.println("Person 1: " + person1.getFirstName()
                + " " + person1.getLastName()
                + ", " + "born in " + person1.getBirthYear()
                + ", " + person1.getAge() + " years old");

        Person person2 = new Person("Alex", "Green");
        person2.setBirthYear(2001);
        System.out.println("Person 2: " + person2.getFirstName()
                + " " + person2.getLastName()
                + ", " + "born in " + person2.getBirthYear()
                + ", " + person2.getAge() + " years old");

        Person person3 = new Person();
        person3.setFirstName("Alice");
        person3.setLastName("Green");
        person3.setBirthYear(1987);
        System.out.println("Person 3: " + person3.getFirstName()
                + " " + person3.getLastName()
                + ", " + "born in " + person3.getBirthYear()
                + ", " + person3.getAge() + " years old");

        Person person4 = new Person("Nick", "Green");
        person4.setBirthYear(2005);
        System.out.println("Person 4: " + person4.getFirstName()
                + " " + person4.getLastName()
                + ", " + "born in " + person4.getBirthYear()
                + ", " + person4.getAge() + " years old");

        Person person5 = new Person();
        person5.setFirstName("Mark");
        person5.setLastName("Green");
        person5.setBirthYear(1967);
        System.out.println("Person 5: " + person5.getFirstName()
                + " " + person5.getLastName()
                + ", " + "born in " + person5.getBirthYear()
                + ", " + person5.getAge() + " years old");

        person1.input();
        person2.input();
        person3.input();
        person4.input();
        person5.input();

        person1.changeName("Anna", "Brown");
        person4.changeName(person4.getFirstName(), "Nolan");
        person5.changeName("Den", person5.getLastName());
        System.out.println("Person 1 changed both names, person 4 changed last name, person 5 changed first name");

        System.out.print("Personal information about each of person: \n");
        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();
    }
}
