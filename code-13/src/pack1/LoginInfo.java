package pack1;

public class LoginInfo {

    //byte short int long / double float / char / boolean
    //String
    int otp;
    int key;
    String user;
    String pass;

    public LoginInfo(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public LoginInfo(int key, String user, String pass) {
        this.key = key;
        this.user = user;
        this.pass = pass;
    }

    public LoginInfo(String user, String pass, int otp) {
        this.otp = otp;
        this.user = user;
        this.pass = pass;
    }
}
