package Lesson4.zConcatination;

/**
 * Created by slash22 on 15.06.2017.
 */

public class ZadachaConcatination {
    public static void main(String[] args) {
        System.out.println(concat("This string ", "was ", "concatination"));

    }


    public static String concat(String first, String second, String third) {
        String res = first + second + third;
    return res;
  }
}
