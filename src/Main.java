//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Створення викладачів
        Instructor mathInstructor = new Instructor("John Doe");
        Instructor physicsInstructor = new Instructor("Jane Smith");

        // Створення курсів
        Course mathCourse = new Course("Mathematics", mathInstructor);
        Course physicsCourse = new Course("Physics", physicsInstructor);

        // Створення студентів
        Student alice = new Student("Alice", 17);
        Student bob = new Student("Bob", 19);
        Student charlie = new Student("Charlie",21);
        Student david = new Student("David",22);

        // геттери
        int aliceAge = alice.getStudentAge();
        String aliceName = alice.getStudentName();

        System.out.println("Student name: " + aliceName);
        System.out.println("Student age: " + aliceAge);
        // сеттери
        alice.setStudentName("Alicie");
        alice.setStudentAge(11);

        // Виведення імені та віку студента на консоль
        System.out.println(STR."Student name after setter: \{alice.getStudentName()}");
        System.out.println(STR."Student age after setter: \{alice.getStudentAge()}");

        // Запис студентів на курси
        alice.enrollCourse(mathCourse);
        bob.enrollCourse(physicsCourse);
        charlie.enrollCourse(mathCourse);
        david.enrollCourse(physicsCourse);
        alice.enrollCourse(physicsCourse);

        // Отримання списку курсів, на які записаний студент
        List<Course> enrolledCourses = alice.getEnrolledCourses();

        // Перевірка та вивід списку курсів
        if (!enrolledCourses.isEmpty()) {
            System.out.println(STR."Enrolled courses for \{alice.getStudentName()}:");
            for (Course course : enrolledCourses) {
                System.out.println(course.getCourseName());
            }
        } else {
            System.out.println(STR."Student \{alice.getStudentName()} is not enrolled in any courses.");
        }

        // Виставлення оцінок студентам
        mathInstructor.gradeStudent(alice, mathCourse, 90);
        physicsInstructor.gradeStudent(bob, physicsCourse, 85);
        mathInstructor.gradeStudent(charlie, mathCourse, 20);
        physicsInstructor.gradeStudent(david, physicsCourse, 65);

        // Вивід збережених оцінок в архіві викладачів
        System.out.println("Math Instructor's Grade Archive:");
        for (Grade grade : mathInstructor.getGradesArchive()) {
            String studentName = grade.getStudent().getStudentName();
            int studentGrade = grade.getGrade();
            System.out.println(STR."\{studentName}: \{studentGrade}");
        }

        System.out.println("\nPhysics Instructor's Grade Archive:");
        for (Grade grade : physicsInstructor.getGradesArchive()) {
            System.out.println(STR."\{grade.getStudent().getStudentName()}: \{grade.getGrade()}");
        }

        alice.dropCourse(mathCourse);
        // перевірка
        enrolledCourses = alice.getEnrolledCourses();
        if (!enrolledCourses.isEmpty()) {
            System.out.println(STR."Enrolled courses for \{alice.getStudentName()}:");
            for (Course course : enrolledCourses) {
                System.out.println(course.getCourseName());
            }
        } else {
            System.out.println(STR."Student \{alice.getStudentName()} is not enrolled in any courses.");
        }

        // перевірка чи залишилась оцінка студентки після закінчення курсу
        System.out.println("Math Instructor's Grade Archive:");
        for (Grade grade : mathInstructor.getGradesArchive()) {
            String studentName = grade.getStudent().getStudentName();
            int studentGrade = grade.getGrade();
            System.out.println(STR."\{studentName}: \{studentGrade}");
        }

    }
}