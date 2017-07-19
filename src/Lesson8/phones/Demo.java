package Lesson8.phones;

/**
 * Created by slash22 on 08.07.2017.
 */
public class Demo {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone(110, 10.0, "China", true);//phone constructor call
        //first in class IPhone, becouse it is parent metod
        iPhone.deleteIPoneFromDb();
        iPhone.orderPhone();
    }
}
