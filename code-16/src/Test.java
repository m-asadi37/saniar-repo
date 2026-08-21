import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

    public double arithmetic(int a, int b) throws ArithmeticException {
        System.out.println("test div");
        return a / b;
    }

    public int sub(Integer a, Integer b) {
        System.out.println("test sub");
        return a - b;
    }

    public int getFromArray(int[] arr, int index) {
        return arr[index];
    }

    public int nullPointer(int a) {
        System.out.println(a);
        return nullPointer(a + 1);
    }

    //1. try - catch
    public void fileNotFound(String name) {
        try {
            FileReader fr = new FileReader(name);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }

    //2. throws
    public void ioExc(String name) throws IOException {
        FileReader fr = new FileReader(name);
        fr.close();
    }
}
