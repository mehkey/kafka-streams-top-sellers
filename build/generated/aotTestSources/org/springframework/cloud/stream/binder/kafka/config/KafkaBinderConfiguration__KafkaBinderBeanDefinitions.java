package org.springframework.cloud.stream.binder.kafka.config;

import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.cloud.stream.binder.kafka.KafkaMessageChannelBinder;
import org.springframework.cloud.stream.binder.kafka.KafkaMessageChannelBinder__KafkaBinderAutowiring;
import org.springframework.cloud.stream.binder.kafka.properties.KafkaBinderConfigurationProperties;
import org.springframework.cloud.stream.binder.kafka.properties.KafkaExtendedBindingProperties;
import org.springframework.cloud.stream.binder.kafka.provisioning.KafkaTopicProvisioner;
import org.springframework.cloud.stream.config.ConsumerEndpointCustomizer;
import org.springframework.cloud.stream.config.ListenerContainerCustomizer;
import org.springframework.cloud.stream.config.MessageSourceCustomizer;
import org.springframework.cloud.stream.config.ProducerMessageHandlerCustomizer;
import org.springframework.kafka.security.jaas.KafkaJaasLoginModuleInitializer;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.messaging.converter.MessageConverter;

/**
 * Bean definitions for {@link KafkaBinderConfiguration}
 */
public class KafkaBinderConfiguration__KafkaBinderBeanDefinitions {
  /**
   * Get the bean definition for 'kafkaBinderConfiguration'
   */
  public static BeanDefinition getKafkaBinderConfigurationBeanDefinition() {
    Class<?> beanType = KafkaBinderConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(KafkaBinderConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'configurationProperties'.
   */
  private static BeanInstanceSupplier<KafkaBinderConfigurationProperties> getConfigurationPropertiesInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KafkaBinderConfigurationProperties>forFactoryMethod(KafkaBinderConfiguration.class, "configurationProperties", KafkaProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KafkaBinderConfiguration.class).configurationProperties(args.get(0)));
  }

  /**
   * Get the bean definition for 'configurationProperties'
   */
  public static BeanDefinition getConfigurationPropertiesBeanDefinition() {
    Class<?> beanType = KafkaBinderConfigurationProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getConfigurationPropertiesInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'provisioningProvider'.
   */
  private static BeanInstanceSupplier<KafkaTopicProvisioner> getProvisioningProviderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KafkaTopicProvisioner>forFactoryMethod(KafkaBinderConfiguration.class, "provisioningProvider", KafkaBinderConfigurationProperties.class, ObjectProvider.class, KafkaProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KafkaBinderConfiguration.class).provisioningProvider(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'provisioningProvider'
   */
  public static BeanDefinition getProvisioningProviderBeanDefinition() {
    Class<?> beanType = KafkaTopicProvisioner.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getProvisioningProviderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaMessageChannelBinder'.
   */
  private static BeanInstanceSupplier<KafkaMessageChannelBinder> getKafkaMessageChannelBinderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KafkaMessageChannelBinder>forFactoryMethod(KafkaBinderConfiguration.class, "kafkaMessageChannelBinder", KafkaBinderConfigurationProperties.class, KafkaTopicProvisioner.class, ListenerContainerCustomizer.class, MessageSourceCustomizer.class, ProducerMessageHandlerCustomizer.class, ConsumerEndpointCustomizer.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ProducerListener.class, KafkaExtendedBindingProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KafkaBinderConfiguration.class).kafkaMessageChannelBinder(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5), args.get(6), args.get(7), args.get(8), args.get(9), args.get(10), args.get(11), args.get(12), args.get(13)));
  }

  /**
   * Get the bean definition for 'kafkaMessageChannelBinder'
   */
  public static BeanDefinition getKafkaMessageChannelBinderBeanDefinition() {
    Class<?> beanType = KafkaMessageChannelBinder.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<KafkaMessageChannelBinder> instanceSupplier = getKafkaMessageChannelBinderInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(KafkaMessageChannelBinder__KafkaBinderAutowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaNullConverter'.
   */
  private static BeanInstanceSupplier<MessageConverter> getKafkaNullConverterInstanceSupplier() {
    return BeanInstanceSupplier.<MessageConverter>forFactoryMethod(KafkaBinderConfiguration.class, "kafkaNullConverter")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(KafkaBinderConfiguration.class).kafkaNullConverter());
  }

  /**
   * Get the bean definition for 'kafkaNullConverter'
   */
  public static BeanDefinition getKafkaNullConverterBeanDefinition() {
    Class<?> beanType = MessageConverter.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getKafkaNullConverterInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jaasInitializer'.
   */
  private static BeanInstanceSupplier<KafkaJaasLoginModuleInitializer> getJaasInitializerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KafkaJaasLoginModuleInitializer>forFactoryMethod(KafkaBinderConfiguration.class, "jaasInitializer", KafkaBinderConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KafkaBinderConfiguration.class).jaasInitializer(args.get(0)));
  }

  /**
   * Get the bean definition for 'jaasInitializer'
   */
  public static BeanDefinition getJaasInitializerBeanDefinition() {
    Class<?> beanType = KafkaJaasLoginModuleInitializer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getJaasInitializerInstanceSupplier());
    return beanDefinition;
  }
}
