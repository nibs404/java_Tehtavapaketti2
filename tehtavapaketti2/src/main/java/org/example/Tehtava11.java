package org.example;

public class Tehtava11 {
    public static int kolmenSumma(int[] array){
        int suurinSumma = Integer.MIN_VALUE;
        if (array != null||array.length >3){

            for (int i = 0; i < array.length-2; i++) {
                int summa = array[i] + array[i+1] + array[i+2];
                if (summa>suurinSumma) {
                    suurinSumma = summa;
                }
            }
        }
        return suurinSumma;
    }
}
