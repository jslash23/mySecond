package Lesson8.accounts;

/**
 * Created by slash22 on 08.07.2017.
 */
public class Account {

    String bankName;
    String ownerName;
    int moneyAmount;

    public Account(String bankName, String ownerName, int moneyAmount) {
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.moneyAmount = moneyAmount;
    }

    void depositMoney(int amount) {
        moneyAmount += amount;
    }

    //overloading
    void depositMoney() {//тут поисходит перегрузка методовб нужно чтоб отличались параметры методов
        moneyAmount += 1000;
        System.out.println("deposit was successful");
    }

    void changeOnerName(String newOnerName) {
        ownerName = newOnerName;
    }
}
