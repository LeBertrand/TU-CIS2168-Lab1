package people;

/**
 *
 * @author Cindy
 */
public class Student extends Person {
    //privae data fields gpa, major, and year of graduation
    private int GPA, gradYear;
    private String major;

	//constructors
    Student(String name, int SSN, int age, char gender,
            String address, String telephoneNumber, int firstGPA, int probGradYear, String probMajor){
        super(name, SSN, age, gender, address, telephoneNumber);
        GPA = firstGPA;
        gradYear = probGradYear;
        major = probMajor;
    }

    //getters for new data fields

    //setters for new data fields

    //toString() method

}
