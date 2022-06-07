/**
 * This class represents a teacher. Each teacher has a first name of type String,
 * a last name of type String, and a subject of type String. The class provides
 * the getters and setters of all fields. Also, the class provides a toString
 * method that returns the String representation of a teacher.
 */
public class Teacher {
    private String firstName; // a String for storing the first name of a teacher
    private String lastName; // a String for storing the last name of a teacher
    private String subject; // a String for storing the subject of a teacher

    /**
     * Constructor for creating a Teacher object
     * @param  firstName  first name of the teacher
     * @param  lastName   last name of the teacher
     * @param  subject    subject of the teacher
     */
    public Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setFirstName(String new_firstName) {
        firstName = new_firstName;
    }

    public void setLastName(String new_lastName) {
        lastName = new_lastName;
    }

    public void setSubject(String new_subject) {
        subject = new_subject;
    }

    /**
     * Return the name and grade of a teacher
     * @return   the String representation of a teacher
     */
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Subject: " + subject;
    }
}
