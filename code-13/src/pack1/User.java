package pack1;

public class User {

    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean login(LoginInfo loginInfo) {
        return ((username.equals(loginInfo.user)) && (password.equals(loginInfo.pass)));
    }
}