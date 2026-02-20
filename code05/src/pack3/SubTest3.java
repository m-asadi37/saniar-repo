package pack3;

import pack2.Test;

public class SubTest3 extends Test {

    @Override
    public void print() {
        System.out.println("in subtest3 overriding..");
//        System.out.println("def: " + def);
        System.out.println("prot: " + prot);
    }
}
