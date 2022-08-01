package Lambda;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Privet");
        arrayList.add("Poka");
        arrayList.add("Ok");
        arrayList.add("Java");
        arrayList.add("Lambda");

        System.out.println(arrayList);

        arrayList.removeIf(s-> s.length()<5);

        System.out.println(arrayList);
    }
}
