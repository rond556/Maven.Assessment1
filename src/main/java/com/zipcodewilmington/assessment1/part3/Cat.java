package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    private String name;
    private int age;


    public Cat(String name, Integer age) {
        super(name,age);
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) { super.setAge(age);
    super.setName("Cat name");
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        super.setName(name);
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        super.setName("Cat name");
        super.setAge(0);
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }
}
