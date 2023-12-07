package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationASpect {

    @Pointcut("within(demo..*)")
    //kimlik doğrulama
    public void  authenticationPointCut()
    {

    }
    @Pointcut("within(demo..*)")
    //yetkilendirme
    public  void authorizationPointCut()
    {

    }

    @Before("authenticationPointCut() && authorizationPointCut()")
    public  void  authenticate()
    {
        System.out.println("Authenticating the Request");
    }
}
