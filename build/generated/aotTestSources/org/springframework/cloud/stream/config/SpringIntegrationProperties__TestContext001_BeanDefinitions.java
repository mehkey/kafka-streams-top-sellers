package org.springframework.cloud.stream.config;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SpringIntegrationProperties}
 */
public class SpringIntegrationProperties__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'springIntegrationProperties'
   */
  public static BeanDefinition getSpringIntegrationPropertiesBeanDefinition() {
    Class<?> beanType = SpringIntegrationProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(SpringIntegrationProperties::new);
    return beanDefinition;
  }
}
