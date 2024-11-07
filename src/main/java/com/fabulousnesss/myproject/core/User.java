package main.java.com.fabulousnesss.myproject.core;

public abstract class User extends Identity {
    private String role;

    protected User(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", role=" + role +
                '}';
    }

    public void printRole() {
        System.out.println(role);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
