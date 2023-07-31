package hello.core.singleton;

import hello.core.AppConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationSingletonTest {

    @Test
    public void configurationDeep() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        //AppConfig도 스프링 빈으로 등록된다.
        AppConfig bean = ac.getBean(AppConfig.class);

        //출력: bean = class hello.core.AppConfig$$EnhancerBySpringCGLIB$$6f837f94
        System.out.println("bean = " + bean.getClass());
    }
}