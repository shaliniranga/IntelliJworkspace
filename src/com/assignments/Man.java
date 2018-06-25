package com.assignments;

public class Man {

    int age;
    String name;

    Man (int age, String name){
      this.age = age;
      this.name = name;
  }

  void display(){

      System.out.println(" The mans age and name is " +age + " and " +name);
  }

    public static void main(String[] args){


     Man agename = new Man(2,"baby");

      agename.display();


    }
}
