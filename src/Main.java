
public class Main {
    public static void main(String[] args)
    {
        // Створення викладача
        Instructor instructor = new Instructor("John Doe");

        // Створення курсу з певним викладачем
        Course mathCourse = new Course("Mathematics", instructor);

        // Створення студентів
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 21);

        // Підписка студентів на курс
        student1.enrollCourse(mathCourse);
        student2.enrollCourse(mathCourse);

        // Зміна викладача курсу
        Instructor newInstructor = new Instructor("Jane Smith");
        mathCourse.setInstructor(newInstructor);

        // Виставлення оцінок
        mathCourse.gradeStudent(student1, 85);
        mathCourse.gradeStudent(student2, 90);
    }
}