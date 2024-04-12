package org.example;

import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Tehtävä 11:");
        System.out.println(" ");
        int[] syote1= {9,8,32,-2,1};
        int[] syote2= {2,5,1,3,2};
        System.out.println("Ensimmäisen syötteen suurin summa on: "+Tehtava11.kolmenSumma(syote1));
        System.out.println("Ensimmäisen syötteen suurin summa on: "+Tehtava11.kolmenSumma(syote2));
        System.out.println(" ");
        System.out.println("Enter-näppäin: seuraava tehtävä");
        new Scanner(System.in).nextLine();

        System.out.println("Tehtävä 12:");
        System.out.println(" ");
        Tehtava12 tehtava12 = new Tehtava12(); //??
        Tehtava12.nimiGenerator generaattori = tehtava12.new nimiGenerator(); //???
        String nimi = generaattori.generoituNimi();
        System.out.println("Randomisti generoitu nimi: "+nimi);
        System.out.println(" ");
        System.out.println("Enter-näppäin: seuraava tehtävä");
        new Scanner(System.in).nextLine();

        System.out.println("Tehtävä 13:");
        System.out.println(" ");
        File hakemisto = new File(".");
                long size = Tehtava13.laskeKoko(hakemisto);
        System.out.println("Hakemiston koko: "+size);
        System.out.println(" ");
        System.out.println("Enter-näppäin: seuraava tehtävä");
        new Scanner(System.in).nextLine();

        System.out.println("Tehtävä 15:");
        System.out.println(" ");
        Tehtava15.Soitin soitin = Tehtava15.Soitin.getInstance();
        soitin.setTrack("Poison - Alice Cooper");
        soitin.playTrack();
        System.out.println(" ");
        System.out.println("Enter-näppäin: seuraava tehtävä");
        new Scanner(System.in).nextLine();

        System.out.println("Tehtävä 16:");
        System.out.println(" ");
        int[] joukko1={1, 2, 3, 5};
        int[] joukko2={1, 2, 3, 4, 5, 6, 8, 9, 10, 11};
        System.out.println("Puuttuva luku 1: "+Tehtava16.puuttuvaLuku(joukko1));
        System.out.println("Puuttuva luku 2: "+Tehtava16.puuttuvaLuku(joukko2));
        System.out.println(" ");


    }
}

