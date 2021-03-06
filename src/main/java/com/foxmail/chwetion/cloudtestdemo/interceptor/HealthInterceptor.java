package com.foxmail.chwetion.cloudtestdemo.interceptor;

import com.foxmail.chwetion.cloudtestdemo.context.RuntimeContext;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class HealthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (RuntimeContext.isHealth()) {
            return true;
        }
        throw new Exception("unhealth");
    }
}
