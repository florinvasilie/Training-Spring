package com.example.spring.domain;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    
    public User(){}
    //setters
    
    public void setId(int id){
        this.id=id;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        this.age=age;
    }
    
    //getters
    public int getId(){
        return this.id;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public int getAge(){
        return this.age;
    }
	
}
