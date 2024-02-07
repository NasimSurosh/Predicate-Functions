package explination;

import java.util.ArrayList;
import java.util.List;


public class Main {

  public static void main(String[] args) {
    

    var values = new ArrayList<>(List.of(3,4,6,8,15,20));
    
    // values.add(14);     The off() method will return a unmodifiable list.
    // System.out.println(values.getClass());  you can see here is class unmutable.
    
    values.add(13);
    values.forEach(System.out::println);
    System.out.println();
    
    values.removeIf(n -> n <= 6);
    values.forEach(System.out::println);
    
    
  }

}
