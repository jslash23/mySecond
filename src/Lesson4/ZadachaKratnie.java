package Lesson4;

/**
 * Created by slash22 on 15.06.2017.
 */
public class ZadachaKratnie {

    public static void main(String[] args) {

        System.out.println(findDivCount((short)2, (short)10, 2));//print 5
    }

    public static int findDivCount(short a, short b, int n){
        int DivCount = 0;
        double res = 0;

        for ( int i = a; i <= b; i++){//from 2 to 10
            res = i % n;
            if ( res == 0)
            DivCount ++;
        }
        return DivCount;
    }
}
