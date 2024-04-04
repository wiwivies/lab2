//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Створення викладачів
        Instructor mathInstructor = new Instructor("John Doe");
        Instructor physicsInstructor = new Instructor("Jane Smith");

        // Створення курсів
        Course mathCourse = new Course("Mathematics", mathInstructor);
        Course physicsCourse = new Course("Physics", physicsInstructor);

        // Створення студентів
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Запис студентів на курси
        alice.enrollCourse(mathCourse);
        bob.enrollCourse(physicsCourse);

        // Виставлення оцінок студентам
        mathInstructor.gradeStudent(alice, mathCourse, 90);
        physicsInstructor.gradeStudent(bob, physicsCourse, 85);

        // Вивід збережених оцінок в архіві викладачів
        System.out.println("Math Instructor's Grade Archive:");
        for (Grade grade : mathInstructor.getGradesArchive()) {
            System.out.println(grade.getStudent().getStudentName() + ": " + grade.getGrade());
        }

        System.out.println("\nPhysics Instructor's Grade Archive:");
        for (Grade grade : physicsInstructor.getGradesArchive()) {
            System.out.println(grade.getStudent().getStudentName() + ": " + grade.getGrade());
        }
    }
}