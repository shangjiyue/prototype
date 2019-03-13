package com.shang.pattern.prototype;

/**
 * @author: sjy
 * @create: 2019-03-13 11:01
 * @Description: 克隆工具类
 * @Version: 1.0
 **/

public class Client {
    private Prototype prototype;

    public Client() {
    }

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }



    public Prototype startClone(Prototype concretePrototype) {
        return concretePrototype.clone();
    }
}
