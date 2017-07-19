package Lesson8.Leson8_HW.Students;

public class Demo {

    public Student createHighestParent() {

        Course[] courses = new Course[]{};
        Student student = new Student("egor", "letov", 20, courses);
        return student;
    }

    public SpecialStudent createLowestChild() {

        Course[] courses = new Course[]{};
        SpecialStudent specialStudent = new SpecialStudent("Andrew", "Ivanov", 25, courses, 2471, "javalesson@ukr.net");

        return specialStudent;
    }
}
