package Lesson8.ads;

/**
 * Created by slash22 on 08.07.2017.
 */
public class User extends BaseEntity {

    String userName;
    String location;

    public User(long id, String userName, String location) {
        super(id);
        this.userName = userName;
        this.location = location;
    }
}
