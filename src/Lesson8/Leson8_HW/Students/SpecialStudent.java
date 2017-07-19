package Lesson8.Leson8_HW.Students;

/**
 * Created by slash22 on 13.07.2017.
 */
public class SpecialStudent extends CollegeStudent {

    long secretKey;
    String email;

    public SpecialStudent(String firstName, String lastName, int group, Course[] coursesTaken, long secretKey, String email) {
        super(firstName, lastName, group, coursesTaken);
        this.secretKey = secretKey;
        this.email = email;
    }
}
