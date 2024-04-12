package org.example;
import java.io.File;
public class Tehtava13 {
    public static long laskeKoko(File hakemisto){
        long size = 0;
        File[] files= hakemisto.listFiles();
        for( File file : files) {
            if(file.isFile()){
                size += file.length();
            } else if (file.isDirectory()) {
                size += laskeKoko(file);
            }
        }
        return size;
    }
}
