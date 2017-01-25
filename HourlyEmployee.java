package people;

/**
 *
 * @author Cindy
 */
public class HourlyEmployee extends Employee {
    //private data fields: hourly rate, hours worked, and union dues
    private int hourlyRate, hoursWorked, unionDues;

    //constructors
    HourlyEmployee(String name, int SSN, int age, char gender, String address,
            String telephoneNumber, String department, String jobTitle, int hireYear, int initialRate, int initialHours, int initialUnionDues) {
        super(name, SSN, age, gender, address, telephoneNumber, department);
        hourlyRate = initialHours;
        hoursWorked = initialHours;
        unionDues = initialUnionDues;
    }

    //getters for new data fields

    //setters for new data fields

    //toString() method

}
