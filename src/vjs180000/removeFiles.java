package vjs180000;

import java.io.File;

public class removeFiles {
    public static void main(String[] args) {
        File folder = new File("/Users/vishal/Desktop/test");
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.getName().startsWith("s") || f.getName().startsWith("S")) {
                    f.delete();
                }
            }
        }
    }
}