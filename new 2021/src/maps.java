import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class maps {
    public static void main(String[]args) {
        Map n = new HashMap();
        n.put("tim", 5);
        n.put("joy", "x");
        n.put(11, 444);


        System.out.println(n);
        //
        Map m = new HashMap();
        String str = "hello my name is tim and i am cool";

        for (char x : str.toCharArray()) {
            if (m.containsKey(x)) {
                int old =(int) m.get(x);
                m.put (x,old+1);


            }
            else {
                m.put(x,1);
            }
        }

        System.out.println(m);
    }


}
