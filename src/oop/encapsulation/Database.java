package oop.encapsulation;

public class Database {
    private String user;
    private String password;
    private String database;

    // getter, setter
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public void connectDatabase(String user, String password) {
        this.user = user;
        this.password = password;

        if (user == "Hưởng" && password == "123") {
            database = "mydatabase.sql";
            System.out.println("Connect success " + database);
        }
    }
}
