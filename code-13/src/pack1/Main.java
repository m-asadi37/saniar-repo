package pack1;

public class Main {

    public static void main(String[] args) {

        Admin admin = new Admin("admin", "admin");
        System.out.println(admin.login(new LoginInfo("admin", "admin1")));

        SuperAdmin s1 = new SuperAdmin("s1", "123", 12);
        System.out.println(s1.login(new LoginInfo(12, "s1", "123")));

        Client c1 = new Client("c1", "123");
        int otp = c1.getTmpOtp();
        System.out.println(otp);
        System.out.println(c1.login(new LoginInfo("c1", "123", otp)));
    }
}
