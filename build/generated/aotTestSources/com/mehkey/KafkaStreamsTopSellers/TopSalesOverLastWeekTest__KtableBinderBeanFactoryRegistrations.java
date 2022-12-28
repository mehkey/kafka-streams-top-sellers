package com.mehkey.KafkaStreamsTopSellers;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.context.properties.BoundConfigurationProperties__KtableBinderBeanDefinitions;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinder__KtableBinderBeanDefinitions;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor__KtableBinderBeanDefinitions;
import org.springframework.boot.validation.beanvalidation.MethodValidationExcludeFilter__KtableBinderBeanDefinitions;
import org.springframework.cloud.stream.binder.kafka.streams.KTableBinderConfiguration__KtableBinderBeanDefinitions;
import org.springframework.cloud.stream.binder.kafka.streams.KafkaStreamsJaasConfiguration__KtableBinderBeanDefinitions;
import org.springframework.cloud.stream.binder.kafka.streams.MultiBinderPropertiesConfiguration__KtableBinderBeanDefinitions;
import org.springframework.context.event.DefaultEventListenerFactory__KtableBinderBeanDefinitions;
import org.springframework.context.event.EventListenerMethodProcessor__KtableBinderBeanDefinitions;

/**
 * Register bean definitions for the bean factory.
 */
public class TopSalesOverLastWeekTest__KtableBinderBeanFactoryRegistrations {
  /**
   * Register the bean definitions.
   */
  public void registerBeanDefinitions(DefaultListableBeanFactory beanFactory) {
    beanFactory.registerBeanDefinition("org.springframework.context.event.internalEventListenerProcessor", EventListenerMethodProcessor__KtableBinderBeanDefinitions.getInternalEventListenerProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.context.event.internalEventListenerFactory", DefaultEventListenerFactory__KtableBinderBeanDefinitions.getInternalEventListenerFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("KTableBinderConfiguration", KTableBinderConfiguration__KtableBinderBeanDefinitions.getKTableBinderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.cloud.stream.binder.kafka.streams.MultiBinderPropertiesConfiguration", MultiBinderPropertiesConfiguration__KtableBinderBeanDefinitions.getMultiBinderPropertiesConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.cloud.stream.binder.kafka.streams.KafkaStreamsJaasConfiguration", KafkaStreamsJaasConfiguration__KtableBinderBeanDefinitions.getKafkaStreamsJaasConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jaasInitializer", KafkaStreamsJaasConfiguration__KtableBinderBeanDefinitions.getJaasInitializerBeanDefinition());
    beanFactory.registerBeanDefinition("provisioningProvider", KTableBinderConfiguration__KtableBinderBeanDefinitions.getProvisioningProviderBeanDefinition());
    beanFactory.registerBeanDefinition("kTableBinder", KTableBinderConfiguration__KtableBinderBeanDefinitions.getKTableBinderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor", ConfigurationPropertiesBindingPostProcessor__KtableBinderBeanDefinitions.getConfigurationPropertiesBindingPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.internalConfigurationPropertiesBinderFactory", ConfigurationPropertiesBinder__KtableBinderBeanDefinitions.Factory__BeanDefinitions.getInternalConfigurationPropertiesBinderFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.internalConfigurationPropertiesBinder", ConfigurationPropertiesBinder__KtableBinderBeanDefinitions.getInternalConfigurationPropertiesBinderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.BoundConfigurationProperties", BoundConfigurationProperties__KtableBinderBeanDefinitions.getBoundConfigurationPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter", MethodValidationExcludeFilter__KtableBinderBeanDefinitions.getMethodValidationExcludeFilterBeanDefinition());
  }

  /**
   * Register the aliases.
   */
  public void registerAliases(DefaultListableBeanFactory beanFactory) {
  }
}
