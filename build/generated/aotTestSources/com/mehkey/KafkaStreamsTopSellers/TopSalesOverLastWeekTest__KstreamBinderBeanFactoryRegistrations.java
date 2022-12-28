package com.mehkey.KafkaStreamsTopSellers;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.context.properties.BoundConfigurationProperties__KstreamBinderBeanDefinitions;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinder__KstreamBinderBeanDefinitions;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor__KstreamBinderBeanDefinitions;
import org.springframework.boot.validation.beanvalidation.MethodValidationExcludeFilter__KstreamBinderBeanDefinitions;
import org.springframework.cloud.stream.binder.kafka.streams.KStreamBinderConfiguration__KstreamBinderBeanDefinitions;
import org.springframework.cloud.stream.binder.kafka.streams.KafkaStreamsJaasConfiguration__KstreamBinderBeanDefinitions;
import org.springframework.cloud.stream.binder.kafka.streams.MultiBinderPropertiesConfiguration__KstreamBinderBeanDefinitions;
import org.springframework.context.event.DefaultEventListenerFactory__KstreamBinderBeanDefinitions;
import org.springframework.context.event.EventListenerMethodProcessor__KstreamBinderBeanDefinitions;

/**
 * Register bean definitions for the bean factory.
 */
public class TopSalesOverLastWeekTest__KstreamBinderBeanFactoryRegistrations {
  /**
   * Register the bean definitions.
   */
  public void registerBeanDefinitions(DefaultListableBeanFactory beanFactory) {
    beanFactory.registerBeanDefinition("org.springframework.context.event.internalEventListenerProcessor", EventListenerMethodProcessor__KstreamBinderBeanDefinitions.getInternalEventListenerProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.context.event.internalEventListenerFactory", DefaultEventListenerFactory__KstreamBinderBeanDefinitions.getInternalEventListenerFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("KStreamBinderConfiguration", KStreamBinderConfiguration__KstreamBinderBeanDefinitions.getKStreamBinderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.cloud.stream.binder.kafka.streams.MultiBinderPropertiesConfiguration", MultiBinderPropertiesConfiguration__KstreamBinderBeanDefinitions.getMultiBinderPropertiesConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.cloud.stream.binder.kafka.streams.KafkaStreamsJaasConfiguration", KafkaStreamsJaasConfiguration__KstreamBinderBeanDefinitions.getKafkaStreamsJaasConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jaasInitializer", KafkaStreamsJaasConfiguration__KstreamBinderBeanDefinitions.getJaasInitializerBeanDefinition());
    beanFactory.registerBeanDefinition("provisioningProvider", KStreamBinderConfiguration__KstreamBinderBeanDefinitions.getProvisioningProviderBeanDefinition());
    beanFactory.registerBeanDefinition("kStreamBinder", KStreamBinderConfiguration__KstreamBinderBeanDefinitions.getKStreamBinderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor", ConfigurationPropertiesBindingPostProcessor__KstreamBinderBeanDefinitions.getConfigurationPropertiesBindingPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.internalConfigurationPropertiesBinderFactory", ConfigurationPropertiesBinder__KstreamBinderBeanDefinitions.Factory__BeanDefinitions.getInternalConfigurationPropertiesBinderFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.internalConfigurationPropertiesBinder", ConfigurationPropertiesBinder__KstreamBinderBeanDefinitions.getInternalConfigurationPropertiesBinderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.BoundConfigurationProperties", BoundConfigurationProperties__KstreamBinderBeanDefinitions.getBoundConfigurationPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter", MethodValidationExcludeFilter__KstreamBinderBeanDefinitions.getMethodValidationExcludeFilterBeanDefinition());
  }

  /**
   * Register the aliases.
   */
  public void registerAliases(DefaultListableBeanFactory beanFactory) {
  }
}
