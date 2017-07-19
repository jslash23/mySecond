package Lesson8.accounts;

/**
 * Created by slash22 on 08.07.2017.
 */
public class CheckingAccount extends Account {

    int limitOfExpence;

    public CheckingAccount(String bankName, String ownerName, int moneyAmount, int limitOfExpence) {
        super(bankName, ownerName, moneyAmount);
        this.limitOfExpence = limitOfExpence;
    }

    void withDraw(int amount) {
        if (amount > limitOfExpence)
            return;
        moneyAmount -= moneyAmount;
    }
}
