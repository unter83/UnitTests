package tdd;

public class User {

    String name;
    String password;
    boolean isAdmin = false;

    boolean isAuthenticate = false;
    public boolean getIsAdmin() {
        return isAdmin;
    }



    public boolean getIsAuthenticate() {
        return isAuthenticate;
    }



    public User(String name, String password) {
        if (authenticate(name, password)) {
            this.name = name;
            this.password = password;
        } else
            throw new RuntimeException("Login Error");
    }

    public User(String name, String password, boolean isAdmin) {
        if (authenticate(name, password)) {
            this.name = name;
            this.password = password;
            this.isAdmin = isAdmin;
        } else
            throw new RuntimeException("Login Error");
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", isAuthenticate=" + isAuthenticate +
                '}';
    }
}