public class Main {

    public static void main(String[] args) {
        Test test = new Test();

        try {
            System.out.println(test.div(10, 0));
        } catch (ArithmeticException ex) {
            System.out.println("oh oh! divide by zero!!!");
        }

        System.out.println(test.sub(10, null));

        //0,1,2,3
        int[] arr = {1, 2, 3, 4};
//        System.out.println(test.getFromArray(arr, 5));

//        System.out.println(test.inc(10));
    }
}
