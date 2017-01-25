//package people;

/**
 * Class Person: for both students and employees
 *
 * @author Shmuel Jacobs
 * @version 1.25.a
 */
public class Person {

    //private data fields: name, SSN, age, gender, address, and telephone number
    private String name;
    private int SSN, age, gender;
    private String address, telephoneNumber;

    //constructors
    Person(String name, int SSN, int age, int gender,
            String address, String telephoneNumber) {
        this.name = name;
        this.SSN = SSN;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    //accessors (getters) for new data fields
    //mutators (setters) for new data fields
    //toString()
}
