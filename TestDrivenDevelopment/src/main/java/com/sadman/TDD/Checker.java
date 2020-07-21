package com.sadman.TDD;

public class Checker {
    public String checkState(int age){
        if(age > 0 &&  age < 10)
            return "Children";
        else if(age > 9 && age < 20)
            return "Adolescents";
        else if(age > 19 && age < 46)
            return "Adolescents";
        else if(age > 45 && age < 61)
            return "Adolescents";
        else if(age>60)
            return "Old";
        return "Invalid Input";
    }
}
