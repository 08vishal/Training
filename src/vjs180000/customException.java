package vjs180000;
class NameNotFoundException extends Exception
{
    NameNotFoundException(String s){
        super(s);

    }
}
public class customException {

    public String findByName(String name) throws NameNotFoundException {

        if ("".equals(name)) {
            throw new NameNotFoundException("Name is empty!");
        }

        return name;

    }

    public static void main(String[] args) {

        customException obj = new customException ();

        try {

            String cus = obj.findByName("");

        } catch (NameNotFoundException e) {
            e.getMessage ();
            e.printStackTrace();
        }

    }
}