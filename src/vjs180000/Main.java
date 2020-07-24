package vjs180000;
import java.io.File;

public class Main {

    static void RecursivePrint(File[] arr,int index,int level)
    {
        // terminate condition
        if(index == arr.length)
            return;

        // tabs for internal levels
        for (int i = 0; i < level; i++)
            System.out.print("\t");

        // for files
        if(arr[index].isFile())
            System.out.println(arr[index].getName());

            // for sub-directories
        else if(arr[index].isDirectory())
        {
            System.out.println("[" + arr[index].getName() + "]");

            // recursion for sub-directories
            RecursivePrint(arr[index].listFiles(), 0, level + 1);
        }

        // recursion for main directory
        RecursivePrint(arr,++index, level);
    }
    public static void main(String[] args) {
        	// write your code here
        String dirpath=args[0];
        File directory=new File(dirpath);
        if (directory.exists() && directory.isDirectory()){
            File arr[]=directory.listFiles();
            RecursivePrint(arr,0,0);

        }
    }
}
