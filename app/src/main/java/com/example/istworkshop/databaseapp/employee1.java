package com.example.istworkshop.databaseapp;

/**
 * Created by ISTWorkshop on 1/10/2018.
 */

public class employee1 {
    int id;
    String name,dept,joiningdate;
    double salary;

    public employee1(int id, String name, String dept, String joiningdate, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.joiningdate = joiningdate;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getJoiningdate() {
        return joiningdate;
    }

    public void setJoiningdate(String joiningdate) {
        this.joiningdate = joiningdate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public employee1(int id, String name){
    }


}
