package com.DesignPattern.TemplatePattern;

/**
 * @Description
 * @Author shichao.chen
 * @Date 2019/8/28 15:42
 * @Version 1.0
 **/
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();

    }
}