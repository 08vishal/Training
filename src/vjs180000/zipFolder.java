package vjs180000;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class zipFolder {
    public static void main(String[] args) {
        File f= new File("/Users/vishal/Desktop/zip");
        File[] files=f.listFiles();
        System.out.println(files.length);
        byte[] buffer = new byte[1024];
        try {
            FileOutputStream fos = new FileOutputStream("/Users/vishal/Desktop/zip.zip");
            ZipOutputStream zos =new ZipOutputStream(fos);
            int i=0;
            for(File currentfile: files){

                FileInputStream fis= new FileInputStream (currentfile);
                zos.putNextEntry (new ZipEntry ("m"+i+".txt"));
                int length;
                while ((length = fis.read(buffer)) > 0) {
                    zos.write(buffer, 0, length);
                }
                zos.closeEntry ();
                fis.close ();
                i++;
        }


    }   catch (FileNotFoundException e) {
                e.printStackTrace ();
            } catch (IOException e) {
                e.printStackTrace ();
        }
    }
}
