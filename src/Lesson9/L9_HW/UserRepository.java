package Lesson9.L9_HW;




/*Необходимо реализовать небольшой кусочек проекта, отвечающий за сохранение объекта в условную базу данных (в нашем случае массив)
        Для этого создайте следующие сущности:

        User
        С полями
        long id
        String name
        String sessionId

        Объект должен создаваться по всем полям. Также возможность модификации полей должна быть закрыта, но возможность их считывания нет

        Класс UserRepository, который будет содержать поле User[] users, выполняющее роль условной базы данных (длина массива должна быть 10).
             Модифицировать содержимое этого массива можно только внутри класса UserRepository

            У класса должны быть публичные методы для работы с условной БД

        Метод  User save(User user) - который будет добавлять юзера в условную базу данных (массив)
            и возвращать его, если юзер уже есть в массиве, результат - null.
            Если размер массива не позволяет добавить больше элементов, результат метода тоже null



       Метод  User update(User user) - который будет обновлять текущего юзера
            и возвращать его, если юзера нет, результат - null

       Метод  void delete(long id) - удаляет юзера с массива
             Методы должны быть доступны всем

            Также реализуйте приватный метод, который будет использоваться только внутри класса
       Метод  User findById(long id). Используйте его в каждом из перечисленных выше методов
            Сравнение объектов User класса происходит через сравнение их полей id*/


public class UserRepository {

    private User[] users = new User[10];

    /*Метод  User save(User user) - который будет добавлять юзера в условную базу данных (массив)
    и возвращать его, если юзер уже есть в массиве, результат - null.
    Если размер массива не позволяет добавить больше элементов, результат метода тоже null*/

    public User save(User user) {
        if (user == null)// если мы не передаем параметры юзера то возвращаем налл
            return null;
        if (findById(user.getId()) != null)// если ай ди такой уже есть в массиве то  возвращаем налл
            return null;
        int countPlaced = 0;
        for (User us : users) {// проходимся по всем элементам массива юзерс
            if (us != null)// если ячейка не пустая а с параметрами  то countPlaced++
                countPlaced++;
        }
        int a = 0;

        for (User us : users) {
            if (us == null) {//если пустая ячейка то нулевой ячейке присвоиваем значение юзера
                users[a] = user;// и выходим к счетчику а++ и проверяем следующую ячейку
                break;
            }
            a++;
        }
        return user;
    }

    public User update(User user) {
        if (findById(user.getId()) != null) {
            int a = 0;
            for (User us : users) {
                if (us != null) {
                    users[a] = user;
                    break;
                }
                a++;
            }
            return user;
        }
        return null;
    }

    public void delete(long id) {
        if (findById(id) != null) {//если пользователь есть в массиве
            int a = 0;
            for (User us : users) {
                if (us != null) {
                    users[a] = null;
                    break;
                }
                a++;
            }
        }
    }

    private User findById(long id) {
        for (User user : users) {
            if (user != null && id == user.getId())
                return user;
        }
        return null;
    }
}