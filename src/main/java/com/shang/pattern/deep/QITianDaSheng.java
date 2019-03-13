package com.shang.pattern.deep;

import java.io.*;
import java.util.Date;

/**
 * @author: sjy
 * @create: 2019-03-13 11:19
 * @Description: java类作用描述
 * @Version: 1.0
 **/

public class QITianDaSheng extends Monkey implements Cloneable, Serializable {
    private JinGuBang jinGuBang;

    public QITianDaSheng() {
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone(){
        return this.deepClone();
    }

    private Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            QITianDaSheng copy = (QITianDaSheng)ois.readObject();
            copy.setBirthday(new Date());
            return copy;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public QITianDaSheng shallowClone(QITianDaSheng target){
        QITianDaSheng qiTianDaSheng = new QITianDaSheng();
        qiTianDaSheng.setHeight(target.getHeight());
        qiTianDaSheng.setWeight(target.getWeight());

        qiTianDaSheng.setJinGuBang(target.getJinGuBang());
        qiTianDaSheng.setBirthday(target.getBirthday());
        return qiTianDaSheng;
    }


    public JinGuBang getJinGuBang() {
        return jinGuBang;
    }

    public void setJinGuBang(JinGuBang jinGuBang) {
        this.jinGuBang = jinGuBang;
    }
}
