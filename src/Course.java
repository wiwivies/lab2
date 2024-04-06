import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(Course course);
}

public class Course {
    private String courseName;
    private Instructor instructor;
    private List<Observer> observers;

    public Course(String courseName, Instructor instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.observers = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
        notifyObservers();
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void gradeStudent(Student student, int grade) {
        Grade newGrade = new Grade(student, this, grade);
        instructor.update(this);
    }
}