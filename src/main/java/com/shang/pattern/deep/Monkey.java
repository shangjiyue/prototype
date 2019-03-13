package com.shang.pattern.deep;

import java.util.Date;

/**
 * @author: sjy
 * @create: 2019-03-13 11:16
 * @Description: 基类
 * @Version: 1.0
 **/

public class Monkey {
    protected int height;
    protected int weight;
    protected Date birthday;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
