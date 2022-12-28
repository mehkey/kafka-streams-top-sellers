package org.springframework.cloud.stream.binder.kafka.streams.properties;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link KafkaStreamsExtendedBindingProperties}
 */
public class KafkaStreamsExtendedBindingProperties__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'kafkaStreamsExtendedBindingProperties'
   */
  public static BeanDefinition getKafkaStreamsExtendedBindingPropertiesBeanDefinition() {
    Class<?> beanType = KafkaStreamsExtendedBindingProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(KafkaStreamsExtendedBindingProperties::new);
    return beanDefinition;
  }
}
