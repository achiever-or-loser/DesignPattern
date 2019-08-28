package com.DesignPattern.TemplatePattern;

/**
 * @Description
 * @Author shichao.chen
 * @Date 2019/8/28 15:37
 * @Version 1.0
 **/
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
