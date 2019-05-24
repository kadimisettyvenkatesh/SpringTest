package com.example.SpringJwt.annotation;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class CustomSecurityAspect {
    @Pointcut(value="@annotation(com.example.SpringJwt.annotation.CustomSecurityAnnotation)")
    private void customSecurityAnnotation() {
    }

    @Around("com.example.SpringJwt.annotation.CustomSecurityAspect.customSecurityAnnotation()")
    public Object doSomething(ProceedingJoinPoint pjp) throws Throwable {
    	// System.out.println("in the method aroung*****************************************:"+cust.priv());
        HttpServletRequest req = getRequest();
        System.out.println("auhtarization:"+req.getHeader("Authorization"));
        System.out.println("user:"+req.getAttribute("UserInfo"));
        MethodSignature signature = (MethodSignature) pjp.getSignature();
		Method m =signature.getMethod();
		CustomSecurityAnnotation customAnnotation = m.getAnnotation(CustomSecurityAnnotation.class);
		System.out.println("Method Privelige:"+customAnnotation.priv());
        return pjp.proceed();
    }

    private HttpServletRequest getRequest() {
        ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return sra.getRequest();
    }
}