package Lesson5;

import java.security.SecureRandom;
import java.util.Arrays;

/**
 * Created by slash22 on 23.06.2017.
 */

/*Вернемся к примеру с клиентами и счетами. Напишите метод, который будет снимать деньги со
счета определенного клиента и возвращать остаток на счете. Если денег на счете недостаточно
метод будет возвращать -1.
Сигнатура метода - withdraw(String[] clients, int[] balances, String client, int amount)
Метод должен содержаться в классе. Название класса не важно*/

//ПРИМЕР С БАНКОВСКИМИ СЧЕТАМИ
//- Пополнение баланса (с комиссией);
// <= 100 2%
// >100 1%

// - Снятие баланса
//У каждого клиента есть имя и баланс счета 1000 едениц денег,

    //ТЕСТИРОВАНИЕ
    //Обычная проверка +
    //Проверка если вводим клиента которого нет в списке +
    //Проверка на отрицательное значение снимаемой суммы +

public class SnyatDeneg_HW {

    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis", "Andrey", "Nikolay", "Irina", "John"};
        int[] balances = {100, 500, 8332, -99, 12000, -54, 0};

        System.out.println(withdraw(names, balances, "Ahmed", -10));
    }

    public static int withdraw(String[] clients, int[] balances, String client, int ammount) {
        int index = 0;
        int res;

        int count = 0;
        boolean flag = true;
        int temp;


        for (String cl : clients) {
            if ((cl.compareTo (client) != 0)||(ammount <= 0)){
                res = -1;
                return res;
            }

            if (cl == client) {
                break;
            }
            index++;

        }
            if (balances[index] >= ammount) {
                balances[index] -= ammount;
                res = balances[index];
            } else res = -1;
            return res;
        }

    }

