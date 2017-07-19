package Lesson8.ads;

/**
 * Created by slash22 on 08.07.2017.
 */
public class HouseAd extends Ad {
    String ownerName;
    String address;
    double square;
    int floors;

    /*public HouseAd(long id, Date dateCreated, String address, double square, int floors) {
        super(id, dateCreated);
        this.address = address;
        this.square = square;
        this.floors = floors;
    }*/
    //Создаем новый конструктор со всеми полями чтоб был включен в него ownerName
    public HouseAd(long id, int price, String address, double square, int floors) {
        super(id, price);
        this.ownerName = ownerName;
        this.address = address;
        this.square = square;
        this.floors = floors;
    }

    boolean chechOwner() {//проверка значений
        Owners owners = new Owners();

        for (String owner : owners.owners) {//пробегаем по всем  оунерам, пробегаем по всем оунерсам
            //у класса owner мы вызываем массив owners
            if (ownerName == owner)//если текущий оунер (ownerName) равен owner то возвращаем  true
                return true;
        }
        return false; // если такого сходства нет, то возвращаем false
    }
}
