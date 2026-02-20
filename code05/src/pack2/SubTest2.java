package pack2;

public class SubTest2 extends Test {

    @Override
    public void print() {
        System.out.println("in subtest2 overriding..");
        System.out.println("def: " + def);
        System.out.println("prot: " + prot);
    }
}
