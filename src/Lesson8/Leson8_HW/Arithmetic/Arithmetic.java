package Lesson8.Leson8_HW.Arithmetic;

public class Arithmetic {

    int[] array = {-10, 0, 110, 555, 1000, -45, 0, 60, 10};

    public boolean check(int[] array) {

        if ((maxElement(array) + minElement(array)) > 100) {

            return true;
        }
        return false;
    }

    public int maxElement(int[] array) {// объявили static чтоб можно было использовать в maine
        int max = array[0];

        for (int el : array) {
            if (el > max)
                max = el;
        }
        return max;
    }

    public int minElement(int[] array) {// объявили static чтоб можно было использовать в maine
        int min = array[0];

        for (int el : array) {
            if (el < min)
                min = el;
        }
        return min;
    }
}


