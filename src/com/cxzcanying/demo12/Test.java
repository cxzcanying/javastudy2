package com.cxzcanying.demo12;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import  org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    public static final Logger LOGGER=LoggerFactory.getLogger("Test");

    public static void main(String[] args) {
        try {
            LOGGER.info("divide方法开始执行");
            divide(10,0);
            LOGGER.info("divide方法执行成功");
        } catch (Exception e) {
            LOGGER.error("divide方法执行失败");
        }
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }
    public static void divide(int a,int b){
        LOGGER.debug("参数a:"+a);
        LOGGER.debug("参数b:"+b);
        int c=a/b;
        LOGGER.info("结果是:"+c);
    }
}
