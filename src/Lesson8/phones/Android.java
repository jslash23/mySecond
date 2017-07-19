package Lesson8.phones;

/**
 * Created by slash22 on 07.07.2017.
 */
public class Android extends Phone {

    String androidVersion;
    int screenSize;
    String secretDeviceCode;

    public Android(int price, double weight, String countryProdused, String androidVersion, int screenSize, String secretDeviceCode) {
        /*this.price = price;
        this.weight = weight;
        this.countryProdused = countryProdused;*/
        super(price, weight, countryProdused);

        //this - reference to the current class object
        //super - reference to the parent class object

        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviceCode = secretDeviceCode;
    }

    void installNewAndroidVersion() {
        System.out.println("installNewAndroidVersion invoked ");
    }
}
