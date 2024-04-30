package com.atguigu.maven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @Classname HelloTest
 * @Description TODO
 * @Date 2024/4/30 14:51
 * @Created by Enzo
 */
public class HelloTest {
    @Test
    public void sayHelloTest() {
        System.out.println("---------hello------");
        Hello hello = new Hello();
        String results = hello.sayHello("atguigu");
        //断言 判断结果和你预想的结果是否相同
        //如果两个值相同 单元测试成功
        //如果两个值不相同 单元测试失败
        assertEquals("Hello atguigu!", results);
    }
}
