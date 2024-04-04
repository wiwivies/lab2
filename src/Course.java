public class Course {
    private String courseName;
    private Instructor instructor;

    public Course(String courseName, Instructor instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public Instructor getInstructor() {
        return instructor;
    }
    // зміна інструктора
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
