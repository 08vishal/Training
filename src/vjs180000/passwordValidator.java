
//Create a password validator using regex should have criteria like min length 8, max 15,
// no 3 consecutive char , atleast 1 alphabet and number and special char

package vjs180000;
import java.util.regex.*;
public class passwordValidator {
    static boolean isValidPassword(String password){
        String regex="^(?=.*[0-9])"
                + "(?=.*[a-zA-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,15}$";
        Pattern p=Pattern.compile (regex);
        if (password==null){
            return false;
        }
        Matcher m= p.matcher (password);
        return m.matches ();
    }
    public static void main(String[] args) {
        String pwd1 = "Geeks";
        String pwd2 = "dlkfajksdafbgjajfbghjadlg";
        String pwd3 = "aaaabckfdongr3";
        String pwd4 = "ironman@3000";
        String pwd5 = "4454930";
        System.out.println(isValidPassword(pwd4));
        //String pwd6 = "Geeks@portal20";
        //String pwd7 = "Geeks@portal20";
    }
}
