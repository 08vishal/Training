package vjs180000;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class try_with_multiple_resource {
    public static void main(String[] args) {


            try(FileInputStream     input         = new FileInputStream ("/Users/vishal/Desktop/zip/test2.txt");
                BufferedInputStream bufferedInput = new BufferedInputStream (input)
            ) {

                int data = bufferedInput.read();
                while(data != -1){
                    System.out.print((char) data);
                    data = bufferedInput.read();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace ();
            } catch (IOException e) {
                e.printStackTrace ();
            }

    }
}
