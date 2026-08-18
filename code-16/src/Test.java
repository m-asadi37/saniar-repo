public class Test {

    public double div(int a, int b) {
        System.out.println("test div");
        return a / b;
    }

    public int sub (Integer a, Integer b) {
        System.out.println("test sub");
        return a - b;
    }

    public int getFromArray(int[] arr, int index) {
        return arr[index];
    }

    public int inc(int a) {
        System.out.println(a);
        return inc(a + 1);
    }
}
