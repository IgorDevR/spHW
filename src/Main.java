import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        hw1(nums);
        hw2(nums);

        List<String> words = new ArrayList<>(List.of("qwe", "qwe", "ewq", "ewq", "rty", "asd", "zxc", "vbn", "jkl"));
        hw3(words);
        hw4(words);

    }

    public static void hw1(List<Integer> values) {

        for (Integer num : values) {

            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void hw2(List<Integer> values) {

        Set<Integer> set = new TreeSet<>(values);

        for (Integer num : set) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void hw3(List<String> stringList) {

        Set<String> set = new LinkedHashSet<>(stringList);
        for (String st : set) {
            System.out.print(st + " ");
        }
        System.out.println();
    }

    public static void hw4(List<String> stringList) {

        Map<String, Integer> map = new HashMap<>();

        for (String s : stringList) {

            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        for (Map.Entry<String, Integer> m : map.entrySet()) {

            if (m.getValue() > 1) {
                System.out.print(m + " ");
            }
        }

    }


}
