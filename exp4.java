package lab_6;
import java.util.HashMap;
import java.util.Scanner;


public class exp4 {
    public static void main(String args[]) {
        try {
            Scanner scn = new Scanner(System.in);

            System.out.println("Значение десятичного числа и системы");

            while (true) {

                int number = scn.nextInt();
                int system = scn.nextInt();

                if (system != 0 && system != 1 && system < 17) {
                    System.out.println(convertion(number, system));
                } else {
                    System.out.println("Простите но такой системы нет ");
                }
                System.out.println("Можете попробовать ещё раз ввести число и систему");
            }

        } catch (Exception e) {
            System.out.println("Вы что-то ввели неправильно");
        }
    }

    public static String convertion(int number, int system) {
        String num = "";

        HashMap<Integer, String> map =
                new HashMap<>();
        map.put(10,"A");
        map.put(11,"B");
        map.put(12,"C");
        map.put(13,"D");
        map.put(14,"E");
        map.put(15,"F");
//        System.out.println(map.get(10));


        while (number > 0) {
            if (number % system > 9) {
                num += map.get(number % system);
            } else {
                num += Integer.toString(number % system);

            }
            number = (number - (number % system)) / system;
        }


        return new StringBuilder(num).reverse().toString();
    }
}
