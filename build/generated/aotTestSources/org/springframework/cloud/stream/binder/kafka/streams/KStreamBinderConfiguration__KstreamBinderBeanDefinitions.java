package org.springframework.cloud.stream.binder.kafka.streams;

import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.cloud.stream.binder.kafka.provisioning.KafkaTopicProvisioner;
import org.springframework.cloud.stream.binder.kafka.streams.properties.KafkaStreamsBinderConfigurationProperties;
import org.springframework.cloud.stream.binder.kafka.streams.properties.KafkaStreamsExtendedBindingProperties;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link KStreamBinderConfiguration}
 */
public class KStreamBinderConfiguration__KstreamBinderBeanDefinitions {
  /**
   * Get the bean definition for 'kStreamBinderConfiguration'
   */
  public static BeanDefinition getKStreamBinderConfigurationBeanDefinition() {
    Class<?> beanType = KStreamBinderConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(KStreamBinderConfiguration.class);
    beanDefinition.setInstanceSupplier(KStreamBinderConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'provisioningProvider'.
   */
  private static BeanInstanceSupplier<KafkaTopicProvisioner> getProvisioningProviderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KafkaTopicProvisioner>forFactoryMethod(KStreamBinderConfiguration.class, "provisioningProvider", KafkaStreamsBinderConfigurationProperties.class, KafkaProperties.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KStreamBinderConfiguration.class).provisioningProvider(args.get(0), args.get(1), args.get(2)));
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
   * Get the bean instance supplier for 'kStreamBinder'.
   */
  private static BeanInstanceSupplier<KStreamBinder> getKStreamBinderInstanceSupplier() {
    return BeanInstanceSupplier.<KStreamBinder>forFactoryMethod(KStreamBinderConfiguration.class, "kStreamBinder", KafkaStreamsBinderConfigurationProperties.class, KafkaTopicProvisioner.class, KafkaStreamsMessageConversionDelegate.class, KafkaStreamsBindingInformationCatalogue.class, KeyValueSerdeResolver.class, KafkaStreamsExtendedBindingProperties.class, KafkaStreamsRegistry.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KStreamBinderConfiguration.class).kStreamBinder(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5), args.get(6)));
  }

  /**
   * Get the bean definition for 'kStreamBinder'
   */
  public static BeanDefinition getKStreamBinderBeanDefinition() {
    Class<?> beanType = KStreamBinder.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<KStreamBinder> instanceSupplier = getKStreamBinderInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(KStreamBinder__KstreamBinderAutowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
