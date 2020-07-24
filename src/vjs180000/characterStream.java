package vjs180000;

import java.io.*;

public class characterStream {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("/Users/vishal/Downloads/test1.txt"));
        BufferedWriter writer= new BufferedWriter(new FileWriter("/Users/vishal/Downloads/test2.txt"));
        int count=2;
        String line;
        while ((line = br.readLine()) != null && count>0){
            writer.write(line);
            writer.write('\n');
            count --;

        }
        System.out.println("Task Completed");
        writer.close();
        br.close();
    }
}
