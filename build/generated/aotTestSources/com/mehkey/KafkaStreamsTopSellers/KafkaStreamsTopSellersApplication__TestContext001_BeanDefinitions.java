package com.mehkey.KafkaStreamsTopSellers;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link KafkaStreamsTopSellersApplication}
 */
public class KafkaStreamsTopSellersApplication__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'kafkaStreamsTopSellersApplication'
   */
  public static BeanDefinition getKafkaStreamsTopSellersApplicationBeanDefinition() {
    Class<?> beanType = KafkaStreamsTopSellersApplication.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(KafkaStreamsTopSellersApplication.class);
    beanDefinition.setInstanceSupplier(KafkaStreamsTopSellersApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
