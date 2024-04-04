import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private String instructorName;
    private List<Grade> gradesArchive;

    public Instructor(String instructorName) {
        this.instructorName = instructorName;
        this.gradesArchive = new ArrayList<>();
    }
    public String getInstructorName() {
        return instructorName;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }
    public void gradeStudent(Student student, Course course, int grade) {
        Grade newGrade = new Grade(student, course, grade);
        gradesArchive.add(newGrade);
    }
    public List<Grade> getGradesArchive() {
        return gradesArchive;
    }
}
