package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* demo.ShoppingCart.checkOut(..))")
    public void beforeLoggers(JoinPoint jp)
    {
        //String args=jp.getSignature());// get informaiton about get bean method
        String args = jp.getArgs()[0].toString();
        System.out.println("Before Loggers with Argument: "+args);// the code read what  gets param args
    }
    @After("execution(* *.*.checkOut(..))")// two dots mean that the code run everytime regardless of whether the parameter is present or not
    public void afterLoggers()
    {
        System.out.println("After Loggers");
    }

    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturnPointCut()
    {

    }
    @AfterReturning(pointcut="afterReturnPointCut()", returning = "retVal")
    public  void  afterReturning(String  retVal)
    {
        System.out.println("After Returening :"+retVal);
    }
}
