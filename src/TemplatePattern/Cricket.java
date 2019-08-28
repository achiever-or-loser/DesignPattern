package com.DesignPattern.TemplatePattern;

/**
 * @Description
 * @Author shichao.chen
 * @Date 2019/8/28 15:41
 * @Version 1.0
 **/
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}