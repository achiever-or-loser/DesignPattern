package com.DesignPattern.TemplatePattern;

/**
 * @Description
 * @Author shichao.chen
 * @Date 2019/8/28 15:40
 * @Version 1.0
 **/

/*
开发中常见的场景
数据库访问的封装
Junit单元测试
servlet中的doGet和doPost方法
Hibernate中的模板程序
Spring中的JdbcTemplate,HibernateTemplate等
 */
public abstract class AbstractTemplate {
    /**
     * 模板方法
     */
    public void templateMethod(){
        //调用基本方法
        abstractMethod();
        hookMethod();
        concreteMethod();
    }
    /**
     * 基本方法的声明（由子类实现）
     */
    protected abstract void abstractMethod();
    /**
     * 基本方法(空方法)
     */
    protected void hookMethod(){}
    /**
     * 基本方法（已经实现）
     */
    private final void concreteMethod(){
        //业务相关的代码
    }
}