package com.shang.pattern.deep;

/**
 * @author: sjy
 * @create: 2019-03-13 11:36
 * @Description: java类作用描述
 * @Version: 1.0
 **/

public class DeepCloneTest {

    public static void main(String[] args) {
        QITianDaSheng qiTianDaSheng = new QITianDaSheng();

        QITianDaSheng clone = (QITianDaSheng)qiTianDaSheng.clone();
        System.out.println("深克隆:" + (qiTianDaSheng.getJinGuBang() == clone.getJinGuBang()));

        QITianDaSheng q = new QITianDaSheng();
        QITianDaSheng n = q.shallowClone(q);
        System.out.println("浅克隆：" + (q.getJinGuBang() == n.getJinGuBang()));

    }
}
