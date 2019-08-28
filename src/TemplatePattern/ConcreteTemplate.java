package com.DesignPattern.TemplatePattern;

/**
 * @Description
 * @Author shichao.chen
 * @Date 2019/8/28 15:40
 * @Version 1.0
 **/
public class ConcreteTemplate extends AbstractTemplate{
    //基本方法的实现
    @Override
    public void abstractMethod() {
        //业务相关的代码
    }
    //重写父类的方法
    @Override
    public void hookMethod() {
        //业务相关的代码
    }
}
