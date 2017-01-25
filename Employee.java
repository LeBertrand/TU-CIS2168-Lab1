package people;

/**
 *
 * @author Cindy
 */
public class Employee extends Person {

    //private data fields: department, job title, and year of hire
    private String department, jobTitle;
    private int hireYear;

    //constructors
    Employee(String name, int SSN, int age, char gender, String address,
            String telephoneNumber, String department, String jobTitle, int hireYear) {
        super(name, SSN, age, gender, address, telephoneNumber);
        this.department = department;
        this.jobTitle = jobTitle;
        this.hireYear = hireYear;
    }

    //getters for each private data field
    //setters for each private data field
    //toString() method
}
