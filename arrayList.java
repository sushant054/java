import java.util.ArrayList;
import java.util.Collections;
public class arrayList {
    public static void main(String[] args) {
    ArrayList <Integer> list =new ArrayList<>();

    list.add(2);
    list.add(0);
  //  list.set(1,0);
    list.add(8);
    int element = list.get(2);
    Collections.sort(list);//sorting
   // list.remove(2);
    System.out.println(list);
    System.out.println(element);
    
}
    
}
