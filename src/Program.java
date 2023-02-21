import user.cont.Container;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Container c1 = new Container(10);
        c1.RandInit();
        System.out.println(c1.toString());
        System.out.println(c1.erase(-1));
        System.out.println(c1.toString());
        c1.pop();
        System.out.println(c1.toString());
        c1.push(10,5);
        System.out.println(c1.toString());
        System.out.println(c1.get(5));
        c1.set(-10, 9);
        System.out.println(c1.toString());
    }
}
