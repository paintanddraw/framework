package com.lh.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AopBean {

    @Around("execution (* com.lh.spring.BeanController.*(..))")
    public Object aop1(ProceedingJoinPoint point) throws Throwable {
        Object[] objects = point.getArgs();//获取的方法的参数
        System.out.println(objects);
        Object proceed = point.proceed();//执行并获取结果
        System.out.println(proceed);
        return proceed;
    }

}



