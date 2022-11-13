package lab_6;
import com.sun.jdi.ArrayReference;

import java.sql.Array;

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
        int[] myArray;
        myArray =  new int[8];
        int proz = 0, res= 1;

        for (int i=1; i<=8 ; i++){
            for (int j=i ; j<= 2*i-1;j++){
                for (int k=i+j; k<=2*(i+j); k++){
                    proz += (2*cos(j) - 3*log(i+0.5*k));
                }
            }
            myArray[i-1] = proz;
            proz = 0;
        }
        for (int i= 0; i <=7;i++){

            res *= myArray[i];
        }
        return res;

    }
}
