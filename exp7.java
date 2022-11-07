package lab_6;



public class exp7 {
    public static void main(String[] args) {
        String[] massiv;
        massiv = new String[9];

        for (int j = 1; j <=9 ; j++){
            String uravnenie = "" ;
            for (int i = 1; i <= 9; i++) {
                uravnenie += String.format("%d/%d=%d      " , i, j, i/j);
            }
            massiv[j-1] = uravnenie;
        }

        for (int i= 0 ; i < 9 ; i++) {
             System.out.println(massiv[i]);
        }

    }





}
