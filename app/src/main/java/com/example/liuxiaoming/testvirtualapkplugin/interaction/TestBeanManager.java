package com.example.liuxiaoming.testvirtualapkplugin.interaction;

public class TestBeanManager {
    private static TestBean bean;

    public static void init(TestBean bean) {
        TestBeanManager.bean = bean;
    }

    public static TestBean getInstance() {
        return bean;
    }
}
