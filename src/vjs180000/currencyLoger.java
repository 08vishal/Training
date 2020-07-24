package vjs180000;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import  java.util.logging.*;
public class currencyLoger {
    private  static final LogManager logManager=LogManager.getLogManager ();
    private  static final Logger logger=Logger.getLogger (Logger.GLOBAL_LOGGER_NAME);
    static {
        try {
            try {
                logManager.readConfiguration (new FileInputStream (("./logging.properties")));
            } catch (IOException e) {
                logger.log (Level.SEVERE,"Error in loading config",e);
            }
        } catch (SecurityException e) {
            e.printStackTrace ();
        }
    }
    public static void main(String[] args) {
            logger.fine ("fine loaded");
            float dollars;

            Scanner in = new Scanner(System.in);

            System.out.println("Please enter dollars:");

            dollars = in.nextLong();

            float rupees = dollars * 75;

            System.out.println(rupees + " Rupees");

        }
    }

