package com.shang.pattern.deep;

import java.io.Serializable;

/**
 * @author: sjy
 * @create: 2019-03-13 11:16
 * @Description: 齐天大圣独有的对象，金箍棒
 * @Version: 1.0
 **/

public class JinGuBang implements Serializable{
    private float h = 100;
    private float d = 10;

    public void big(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /= 2;
        this.d /= 2;
    }
}
