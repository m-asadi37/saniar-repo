import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main1(String[] args) throws IOException, URISyntaxException {

        //path : /d1 -> root drive project that project run on it
        //path : d1 -> root directory (folder) that project run on it
        //path: E:\d1 -> Absolute path
        File f1 = new File("E:\\Java Learn");
        showFile(f1);
        System.out.println(f1.mkdirs());

        File f2 = new File("test.txt");
        f2.createNewFile();
        showFile(f2);

        for (File s : f1.listFiles()) {
            System.out.println(s.getPath());
        }
    }

    private static void showFile(File f1) {
        System.out.println(f1.exists());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.canWrite());
        System.out.println(f1.canExecute());
        System.out.println(f1.canRead());
        System.out.println(f1.getFreeSpace());
        System.out.println(f1.getTotalSpace());
        System.out.println(f1.getUsableSpace());
        System.out.println("Path: " + f1.getPath());
        System.out.println("Absolute path:" + f1.getAbsolutePath());
    }

    public static void main2(String[] args) {
        File f1 = new File("test.txt");
        try {
            FileOutputStream os = new FileOutputStream(f1);

            os.write("salam".getBytes());
            os.write('\n');
            os.write("che khabar".getBytes());

            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fi = new FileInputStream(f1);

            int ch;
            while ((ch = fi.read()) != -1) {
                System.out.print((char) ch);
            }

            fi.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main3(String[] args) {
        File f1 = new File("test.txt");
        try {
            FileWriter fr = new FileWriter(f1);

            fr.append("salam");
            fr.write('\n');
            fr.write("che khabar");

            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader fr = new FileReader(f1);

            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main4(String[] args) {
        Person p1 = new Person("saniar", "noorani", 13);

        File f1 = new File("data.docx");
        try {
            FileWriter fr = new FileWriter(f1);

            fr.append(p1.toString());

            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main5(String[] args) {
        Person p1 = new Person("saniar", "noorani", 13);

        try {
            FileOutputStream fos = new FileOutputStream("data2.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);

            os.writeObject(p1);

            os.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data2.txt");
            ObjectInputStream os = new ObjectInputStream(fis);

            Person p1 = (Person) os.readObject();
            System.out.println(p1);

            os.close();
            os.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
