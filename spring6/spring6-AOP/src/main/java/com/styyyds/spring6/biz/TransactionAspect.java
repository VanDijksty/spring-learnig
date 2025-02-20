package com.styyyds.spring6.biz;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionAspect {
    @Around("execution(* com.styyyds.spring6.biz..*(..))")
    public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        try{
            System.out.println("开启事务");
            pjp.proceed();
            System.out.println("提交事务");
        }catch(Throwable e){
            System.out.println("回滚事务");
        }
    }
}
