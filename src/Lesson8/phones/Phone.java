package Lesson8.phones;

/**
 * Created by slash22 on 07.07.2017.
 */
public class Phone {

    int price;
    double weight;
    String countryProdused;

    public Phone(int price, double weight, String countryProdused) {
        System.out.println("phone construktor was invoked...");
        this.price = price;
        this.weight = weight;
        this.countryProdused = countryProdused;
    }

    void orderPhone() {

        System.out.println("order phone invoked");
    }
}
