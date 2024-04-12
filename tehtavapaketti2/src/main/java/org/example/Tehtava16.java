package org.example;

public class Tehtava16 {
    public static int puuttuvaLuku(int[] joukko) {
        int n=joukko.length+1;
        int odotus = n*(n+1)/2;
        int tosi =0;
        for (int luku : joukko) {
            tosi += luku;
        }
        return odotus-tosi;
    }
}
