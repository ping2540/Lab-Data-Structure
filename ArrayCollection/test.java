
public class test {

    public static void main(String[] args) {
        ArrayCollection x = new ArrayCollection(1);
        x.add("A");x.add("B");x.add("A");x.add("B");
        x.add("C"); x.add("A"); x.add("A"); x.add("A");
        x.add("A"); x.add("A");
        System.out.println(x.count("A"));

//        ArrayCollection x = new ArrayCollection(1);
//        x.add("A");x.add("B");x.add("A");x.add("B");
//        x.add("C"); x.add("A"); x.add("A"); x.add("A");
//        x.add("A"); x.add("A");
//        ArrayCollection y = new ArrayCollection(1);
//        y.add("A");y.add("B");y.add("C");y.add("D"); y.add("E");x.add("W");x.add("C");x.add("W");
//        System.out.println(x.containsDup());
//        System.out.println(y.containsDup());

//         ArrayCollection x = new ArrayCollection(1);
//        x.add("A");x.add("B");x.add("A");x.add("B");
//        x.add("C"); x.add("A"); x.add("A"); x.add("A");
//        x.add("A"); x.add("A");
//        ArrayCollection y = new ArrayCollection(1);
//        y.add("A");y.add("B");y.add("C");y.add("D"); y.add("E");x.add("W");x.add("C");x.add("W");
//        y.clear();
//        System.out.println(y.toString());

//        ArrayCollection x = new ArrayCollection(1);
//        x.add("A");x.add("B");x.add("A");x.add("B");
//        x.add("C"); x.add("A"); x.add("A"); x.add("A");
//        x.add("A"); x.add("A");
//        System.out.println(x.toString());
//        System.out.println(x.size());
//        x.removeAll("A");
//        System.out.println(x.toString());
//        System.out.println(x.size());

//ArrayCollection a = new ArrayCollection(1);
//ArrayCollection c = new ArrayCollection(1);
//a.add("A");a.add("A");a.add("C");a.add("B");
//a.add("C"); c.add("D");c.add("A");
//System.out.println(a.toString()); System.out.println(c.toString());
//a.addAll(c);
//System.out.println(a.toString()); System.out.println(c.toString());

//ArrayCollection a = new ArrayCollection(1);ArrayCollection b = new ArrayCollection(1);
//ArrayCollection c = new ArrayCollection(1);
//a.add("A");a.add("B");a.add("C");a.add("B");a.add("B"); a.add("B");a.add("A");
//b.add("A"); b.add("B");b.add("C");b.add("B"); b.add("D");b.add("B");b.add("A");
//c.add("A"); c.add("B");c.add("A");c.add("B"); c.add("B");c.add("B");c.add("A");
//System.out.println(a.countUnique());System.out.println(b.countUnique());System.out.println(c.countUnique());
//System.out.println(a.toString());System.out.println(b.toString());System.out.println(c.toString());
 
    }
}
