package pack1;

public class SuperAdmin extends Admin {

    int adminKey;

    public SuperAdmin(String username, String password, int adminKey) {
        super(username, password);
        this.adminKey = adminKey;
    }

    @Override
    boolean login(LoginInfo loginInfo) {
        boolean b1 = super.login(loginInfo);
        boolean b2 = adminKey == loginInfo.key;
        return b1 && b2;
    }
}
