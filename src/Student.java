import java.util.ArrayList;
import java.util.List;

public class Student implements Observer {
    private String studentName;
    private int age;
    private List<Course> enrolledCourses;

    public Student(String studentName, int age) {
        this.studentName = studentName;
        this.enrolledCourses = new ArrayList<>();
        this.age = age;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return age;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge) {
        this.age = studentAge;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.registerObserver(this);
    }

    public void dropCourse(Course course) {
        enrolledCourses.remove(course);
        course.removeObserver(this);
    }

    // Реалізація методу update для оновлення студента про зміну викладача курсу
    @Override
    public void update(Course course) {
        System.out.println("Dear " + studentName + ", the instructor for course " + course.getCourseName() + " has been changed.");
    }
}
