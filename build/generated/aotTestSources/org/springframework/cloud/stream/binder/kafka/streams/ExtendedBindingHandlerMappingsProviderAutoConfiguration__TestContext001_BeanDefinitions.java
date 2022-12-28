package org.springframework.cloud.stream.binder.kafka.streams;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cloud.stream.config.BindingHandlerAdvise;

/**
 * Bean definitions for {@link ExtendedBindingHandlerMappingsProviderAutoConfiguration}
 */
public class ExtendedBindingHandlerMappingsProviderAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'extendedBindingHandlerMappingsProviderAutoConfiguration'
   */
  public static BeanDefinition getExtendedBindingHandlerMappingsProviderAutoConfigurationBeanDefinition(
      ) {
    Class<?> beanType = ExtendedBindingHandlerMappingsProviderAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ExtendedBindingHandlerMappingsProviderAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaStreamsExtendedPropertiesDefaultMappingsProvider'.
   */
  private static BeanInstanceSupplier<BindingHandlerAdvise.MappingsProvider> getKafkaStreamsExtendedPropertiesDefaultMappingsProviderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<BindingHandlerAdvise.MappingsProvider>forFactoryMethod(ExtendedBindingHandlerMappingsProviderAutoConfiguration.class, "kafkaStreamsExtendedPropertiesDefaultMappingsProvider")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ExtendedBindingHandlerMappingsProviderAutoConfiguration.class).kafkaStreamsExtendedPropertiesDefaultMappingsProvider());
  }

  /**
   * Get the bean definition for 'kafkaStreamsExtendedPropertiesDefaultMappingsProvider'
   */
  public static BeanDefinition getKafkaStreamsExtendedPropertiesDefaultMappingsProviderBeanDefinition(
      ) {
    Class<?> beanType = BindingHandlerAdvise.MappingsProvider.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getKafkaStreamsExtendedPropertiesDefaultMappingsProviderInstanceSupplier());
    return beanDefinition;
  }
}
