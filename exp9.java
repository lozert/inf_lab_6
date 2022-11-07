package lab_6;
import static java.lang.Math.*;
import java.util.Scanner;

public class exp9 {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);

        System.out.println("Введите значение корня степени и число");
        double p = scn.nextDouble();
        double x = scn.nextDouble();

        System.out.println(sqrt(p,x));
    }

    public static String sqrt(double p,double x ){
        int n = 0, count = 0;
        String otvet = "";
        while (true) {
            count++;
            double tocn = abs(tocnost(n+1,p,x) - tocnost(n,p,x));
            if (tocn < pow(10,-2) && tocn > pow(10,-6)){
                otvet += String.format("%d  %d  %d ",tocn , tocnost(n,p,x), count);
                break;
            }
            n++;
        }
        return otvet;
    }

    public static double tocnost(double n, double p,double x) {

        return (1/p)*((p-1)*(n-1) + (x / (pow(n-1,p-1))));
    }
}
