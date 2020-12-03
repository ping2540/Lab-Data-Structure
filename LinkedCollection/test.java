import java.util.*;
public class test {

    public static void main(String[] args) {
        LinkedCollection l = new LinkedCollection();
        l.add("A");l.add("B");l.add("A");l.add("D");l.add("A");
        l.add("E");l.add("F");
        System.out.println(l.toString());
        System.out.println(l.count("A"));
        System.out.println(l.count("Z"));

//        LinkedCollection l = new LinkedCollection();
//        l.add("A");l.add("B");l.add("A");l.add("D");l.add("A"); l.add("E");l.add("F");
//        System.out.println(l.toString());
//        System.out.println(l.toString());
//        System.out.println(l.getDup());
//        LinkedCollection a = new LinkedCollection();
//        a.add("S");a.add("B");a.add("A");a.add("D");a.add("W"); a.add("E");a.add("F");
//        System.err.println(a.toString());
//        System.out.println(a.getDup());

//        LinkedCollection l = new LinkedCollection();
//        l.add("A");l.add("B");l.add("A");l.add("D");l.add("A"); l.add("E");l.add("F");
//        System.out.println(l.toString());
//        l.clear();
//        System.out.println(l.toString());
   
//        LinkedCollection l = new LinkedCollection();
//        l.add("A");l.add("B");l.add("A");l.add("D");l.add("A"); l.add("E");l.add("F");
//        System.out.println(l.toString());
//        System.out.println(Arrays.toString(l.toArray()));

//        LinkedCollection l = new LinkedCollection();
//        l.add("A");l.add("B");l.add("A");l.add("D");l.add("A"); l.add("E");l.add("F");
//        LinkedCollection a = new LinkedCollection(l);
//        System.out.println(l.toString());
//        System.out.println(a.toString());
    }
    
}
