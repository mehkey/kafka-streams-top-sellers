package org.springframework.cloud.stream.binder.kafka.config;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cloud.stream.config.BindingHandlerAdvise;

/**
 * Bean definitions for {@link ExtendedBindingHandlerMappingsProviderConfiguration}
 */
public class ExtendedBindingHandlerMappingsProviderConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'extendedBindingHandlerMappingsProviderConfiguration'
   */
  public static BeanDefinition getExtendedBindingHandlerMappingsProviderConfigurationBeanDefinition(
      ) {
    Class<?> beanType = ExtendedBindingHandlerMappingsProviderConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ExtendedBindingHandlerMappingsProviderConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaExtendedPropertiesDefaultMappingsProvider'.
   */
  private static BeanInstanceSupplier<BindingHandlerAdvise.MappingsProvider> getKafkaExtendedPropertiesDefaultMappingsProviderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<BindingHandlerAdvise.MappingsProvider>forFactoryMethod(ExtendedBindingHandlerMappingsProviderConfiguration.class, "kafkaExtendedPropertiesDefaultMappingsProvider")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(ExtendedBindingHandlerMappingsProviderConfiguration.class).kafkaExtendedPropertiesDefaultMappingsProvider());
  }

  /**
   * Get the bean definition for 'kafkaExtendedPropertiesDefaultMappingsProvider'
   */
  public static BeanDefinition getKafkaExtendedPropertiesDefaultMappingsProviderBeanDefinition() {
    Class<?> beanType = BindingHandlerAdvise.MappingsProvider.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getKafkaExtendedPropertiesDefaultMappingsProviderInstanceSupplier());
    return beanDefinition;
  }
}
