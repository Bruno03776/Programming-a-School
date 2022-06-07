import java.util.ArrayList;

/**
 * This class represents a school. Each school has a list of teachers, a list of
 * students and a list of courses. Each school also has a name, a phone number and
 * a location of type String, together with their getters and setters. Users can
 * add/remove students and teachers to/from the school. All teachers and students
 * can be shown as well.
 */
public class School {
    private ArrayList<Teacher> teachers; // an ArrayList for storing all teachers
    private ArrayList<Student> students; // an ArrayList for storing all students
    private ArrayList<String> courses; // an ArrayList for storing all courses
    private String name; // a String for storing the name of the school
    private String phone; // a String for storing the phone number of the school
    private String location; // a String for storing the location of the school

    /**
     * Constructor for creating a School object
     * @param  name      name of the school
     * @param  phone     phone number of the school
     * @param  location  location of the school
     */
    public School(String name, String phone, String location) {
        this.name = name;
        this.phone = phone;
        this.location = location;
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String new_name) {
        name = new_name;
    }

    public void setPhone(String new_phone) {
        phone = new_phone;
    }

    public void setLocation(String new_location) {
        location = new_location;
    }

    /**
     * Add a teacher to the school
     * @param  teacher   the Teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Add a student to the school
     * @param  student   the Student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Remove a teacher from the school
     * @param  teacher   the Teacher to be removed
     */
    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    /**
     * Remove a student from the school
     * @param  student   the Student to be removed
     */
    public void removeStudent(Student student) {
        students.remove(student);
    }

    /**
     * Show all the teachers in the school
     */
    public void showTeachers() {
        for(Teacher t : teachers) {
            System.out.println(t);
        }
    }

    /**
     * Show all the students in the school
     */
    public void showStudents() {
        for(Student s : students) {
            System.out.println(s);
        }
    }
}