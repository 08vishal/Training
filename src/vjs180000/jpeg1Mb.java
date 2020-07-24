package vjs180000;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class jpeg1Mb {
    public static void main(String[] args) throws IOException {

        String dirpath="/Users/vishal/Downloads/";
        File directory=new File(dirpath);
        if (directory.exists() && directory.isDirectory()){
            File arr[]=directory.listFiles();
            for (File i:arr){
                if(i.getName ().endsWith (".jpeg")){
                    double size=i.length ()*0.000001;
                    if(size>=1){

                        BufferedImage image= ImageIO.read (i);
                        System.out.println (image);


                    }


                }


            }
        }

    }
}
