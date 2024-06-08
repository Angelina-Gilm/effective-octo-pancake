package Massiv2_0;

public class Array_exc {
    public static void main(String[] args) {
        double[] ar = {8, 3, 1, 3, 6};
        int i = 0;
        double sum = 0;
        while (i < ar.length) {
          sum = sum + ar[i];
          i++;
        }
        System.out.println("Сумма всех чисел массива = " + sum);
        double proiz = 1;
        for (int j = 0; j < ar.length; j++) {
            proiz = proiz * ar[j];
        }
        System.out.println("Произведение всех чисел массива = " + proiz);
    }
}
