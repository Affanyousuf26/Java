import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class sets {
    public static void main(String []args){

        Set<Integer> t= new LinkedHashSet<Integer>();
        t.add(5);
        t.add(6);
        t.add(5);
        t.add(-2);
        t.remove(6);
        t.add(7) ;
        t.size() ;

        int x=t.size();

        System.out.println(t );

    }
}
