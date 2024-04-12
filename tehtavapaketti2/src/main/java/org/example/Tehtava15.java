package org.example;

public class Tehtava15 {
    public static class Soitin {
        private static Soitin instance;
        private String trackName;
         Soitin(){}
        public static Soitin getInstance(){
            if(instance ==null){
                instance = new Soitin();
            }
            return instance;
        }
        public void setTrack(String trackName){
            this.trackName = trackName;
        }
        public void playTrack(){
            if(trackName !=null){
                System.out.println("Toistetaan kappaletta: "+trackName);
            }
            else {
                System.out.println("Musiikkia ei valittu.");
            }
        }
    }
}
