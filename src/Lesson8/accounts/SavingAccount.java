package Lesson8.accounts;

/**
 * Created by slash22 on 08.07.2017.
 */
public class SavingAccount extends Account {

    int savingPerMonth;

    public SavingAccount(String bankName, String ownerName, int moneyAmount, int savingPerMonth) {
        super(bankName, ownerName, moneyAmount);
        this.savingPerMonth = savingPerMonth;
    }

    // @Override
    void changeOwnerName(String newOnerName) {
        if (newOnerName == "Jack" || newOnerName == "Ann")
            ownerName = newOnerName;
        else
            System.out.println("You can't change oner name of this saving account");// мы перезаписали этот метод
    }
}
