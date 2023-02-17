import user.cont.Container;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Container c1 = new Container(1);
        c1.RandInit();
        System.out.println(c1.toString());
        c1.pop();
        System.out.println(c1.toString());
    }
}
