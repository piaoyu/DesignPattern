package com.piaoyu.createpattern;

/**
 * 单例模式
 * 
 * @author piaoyu
 * @since 2014-3-2
 */
public enum Singleton {
    INSTANCE;

    public void sayHello() {
        System.out.println("hello");
    }
}
