package com.appsoft.systerm.core.handler;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListenter implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {

//        System.out.println("---------------------------->请求销毁");

    }

 

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {

//        System.out.println("---------------------------->请求创建");

    }

}
