package nested_classes.anonymous_class;

import java.sql.SQLOutput;

public class AnonymousClass {
    public static void main(String[] args) {

      Math2 m = new Math2() {
          public int doOperation(int a, int b) {
              return a+b;
          }

      };

      Math2 m1 = new Math2() {
          public int doOperation(int a, int b) {
              return a*b;
          }
      };

      Math3 m2 = new Math3() {
          public int doOperation(int a, int b) {
              return (a+b)*2;
          }
      };

        System.out.println(m.doOperation(3,7));
        System.out.println(m1.doOperation(3, 7));
        System.out.println(m2.doOperation(3, 7));



    }
}
interface  Math2 {
    int doOperation(int a, int b);
}

class Math3 {
    int doOperation(int a, int b) {
        return a/b;
    }
}