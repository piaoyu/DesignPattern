package com.piaoyu.createpattern;

/**
 * 创建型模式使用
 * 
 * @author piaoyu
 * @since 2014-3-2
 */
public class Main {

    public static void main(String[] args) {
        Singleton.INSTANCE.sayHello();
        Builder builder = new Builder.Build(2).extend(3).build();
    }

}
