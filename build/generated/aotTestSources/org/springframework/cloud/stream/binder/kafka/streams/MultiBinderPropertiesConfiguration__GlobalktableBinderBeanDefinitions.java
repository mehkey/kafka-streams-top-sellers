package org.springframework.cloud.stream.binder.kafka.streams;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link MultiBinderPropertiesConfiguration}
 */
public class MultiBinderPropertiesConfiguration__GlobalktableBinderBeanDefinitions {
  /**
   * Get the bean definition for 'multiBinderPropertiesConfiguration'
   */
  public static BeanDefinition getMultiBinderPropertiesConfigurationBeanDefinition() {
    Class<?> beanType = MultiBinderPropertiesConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(MultiBinderPropertiesConfiguration.class);
    beanDefinition.setInstanceSupplier(MultiBinderPropertiesConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
