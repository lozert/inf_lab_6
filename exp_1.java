package lab_6;
import java.util.Scanner;
import static java.lang.Math.*;

public class exp_1 {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);

        System.out.println("ВВедите значение");
        double M=scn.nextDouble();

        System.out.println(cycle(M));
    }

    public static double cycle(double M ){
        double cosm = 1, sinm = 1;

        for (int i = 1; i <= 2 ; i ++){
            if (i == 1) {
                for (int j = 1; j <= M; j++) {
                    cosm *= cos(j);
                }

            }else {
                for (int k = 2; k <= M*2 ; k+=2){

                    sinm *= sin(k);
                }
            }
        }

        return (cosm/sinm);
    }

}
