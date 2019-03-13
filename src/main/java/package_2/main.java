package package_2;

import package_1.Telephone.Apple;
import package_1.Telephone.EthernetAdapter;

import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        final HashMap<Integer, String> map = new HashMap<Integer, String>();
            map.put(1, " Apple");
            map.put(2, " Orange");
            map.put(3," Bananas");
            System.out.println(map);
            System.out.println(map.get(2));

    }


}
