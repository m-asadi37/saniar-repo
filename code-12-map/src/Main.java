import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] strs = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
//        Map<Integer, String> map1 = new HashMap<>();
//        Map<Integer, String> map1 = new TreeMap<>();
        Map<Integer, String> map1 = new LinkedHashMap<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int key = random.nextInt(1,50);
            System.out.print(key + ", ");
            map1.put(key, strs[i]);
        }
        System.out.println();
        System.out.println(map1);

        //iterate over keys
        Set<Integer> keys = map1.keySet();
        for (int i : keys){
            System.out.print(i + ", ");
        }
        System.out.println();

        //iterate over values
        List<String> values = new ArrayList<>(map1.values());
        for (String s : values) {
            System.out.print(s + ", ");
        }
        System.out.println();

        //iterate over entries
        Set<Map.Entry<Integer, String>> entries = map1.entrySet();
        for (Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey() + " : "  + entry.getValue());
        }
    }
}
