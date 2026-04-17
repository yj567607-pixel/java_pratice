package basic.iteration;
import java.util.*;
public class IteratorDemo {

    static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("indra");
        names.add("kumar");
        names.add("yadav");

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            String name =it.next();
            System.out.println("Element:"+name);
        }
    }
}
