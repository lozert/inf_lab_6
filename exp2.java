package lab_6;

import java.util.Random;

public class exp2 {
    public static void main(String args[]) {
        Random rand = new Random();
        int[] arr;
        int num = rand.nextInt(1000000000) , maxx = 0  ;
        arr = new int[10];
        System.out.println(num);

        while (num > 0) {
            int b = num % 10;
            arr[b] += 1;
            num /= 10;
        }


        for (int i = 0; i < 10; i++) {
            if (maxx < arr[i]) {
                maxx = arr[i];
            }
        }

        System.out.println(factorial(maxx));
    }
    public static Integer factorial( int maxx) {
        int fact = 1;
        for (int x = 1; x <= maxx ; x++){
            fact *= x;
        }
        return fact;
    }
}
