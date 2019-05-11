package com.example.SpringJwt.annotation;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AuthAspect {
@Autowired
   AuthorizationImpl authBean;
   
   @Before("@annotation(Authorized) && args(request)")
   public static void before(HttpServletRequest request){
	   
	   System.out.println("insideeeeeeeeeeeeeeee&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
       if (!(request instanceof HttpServletRequest)) {
           throw 
           new RuntimeException("request should be HttpServletRequesttype");
       }
       
//       if(authBean.authorize(request.getHeader("Authorization"))){
//           
//       }else {
//            throw new RuntimeException("auth error..!!!");
//       }
      
   } 
   
}