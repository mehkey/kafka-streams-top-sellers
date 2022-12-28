package com.mehkey.KafkaStreamsTopSellers;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.context.properties.BoundConfigurationProperties__KafkaBinderBeanDefinitions;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinder__KafkaBinderBeanDefinitions;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor__KafkaBinderBeanDefinitions;
import org.springframework.boot.validation.beanvalidation.MethodValidationExcludeFilter__KafkaBinderBeanDefinitions;
import org.springframework.cloud.stream.binder.kafka.config.KafkaBinderConfiguration__KafkaBinderBeanDefinitions;
import org.springframework.cloud.stream.binder.kafka.properties.KafkaExtendedBindingProperties__KafkaBinderBeanDefinitions;
import org.springframework.context.event.DefaultEventListenerFactory__KafkaBinderBeanDefinitions;
import org.springframework.context.event.EventListenerMethodProcessor__KafkaBinderBeanDefinitions;

/**
 * Register bean definitions for the bean factory.
 */
public class TopSalesOverLastWeekTest__KafkaBinderBeanFactoryRegistrations {
  /**
   * Register the bean definitions.
   */
  public void registerBeanDefinitions(DefaultListableBeanFactory beanFactory) {
    beanFactory.registerBeanDefinition("org.springframework.context.event.internalEventListenerProcessor", EventListenerMethodProcessor__KafkaBinderBeanDefinitions.getInternalEventListenerProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.context.event.internalEventListenerFactory", DefaultEventListenerFactory__KafkaBinderBeanDefinitions.getInternalEventListenerFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("kafkaBinderConfiguration", KafkaBinderConfiguration__KafkaBinderBeanDefinitions.getKafkaBinderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("configurationProperties", KafkaBinderConfiguration__KafkaBinderBeanDefinitions.getConfigurationPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("provisioningProvider", KafkaBinderConfiguration__KafkaBinderBeanDefinitions.getProvisioningProviderBeanDefinition());
    beanFactory.registerBeanDefinition("kafkaMessageChannelBinder", KafkaBinderConfiguration__KafkaBinderBeanDefinitions.getKafkaMessageChannelBinderBeanDefinition());
    beanFactory.registerBeanDefinition("kafkaNullConverter", KafkaBinderConfiguration__KafkaBinderBeanDefinitions.getKafkaNullConverterBeanDefinition());
    beanFactory.registerBeanDefinition("jaasInitializer", KafkaBinderConfiguration__KafkaBinderBeanDefinitions.getJaasInitializerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor", ConfigurationPropertiesBindingPostProcessor__KafkaBinderBeanDefinitions.getConfigurationPropertiesBindingPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.internalConfigurationPropertiesBinderFactory", ConfigurationPropertiesBinder__KafkaBinderBeanDefinitions.Factory__BeanDefinitions.getInternalConfigurationPropertiesBinderFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.internalConfigurationPropertiesBinder", ConfigurationPropertiesBinder__KafkaBinderBeanDefinitions.getInternalConfigurationPropertiesBinderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.BoundConfigurationProperties", BoundConfigurationProperties__KafkaBinderBeanDefinitions.getBoundConfigurationPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter", MethodValidationExcludeFilter__KafkaBinderBeanDefinitions.getMethodValidationExcludeFilterBeanDefinition());
    beanFactory.registerBeanDefinition("spring.cloud.stream.kafka-org.springframework.cloud.stream.binder.kafka.properties.KafkaExtendedBindingProperties", KafkaExtendedBindingProperties__KafkaBinderBeanDefinitions.getKafkaExtendedBindingPropertiesBeanDefinition());
  }

  /**
   * Register the aliases.
   */
  public void registerAliases(DefaultListableBeanFactory beanFactory) {
  }
}
