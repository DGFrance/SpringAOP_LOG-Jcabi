package com.javabootcamp.spring.Example.aspectExample;

import com.javabootcamp.spring.aspect.Loggable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;
import java.lang.reflect.Field;
import static org.springframework.util.ReflectionUtils.FieldCallback;

public class LoggableInjector implements BeanPostProcessor {
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    public Object postProcessBeforeInitialization(final Object bean, String beanName) throws BeansException {
        ReflectionUtils.doWithFields(bean.getClass(), new FieldCallback() {
            public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
                ReflectionUtils.makeAccessible(field);
                if (field.getAnnotation(Loggable.class)!= null) {
                    Log log = LogFactory.getLog(bean.getClass());
                    field.set(bean, log);
                }
            }
        });
        return bean;
    }
}
