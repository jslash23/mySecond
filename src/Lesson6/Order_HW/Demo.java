package Lesson6.Order_HW;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by slash22 on 28.10.2017.
 */
public class Demo {
    public static void main(String[] args) {

        //Тестирование
        //Обычные параметры +

        Order order1 = new Order(-100,null,false,null,
                "Kiev","Ukraine","Buy");
        Order order2 = new Order(800,null,false,null,
                "Yalta","Ukraine",null);

        Order[] orders = new Order[]{order1,order2};

        for (Order ord: orders) {
            ord.confirmOrder();
            ord.checkPrice();
            ord.isValidType();
        }

        System.out.println(Arrays.deepToString(orders));


    }
}
