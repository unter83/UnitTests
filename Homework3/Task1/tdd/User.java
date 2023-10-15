package tdd;

public class User {

    String name;
    String password;
    boolean isAdmin = false;
    boolean isAuthenticate = false;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        if (name == null |
                name.contains(" ") |
                name.contains("@") |
                name.contains("$") |
                name.contains(";") |
                name.contains(",") |
                name.contains(".") |
                name.contains("%") |
                name.contains("/") )
                    return false;
        if (password.length() > 5) {
            isAuthenticate = true;
            return true;
        }
        return false;
    }

}