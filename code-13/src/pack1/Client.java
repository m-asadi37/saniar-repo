package pack1;

public class Client extends User {

    int tmpOtp;

    public Client(String username, String password) {
        super(username, password);
    }

    int getTmpOtp() {
        int rand = (int) (Math.random() * 100000);
        this.tmpOtp = rand;
        return rand;
    }

    @Override
    boolean login(LoginInfo loginInfo) {
        return super.login(loginInfo) && loginInfo.otp == tmpOtp;
    }
}
