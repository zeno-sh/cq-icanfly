package com.zeno.cqicanfly.aop;

import com.alibaba.fastjson.JSON;
import com.zeno.cqicanfly.response.WebResponseBuilder;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.text.ParseException;

@Aspect
@Component
public class LogInterceptor {


    @Pointcut("execution(* com.zeno.cqicanfly.controller..*.*(..))")
    public void pointcut() {
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) {
        // 全路径类名#方法名
        String methodName = pjp.getSignature().getDeclaringTypeName() + "#" + pjp.getSignature().getName();
        Object[] args = pjp.getArgs();
        try {
            Object[] arguments = new Object[args.length];
            for (int i = 0; i < args.length; i++) {
                if (args[i] instanceof ServletRequest || args[i] instanceof ServletResponse || args[i] instanceof MultipartFile
                        || args[i] instanceof byte[] || args[i] instanceof Byte[]) {
                    continue;
                }
                arguments[i] = args[i];
            }
            System.out.println(String.format("入参：%s", JSON.toJSONString(arguments)));
            long start = System.currentTimeMillis();
            Object result = pjp.proceed();
            System.out.println(String.format("回参：%s", JSON.toJSONString(result)));
            return result;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return WebResponseBuilder.illegalArgument(e.getMessage());
        } catch (ParseException e) {
            e.printStackTrace();
            return WebResponseBuilder.illegalArgument("解析出现异常");
        } catch (Exception e) {
            e.printStackTrace();
            return WebResponseBuilder.businessError(e.getMessage());
        } catch (Throwable throwable) {
            return WebResponseBuilder.serverError();
        }
    }
}
