package list.Vector;

public class StackExample {

    static void methodOne() {
        System.out.println("MethodOne Starts");
        System.out.println("MethodOne Ends");
    }
    static void methodTwo() {
        System.out.println("MethodTwo Starts");
        methodOne();
        System.out.println("MethodTwo Ends");
    }

    static void methodThree() {
        System.out.println("MethodThree Starts");
        methodTwo();
        System.out.println("MethodThree Ends");
    }

    public static void main(String[] args) {
        System.out.println("Method Main Starts");
        methodThree();
        System.out.println("Method Main Ends");
    }
}
