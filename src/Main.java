import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int ran = (int) (Math.random() * (9 - 1)) + 1;
            integers.add(ran);
        }
        System.out.println(integers);

        Set<Integer> kill = new HashSet<>();
        List<Integer> bill = new ArrayList<>();
        for (int i : integers) {
            if (!kill.add(i)) {
                bill.add(i);
            }
        }
        System.out.println(kill);
        System.out.println("kol-vo " + bill.size() + " " + bill);

    }
}