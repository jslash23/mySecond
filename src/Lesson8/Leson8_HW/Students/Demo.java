package Lesson8.Leson8_HW.Students;

import java.util.Arrays;

public class Demo {

    public static Student createHighestParent() {

        Course[] courses = new Course[]{};
        Student student1 = new Student("egor", "letov", 20, courses);
        Student[] students = new Student[]{student1};
        return student1;
    }

    public static SpecialStudent createLowestChild() {

        Course[] courses = new Course[]{};
        SpecialStudent specialStudent1 = new SpecialStudent("Andrew", "Ivanov",
                25, courses, 2471, "javalesson@ukr.net");
        SpecialStudent[] specialStudents = new SpecialStudent[]{specialStudent1};
        return specialStudent1;
    }

    public static void main(String[] args) {
        System.out.println(createHighestParent());
        System.out.println(createLowestChild());
    }
}
