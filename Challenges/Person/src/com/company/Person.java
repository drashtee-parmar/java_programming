package com.company;

public class Person {
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = ((age > 100) || (age < 0)) ? 0 : age;
    }

    public boolean isTeen() {
        return ((age > 12) && (age < 20)) ? true : false;
    }

    public String getFullName(){
        return (firstName.isEmpty() && lastName.isEmpty()) ? "" : (lastName.isEmpty())? firstName : (firstName.isEmpty())? lastName : firstName + " " + lastName;
    }

    private String firstName;
    private String lastName;
    private int age;

}
