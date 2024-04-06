public class Instructor implements Observer {
    private String instructorName;

    public Instructor(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    // Реалізація методу update для оновлення викладача про призначення йому курсу
    @Override
    public void update(Course course) {
        System.out.println("Dear " + instructorName + ", you have been assigned as the instructor for course " + course.getCourseName());
    }
}
