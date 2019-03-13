package com.shang.pattern.prototype;

import java.util.List;

/**
 * @author: sjy
 * @create: 2019-03-13 10:56
 * @Description: 浅克隆
 * @Version: 1.0
 **/

//int、String等基本类型复制值，对象复制地址（前后使用的都是同一个对象）
public class ConcretePrototypeA implements Prototype {
    private int age;
    private String name;
    private List hobbies;

    @Override
    public Prototype clone() {
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        concretePrototype.setHobbies(this.hobbies);
        return concretePrototype;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }
}
