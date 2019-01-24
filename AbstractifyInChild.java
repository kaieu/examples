class Base {
    public String foo() {
        return "Base";
    }
}

/**
 * 子クラスで親クラスのメソッドを abstract にすることができる。
 * （どのようなケースで使われるべきものか不明だが）
 */
abstract class Child extends Base {
    public abstract String foo();
}

class GrandChild extends Child {
    public String foo() {
        return "GrandChild";
    }
}

public class AbstractifyInChild {
    public static void main(String[] args) {
        Base o = new GrandChild();

        System.out.println(o.foo());
    }
}
