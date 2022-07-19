package com.epam.spring.homework2.bean;

public abstract class BaseBean {

    protected String name;
    protected int value;

    public BaseBean(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + '{' +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
