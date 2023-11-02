package com.rush.app111;

import java.util.ArrayList;

public class User {
    int id;
    String fname;
    String lname;
    String mobile;
    String company;

    public int getId() {
        return id;
    }

    public User(int id, String fname, String lname, String mobile, String company) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.mobile = mobile;
        this.company = company;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getMobile() {
        return mobile;
    }

    public String getCompany() {
        return company;
    }

    public ArrayList<User> getSampUserList() {

        ArrayList<User> sampleUserList = new ArrayList<>();
        sampleUserList.add(new User(1, "Sahan", "Perera", "+94 77 111 2222", "Google"));
        sampleUserList.add(new User(2, "John", "Doe", "+1 555 123 4567", "Microsoft"));
        sampleUserList.add(new User(3, "Alice", "Smith", "+44 20 1234 5678", "Amazon"));
        sampleUserList.add(new User(4, "Bob", "Johnson", "+49 89 1234 5678", "Apple"));
        sampleUserList.add(new User(5, "Emma", "Wilson", "+61 2 1234 5678", "Facebook"));

        return sampleUserList;
    }

}
