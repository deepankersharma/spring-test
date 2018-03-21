package test;

import com.test.spring.beans.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

    public static void main(String[] args) {

        Resource resource = new ClassPathResource("resources/spring.xml");

        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Object o = beanFactory.getBean("t");
        Object o1 = beanFactory.getBean("t");
        Object o2 = beanFactory.getBean("t");
        Object o3 = beanFactory.getBean("t");
        Test test = (Test)o;


        System.out.println(o1 == o);
        test.hello();



    }
}
