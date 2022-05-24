import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<>();


        map.putIfAbsent(1, "c["); //hashCode: 3160
        map.putIfAbsent(2, "x");  //hashCode: 120
        map.putIfAbsent(3, "y");  //hashCode: 121
        map.putIfAbsent(4, "bz"); //hashCode: 3160 - the same as first

        System.out.println("The first entry and the fourth - both have the same hashCode");
        System.out.println("----");
        System.out.println("hashCode for the first entry: " + map.get(1).hashCode());
        System.out.println("hashCode for the second entry: " + map.get(2).hashCode());
        System.out.println("hashCode for the third entry: " + map.get(3).hashCode());
        System.out.println("hashCode for the fourth entry: " + map.get(4).hashCode());
        System.out.println("----");
        System.out.println("Using equals()");
        System.out.println("map.get(1).equals(map.get(4))");
        System.out.println(map.get(1).equals(map.get(4))); // result: false
        System.out.println("----");

        int x = map.get(1).hashCode();
        int y = map.get(4).hashCode();

        System.out.println(x);
        System.out.println(y);
        System.out.println("(x == y)"); //result: true
        System.out.println(x == y);


    }


}
