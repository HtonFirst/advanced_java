package nested_classes.local_iner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }

}
class Math {
    public void getResult() {

        int delimoe =21;

        class Divide {

            private int delitel;

//            public int getDelimoe() {
//                return delimoe;
//            }
//
//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int chastnoe(int delimoe, int delitel) {
                return delimoe/delitel;
            }

            public int getOstatok() {
                return delimoe%delitel;
            }
        }

        Divide divide = new Divide();
//        divide.setDelimoe(21);
        divide.setDelitel(4);

        System.out.println("delimoe = " + delimoe);
        System.out.println("delitel = " + divide.delitel);

        System.out.println("________________________");

        System.out.println("chastnoe = " + divide.chastnoe(delimoe, divide.delitel));
        System.out.println("ostatok = " + divide.getOstatok());

    }
}
