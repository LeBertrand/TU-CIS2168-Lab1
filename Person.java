package people;

/**
 * Class Person: for both students and employees
 *
 * @author Shmuel Jacobs
 * @version 1.25.a
 */
public class Person {

    //private data fields: name, SSN, age, gender (stored as int 0 or 1), address, and telephone number
    private String name;
    private int SSN, age;
    private char gender;
    private String address, telephoneNumber;

    //constructors
    Person(String name, int SSN, int age, char gender,
            String address, String telephoneNumber) {
        this.name = name;
        this.SSN = SSN;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    //accessors (getters) for new data fields
    public String getName(){
        return name;
    }
    public int getSSN(){
        return SSN;
    }
    public int getAge(){
        return age;
    }
    public int getGender(){
        return gender;
    }
    //mutators (setters) for new data fields
    //toString()
}
