package lab_6;

import java.util.Scanner;
import static java.lang.Math.*;

class exp5 {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);

        System.out.println("ВВедите значение x: ");
        double x=scn.nextDouble();

        double ln = log((x+1)/(x-1));

        System.out.println(maclorena(ln,x));
//        System.out.println(abs(ln + ((pow(-2,1)*pow((1/(-1+x)),1))/1  )));
    }
    public static double maclorena(double ln,double x){
        double emax= pow(10,-2) , emin = pow(10,-4), summ =0 ;
        int i = 0;
        while (true) {
            summ += (pow(-2,i)*pow((1/(-1+x)),i))/i  ;
            if (i%100==0){
                System.out.println(summ);
            }

            if (abs(ln-summ)< emax && abs(ln-summ)>emin){
                return i;
            }
            i++;
        }
    }
}