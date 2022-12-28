package org.springframework.cloud.stream.binder.kafka.streams.function;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link KafkaStreamsFunctionAutoConfiguration}
 */
public class KafkaStreamsFunctionAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'kafkaStreamsFunctionAutoConfiguration'
   */
  public static BeanDefinition getKafkaStreamsFunctionAutoConfigurationBeanDefinition() {
    Class<?> beanType = KafkaStreamsFunctionAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(KafkaStreamsFunctionAutoConfiguration::new);
    return beanDefinition;
  }
}
