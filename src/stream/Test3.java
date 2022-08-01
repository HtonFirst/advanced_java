package stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 1, 8, 7};

//        Arrays.stream(array).forEach(e-> {e*=2;
//            System.out.println(e);});

//        Arrays.stream(array).forEach(System.out::println);

        Arrays.stream(array).forEach(Util::myMethod);


    }
}
class Util {
    public static void myMethod(int a) {
        a +=5;
        System.out.println("A = " + a);
    }
}
