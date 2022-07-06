package nested_classes;

public class Test0 {

    static class A {}   // Static nested class

    class B {}   // Inner nested class

    public void method() {
        class C {}    //  Local nested class
    }
}
