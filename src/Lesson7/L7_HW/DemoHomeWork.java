package Lesson7.L7_HW;

import Lesson6.Order_HW.Order;


import java.util.Date;

/**
 * Created by slash22 on 01.07.2017.
 */

/*ОБЪЕКТЫ ОРДЕР КЛАССА

В классе DemoHomeWork создайте два метода
createOrder()
createOrderAndCallMethods()

Первый метод должен возвращать объект класса Order с предыдущего ДЗ созданного с параметрами
price = 100, dateCreated = текущая, isConfirmed = false, dateConfirmed = null, city = "Dnepr", country = "Ukraine", type = "Buy"

Второй метод доллжен создавать объект с другими параметрами
price = 100, dateCreated = текущая, isConfirmed = true, dateConfirmed = текущая, city = "Kiev", country = "Ukraine", type = "SomeValue"
Вызывате все методы с класса Order через его объект и возвращать объект
*/
public class DemoHomeWork {

    public static Order createOrder() {//static используем для работы с майн методом
        Order ordObj = new Order(100, new Date(), false, null, "Dnepr", "Ukraine", "Buy");
        if (ordObj.getPrice() == 100 && ordObj.getDateCreated() == new Date() && ordObj.isConfirmed() == false
                && ordObj.getDateConfirmed() == null && ordObj.getCity() == "Dnepr" &&
                ordObj.getCountry() == "Ukraine" && ordObj.getType() == "Buy")
        return ordObj;
        else
            return null;
    }

    public static Order createOrderAndCallMethods() {
        Order orderObject = new Order(100, new Date(), true, new Date(), "Kiev", "Ukraine", "SomeValue");
        if (orderObject.getPrice() == 100 && orderObject.getDateCreated() == new Date() && orderObject.isConfirmed() == true
                && orderObject.getDateConfirmed() == new Date() && orderObject.getCity() == "Kiev" &&
                orderObject.getCountry() == "Ukraine" && orderObject.getType() == "SomeValue") {
            orderObject.checkPrice();
            orderObject.confirmOrder();
            orderObject.isValidType();

            return orderObject;
        }
        else
            return null;

    }



    public static void main(String[] args) {

        //ТЕСТИРОВАНИЕ
        //Простое тестирование +
        //Тестирование с проверкой правильно введенных данных -
        //если в дате все налы то работает, если сверяем с текущими датами то не работает


        System.out.println(createOrder());
        System.out.println(createOrderAndCallMethods());
    }
}

