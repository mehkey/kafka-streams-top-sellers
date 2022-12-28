package org.springframework.cloud.stream.binder.kafka.streams;

import java.lang.Class;
import java.util.Map;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.cloud.stream.binder.kafka.provisioning.KafkaTopicProvisioner;
import org.springframework.cloud.stream.binder.kafka.streams.properties.KafkaStreamsBinderConfigurationProperties;
import org.springframework.cloud.stream.binder.kafka.streams.properties.KafkaStreamsExtendedBindingProperties;

/**
 * Bean definitions for {@link GlobalKTableBinderConfiguration}
 */
public class GlobalKTableBinderConfiguration__GlobalktableBinderBeanDefinitions {
  /**
   * Get the bean definition for 'globalKTableBinderConfiguration'
   */
  public static BeanDefinition getGlobalKTableBinderConfigurationBeanDefinition() {
    Class<?> beanType = GlobalKTableBinderConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(GlobalKTableBinderConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'provisioningProvider'.
   */
  private static BeanInstanceSupplier<KafkaTopicProvisioner> getProvisioningProviderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KafkaTopicProvisioner>forFactoryMethod(GlobalKTableBinderConfiguration.class, "provisioningProvider", KafkaStreamsBinderConfigurationProperties.class, KafkaProperties.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(GlobalKTableBinderConfiguration.class).provisioningProvider(args.get(0), args.get(1), args.get(2)));
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
   * Get the bean instance supplier for 'GlobalKTableBinder'.
   */
  private static BeanInstanceSupplier<GlobalKTableBinder> getGlobalKTableBinderInstanceSupplier() {
    return BeanInstanceSupplier.<GlobalKTableBinder>forFactoryMethod(GlobalKTableBinderConfiguration.class, "GlobalKTableBinder", KafkaStreamsBinderConfigurationProperties.class, KafkaTopicProvisioner.class, KafkaStreamsExtendedBindingProperties.class, KafkaStreamsBindingInformationCatalogue.class, Map.class, KafkaStreamsRegistry.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(GlobalKTableBinderConfiguration.class).GlobalKTableBinder(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5)));
  }

  /**
   * Get the bean definition for 'globalKTableBinder'
   */
  public static BeanDefinition getGlobalKTableBinderBeanDefinition() {
    Class<?> beanType = GlobalKTableBinder.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<GlobalKTableBinder> instanceSupplier = getGlobalKTableBinderInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(GlobalKTableBinder__GlobalktableBinderAutowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
