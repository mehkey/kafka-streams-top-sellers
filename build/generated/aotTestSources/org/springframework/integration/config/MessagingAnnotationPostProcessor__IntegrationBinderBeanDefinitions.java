package org.springframework.integration.config;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MessagingAnnotationPostProcessor}
 */
public class MessagingAnnotationPostProcessor__IntegrationBinderBeanDefinitions {
  /**
   * Get the bean definition for 'internalMessagingAnnotationPostProcessor'
   */
  public static BeanDefinition getInternalMessagingAnnotationPostProcessorBeanDefinition() {
    Class<?> beanType = MessagingAnnotationPostProcessor.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(MessagingAnnotationPostProcessor::new);
    return beanDefinition;
  }
}
