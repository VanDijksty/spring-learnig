package com.styyyds.mall.service.impl;

public class OrderServiceImplSub extends OrderServiceImpl {
    @Override
    public void generate() {
        long begin = System.currentTimeMillis();
        super.generate();
        long end = System.currentTimeMillis();
        System.out.println("耗费时长：" + (end - begin) + "ms");
    }

    @Override
    public void detail() {
        long begin = System.currentTimeMillis();
        super.detail();
        long end = System.currentTimeMillis();
        System.out.println("耗费时长：" + (end - begin) + "ms");
    }

    @Override
    public void modify() {
        long begin = System.currentTimeMillis();
        super.modify();
        long end = System.currentTimeMillis();
        System.out.println("耗费时长：" + (end - begin) + "ms");
    }
}
