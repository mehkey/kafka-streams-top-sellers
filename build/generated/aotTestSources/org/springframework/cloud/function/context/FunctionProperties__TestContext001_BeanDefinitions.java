package org.springframework.cloud.function.context;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link FunctionProperties}
 */
public class FunctionProperties__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'functionProperties'
   */
  public static BeanDefinition getFunctionPropertiesBeanDefinition() {
    Class<?> beanType = FunctionProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(FunctionProperties::new);
    return beanDefinition;
  }
}
