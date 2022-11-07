package lab_6;
import static java.lang.Math.*;

public class exp3_ {
    public static void main(String args[]){
        System.out.println(function1());
        System.out.println(function2());
        System.out.println(function3());
    }

    public static double function1(){
        double summ = 0 ;

        for (int i = 1; i <=8; i++) {
            for (int j = 1 ; j <= i; j++) {
                summ += pow( (pow(j,cos(i)) + pow(i, cos(j))), 2);
            }
        }
        return summ;
    }

    public static double function2() {
        double multiplication = 1, mult = 1;

        for (int i = 1; i <=5; i ++) {
            for (int j = 1; j <= i ; j ++) {
                mult *= sin( pow(j, cos(i)));
            }
            multiplication *= mult;
            mult = 1;
        }

        return multiplication;
    }

    public static double function3() {
        double mult_summ = 1 , summ = 0;

        for (int i =1 ; i <=8; i ++){
            for (int j= i; j <= 2*j-1; j ++) {
                for (int k = i +j ; k <= 2*(i+j); k ++) {
                    summ += (2*cos(j) - 3 * log(i + 0.5*k));
                }
            }
            mult_summ *= summ ;
            summ = 0;
        }
        return mult_summ;
    }
}
