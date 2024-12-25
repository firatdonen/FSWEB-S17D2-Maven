package com.workintech.model;

public class Developer {
    private int id;
    private String name;
    private double salary;
    private Experience experience;


    //Constructor
    public Developer(int id, String name, double salary, Experience experience){
        this.id=id;
        this.name= name;
        this.salary=salary;
        this.experience=experience;
}
//Getter and Setters


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
this.salary=salary;
}

}

