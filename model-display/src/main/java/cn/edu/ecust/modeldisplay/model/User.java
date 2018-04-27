package cn.edu.ecust.modeldisplay.model;

public class User {
    private String userEmail;
    private String userName;
    private String userPassword;
    private String userId;
    private int userRole;

    public User(){

    }

    public User(String userName, String userPassword, String userEmail){
        this.userEmail = userEmail;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public int getRole() {
        return userRole;
    }

    public void setRole(int userRole) {
        this.userRole = userRole;
    }

    public String getEmail() {
        return userEmail;
    }

    public void setEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPassword() {
        return userPassword;
    }

    public void setPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userId;
    }

    public void setUserID(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}