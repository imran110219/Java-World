package com.sadman.simple;

public class Employee {
    Address address;

    // Constructor Injection
    Employee(Address address){
        this.address=address;
    }

    //Setter Injection
    public void setAddress(Address address){
        this.address=address;
    }
}
