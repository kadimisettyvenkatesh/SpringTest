package com.example.SpringJwt.annotation;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AuthAspect {
@Autowired
   AuthorizationImpl authBean;
   
   @Before("@annotation(Authorized) && args(request)")
   public void before(JoinPoint joinPoint,HttpServletRequest request){
	   MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method m =signature.getMethod();
		Authorized customAnnotation = m.getAnnotation(Authorized.class);
		System.out.println("Method Privelige:"+customAnnotation.enabled());
	   
	   System.out.println("insideeeeeeeeeeeeeeee&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
       if (!(request instanceof HttpServletRequest)) {
           throw 
           new RuntimeException("request should be HttpServletRequesttype");
       }
       
       if(authBean.authorize(request.getHeader("Authorization"))){
           
       }else {
            throw new RuntimeException("auth error..!!!");
       }
      
       if(customAnnotation.enabled()){
           
       }else {
            throw new RuntimeException("auth error..!!!");
       }
   } 
   
}