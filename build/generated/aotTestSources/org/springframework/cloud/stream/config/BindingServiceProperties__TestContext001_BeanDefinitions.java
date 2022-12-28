package org.springframework.cloud.stream.config;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BindingServiceProperties}
 */
public class BindingServiceProperties__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'bindingServiceProperties'
   */
  public static BeanDefinition getBindingServicePropertiesBeanDefinition() {
    Class<?> beanType = BindingServiceProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<BindingServiceProperties> instanceSupplier = InstanceSupplier.using(BindingServiceProperties::new);
    instanceSupplier = instanceSupplier.andThen(BindingServiceProperties__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
