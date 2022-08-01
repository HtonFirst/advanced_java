package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(5);
        arrList.add(3);
        arrList.add(8);
        arrList.add(2);

       int pr = arrList.stream().reduce((accumulator, element) ->accumulator*element).get();
        System.out.println(pr);

        List<Integer> list100 = new ArrayList<>();

        Optional<Integer> o = list100.stream().reduce((accumulator, element) -> accumulator*element);
        if (o.isPresent()) {
            System.out.println(o.get());
        } else {
            System.out.println("Not Present");
        }

        int res = arrList.stream().reduce(1,(accumulator, element) ->accumulator*element);
        System.out.println("_________________________________");
        System.out.println(res);

        List<String> list2 = new ArrayList<>();

        list2.add("Privet");
        list2.add("Kak dela?");
        list2.add("Otlichno");
        list2.add("Poka");

        String res2 = list2.stream().reduce((a,e)->a + " " + e).get();
        System.out.println(res2);

    }
}
