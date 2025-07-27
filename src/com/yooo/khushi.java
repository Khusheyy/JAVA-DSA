package com.yooo;

class Account {
    String name = "khushi";
    protected String email;//only visible within enclosing class and sub-class
    private String password;//only visible within enclosing class

    public String getPassword(){
        setPassword("randompassword");
        return this.password;
    }

    private void setPassword(String pass){
        this.password = pass;
    }
}

public class khushi{
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.email="khushipurohit171@gmail.com";
        //acc1.password = "idl";
        //whenever anything is private , and we need to access it then we use the concept of getters and setters
        //acc1.setPassword("abcd121");
        System.out.println(acc1.getPassword());

    }
}


