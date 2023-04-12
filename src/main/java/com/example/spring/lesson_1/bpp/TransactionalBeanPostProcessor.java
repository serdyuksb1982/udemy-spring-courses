package com.example.spring.lesson_1.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
@Component
public class TransactionalBeanPostProcessor implements BeanPostProcessor {

    private final Map<String, Class<?>> transactionalMap = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().isAnnotationPresent(Transaction.class)) {
            transactionalMap.put(beanName, bean.getClass());
        }
        System.out.println("Before initialization... from Transactional...");
        return bean;
    }

    /**Proxy init in afterInitialisation!!!**/
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> beanProxy = transactionalMap.get(beanName);
        if (beanProxy != null){
            return Proxy.newProxyInstance(beanProxy.getClassLoader(), beanProxy.getInterfaces(),
                    (proxy, method, args) -> {
                        System.out.println("Get proxy");
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
