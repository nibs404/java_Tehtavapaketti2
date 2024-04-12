package org.example;

import java.util.Random;

public class Tehtava12 {
    public class nimiGenerator {
        private static final String[] etunimet = {"Maiju", "Anna", "Mikko", "Jorma"};
        private static final  String[] sukunimet = {"korhonen", "Virtanen", "Mikkola", "Penttilä"};
        private final Random random;
        public nimiGenerator() {
            random = new Random();
        }
        public String generoituNimi() {
            String etunimi= etunimet[random.nextInt(etunimet.length)];
            String sukunimi= sukunimet[random.nextInt(sukunimet.length)];
            return etunimi+" "+sukunimi;
        }
    }
}
