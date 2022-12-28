package org.springframework.cloud.stream.function;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link StreamFunctionProperties}
 */
public class StreamFunctionProperties__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'streamFunctionProperties'
   */
  public static BeanDefinition getStreamFunctionPropertiesBeanDefinition() {
    Class<?> beanType = StreamFunctionProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(StreamFunctionProperties::new);
    return beanDefinition;
  }
}
