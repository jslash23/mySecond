package Lesson8.accounts;

/**
 * Created by slash22 on 08.07.2017.
 */

public class Demo {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("Some bank", "Denis", 1000, 50);
        savingAccount.depositMoney(100);

        System.out.println(savingAccount.moneyAmount);
        savingAccount.changeOwnerName("Oleg");
        System.out.println(savingAccount.ownerName);
        //----------------------------------
        //тут делаем переопределение методов
        CheckingAccount checkingAccount = new CheckingAccount("Some bank", "Denis", 1000, 500);
        checkingAccount.changeOnerName("Oleg");

        System.out.println(checkingAccount.ownerName);

        //Перегрузка методов это наличие одинаковых методов по названию в одном классе
    }
}
