package com.sy.dubbossm.Service;

import com.sy.dubbossm.Service.Utils.L;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by sy on 2017/12/19.
 */
public class App {
    public static void main( String[] args )
    {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                new String[]{"contextConfiguration.xml"}
        );
        applicationContext.start();
        L.d("DubboSsmService Application Started !!!");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        L.d("DubboSsmService Application Over !!!");
    }
}
