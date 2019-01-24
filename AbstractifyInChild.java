class Base {
    public String foo() {
        return "Base";
    }
}

/**
 * �ҥ��饹�ǿƥ��饹�Υ᥽�åɤ� abstract �ˤ��뤳�Ȥ��Ǥ��롣
 * �ʤɤΤ褦�ʥ������ǻȤ���٤���Τ�����������
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
