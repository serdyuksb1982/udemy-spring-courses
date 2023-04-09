package com.example.spring.lesson_1.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class AuditingBeanPostProcessor implements BeanPostProcessor {

    private final Map<String, Class<?>> auditingBeans = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        /**Ищем все аннотации типа Auditing.class**/
        if (bean.getClass().isAnnotationPresent(Auditing.class)) {
            auditingBeans.put(beanName, bean.getClass());
        }
        System.out.println("Before initialization... from Auditing...");
        return bean;
    }

    /**Proxy init in afterInitialisation!!!**/
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanProxy = auditingBeans.get(beanName);
        if (beanProxy != null){
            return Proxy.newProxyInstance(beanProxy.getClassLoader(), beanProxy.getInterfaces(),
                    (proxy, method, args) -> {
                        System.out.println("Auditing proxy...");
                try {
                    return method.invoke(bean, args);
                } finally {
                    System.out.println("Close transaction");
                }
            });
        }
        return bean;
    }
}
