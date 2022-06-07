/**
 * This class represents a student. Each student has a first name of type String,
 * a last name of type String, a grade of type int, and a unique student number of
 * type int. The class provides the getters and setters of all fields. Also, the
 * class provides a toString method that returns the String representation of a
 * student.
 */
public class Student {
    private static int id = 1; // a static integer for tracking the unique student number
    private String firstName; // a String for storing the first name of a student
    private String lastName; // a String for storing the last name of a student
    private int grade; // an integer for storing the grade of a student
    private int studentNum; // an integer for storing the student number of a student

    /**
     * Constructor for creating a Student object
     * @param  firstName  first name of the student
     * @param  lastName   last name of the student
     * @param  grade      grade of the student
     */
    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        studentNum = id++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setFirstName(String new_firstName) {
        firstName = new_firstName;
    }

    public void setLastName(String new_lastName) {
        lastName = new_lastName;
    }

    public void setGrade(int new_grade) {
        grade = new_grade;
    }

    /**
     * Return the name and grade of a student
     * @return   the String representation of a student
     */
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Grade: " + grade;
    }
}
