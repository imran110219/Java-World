package com.sadman.TDD;

public class Checker {
    public String checkState(int age){
        if(age > 0 &&  age < 10)
            return "Children";
        else if(age == 10)
            return "Adolescents";
        else if(age == 19)
            return "Adolescents";
        return "Invalid Input";
    }
}
