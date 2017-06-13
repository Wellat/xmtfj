package com.wsu.hemi.xmtfj.entity;

/**
 * Created by yexq on 2017/6/13.
 */
public class NameValue {
    String name;
    Object value;

    @Override
    public String toString() {
        return "NameValue{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
