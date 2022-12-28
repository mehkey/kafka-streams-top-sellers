package org.springframework.cloud.stream.binder.kafka.properties;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link KafkaExtendedBindingProperties}
 */
public class KafkaExtendedBindingProperties__KafkaBinderBeanDefinitions {
  /**
   * Get the bean definition for 'kafkaExtendedBindingProperties'
   */
  public static BeanDefinition getKafkaExtendedBindingPropertiesBeanDefinition() {
    Class<?> beanType = KafkaExtendedBindingProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(KafkaExtendedBindingProperties::new);
    return beanDefinition;
  }
}
