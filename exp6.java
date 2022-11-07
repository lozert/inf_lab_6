package lab_6;


import java.util.Scanner;
import static java.lang.Math.*;


class exp6 {

        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);

            System.out.println("Введите значение x и y ");
            System.out.println("При значение x== 100 цикл будет завершаться");


            while(true) {
                double x = scn.nextDouble();
                if (x== 100) {
                    break;
                }
                double y = scn.nextDouble();

                if (result1(x,y) && result2(x,y) && result3(x,y)) {
                    System.out.println("Точка попала");
                } else {
                    System.out.println("Точка не попала");
                }
            }

        }

        public static boolean result1(double x , double y){
            if ((y >= 0 && x*x + y*y <= 72 && abs(x) <= 6 )) {
                return true;
            } else {
                return false;
            }
        }

        public static boolean result2(double x , double y){
            if ( ( (pow((x+2), 2) + pow((y-1) , 2) <=1) ||
                    (pow((x+2), 2) + pow((y-3) , 2) <=1 )) || !(y < 5 * x + 25 && y < 5 && y < -5 * x + 5)) {
                return true;
            } else {
                return false;
            }
        }

        public static boolean result3(double x, double y) {
            if (!(pow(x - 3, 2) + pow(y - 2, 2) <= 4) || (pow(x - 3, 2) + pow(y - 3, 2) <= 1)) {
                return true;
            } else {
                return false;
            }
        }
    }


