package Lesson8.phones;

/**
 * Created by slash22 on 08.07.2017.
 */
public class IPhone extends Phone {

    int price;
    double weight;
    String countryProdused;

    boolean fingerPrint;

    public IPhone(int price, double weight, String countryProdused, boolean fingerPrint) {
        /*this.price = price;
        this.weight = weight;
        this.countryProdused = countryProdused;*/

        super(price, weight, countryProdused);
        System.out.println("IPhone constructor was invoked...");
        this.fingerPrint = fingerPrint;
    }

    void deleteIPoneFromDb() {
        System.out.println("delete from Db invoked");
    }
}
