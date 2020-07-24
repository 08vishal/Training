package vjs180000;

import java.io.*;
import java.util.regex.Pattern;

public class fileRegex {
    public static void main(String[] args) throws IOException {
        String regex="Excepteur";
        try {
            FileInputStream fstream= new FileInputStream ("/Users/vishal/Downloads/sample-text-file.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader (in));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                if(Pattern.matches (regex,strLine)){

                }
            }



        }catch (Exception e){

        }
    }
}
