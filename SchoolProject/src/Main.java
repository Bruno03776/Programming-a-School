/*
 * This class is a main class that illustrates the use of the School,
 * Student and Teacher classes.
 */
public class Main {
    public static void main(String[] args) {
        // create a school
        School school = new School("VLN", "123456789", "123 ABC Street");

        // create 10 students
        Student s1 = new Student("Amy", "Ken", 10);
        Student s2 = new Student("Bob", "Luise", 7);
        Student s3 = new Student("Charlie", "Mike", 6);
        Student s4 = new Student("Danny", "Nick", 7);
        Student s5 = new Student("Emmy", "Obama", 5);
        Student s6 = new Student("Frank", "Penny", 8);
        Student s7 = new Student("Grace", "Queen", 10);
        Student s8 = new Student("Henry", "Rick", 11);
        Student s9 = new Student("Ian", "Sam", 12);
        Student s10 = new Student("Jack", "Tom", 9);

        // add the 10 students to the student list of the school
        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);
        school.addStudent(s4);
        school.addStudent(s5);
        school.addStudent(s6);
        school.addStudent(s7);
        school.addStudent(s8);
        school.addStudent(s9);
        school.addStudent(s10);

        // create 3 teachers
        Teacher t1 = new Teacher("Uziel", "Xavion", "Physics");
        Teacher t2 = new Teacher("Victor", "Yang", "Math");
        Teacher t3 = new Teacher("Wendy", "Zhang", "Computer");

        // add the 3 teachers to the teacher list of the school
        school.addTeacher(t1);
        school.addTeacher(t2);
        school.addTeacher(t3);

        // display all students
        System.out.println("All students in the school:");
        school.showStudents();
        System.out.println();

        // display all teachers
        System.out.println("All teachers in the school:");
        school.showTeachers();
        System.out.println();

        // remove 2 students
        school.removeStudent(s3);
        school.removeStudent(s7);

        // remove 1 teacher
        school.removeTeacher(t2);

        // display all students
        System.out.println("All students in the school:");
        school.showStudents();
        System.out.println();

        // display all teachers
        System.out.println("All teachers in the school:");
        school.showTeachers();
        System.out.println();
    }
}