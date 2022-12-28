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
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link KTableBinderConfiguration}
 */
public class KTableBinderConfiguration__KtableBinderBeanDefinitions {
  /**
   * Get the bean definition for 'kTableBinderConfiguration'
   */
  public static BeanDefinition getKTableBinderConfigurationBeanDefinition() {
    Class<?> beanType = KTableBinderConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(KTableBinderConfiguration.class);
    beanDefinition.setInstanceSupplier(KTableBinderConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'provisioningProvider'.
   */
  private static BeanInstanceSupplier<KafkaTopicProvisioner> getProvisioningProviderInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KafkaTopicProvisioner>forFactoryMethod(KTableBinderConfiguration.class, "provisioningProvider", KafkaStreamsBinderConfigurationProperties.class, KafkaProperties.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KTableBinderConfiguration.class).provisioningProvider(args.get(0), args.get(1), args.get(2)));
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
   * Get the bean instance supplier for 'kTableBinder'.
   */
  private static BeanInstanceSupplier<KTableBinder> getKTableBinderInstanceSupplier() {
    return BeanInstanceSupplier.<KTableBinder>forFactoryMethod(KTableBinderConfiguration.class, "kTableBinder", KafkaStreamsBinderConfigurationProperties.class, KafkaTopicProvisioner.class, KafkaStreamsExtendedBindingProperties.class, KafkaStreamsBindingInformationCatalogue.class, Map.class, KafkaStreamsRegistry.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KTableBinderConfiguration.class).kTableBinder(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5)));
  }

  /**
   * Get the bean definition for 'kTableBinder'
   */
  public static BeanDefinition getKTableBinderBeanDefinition() {
    Class<?> beanType = KTableBinder.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<KTableBinder> instanceSupplier = getKTableBinderInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(KTableBinder__KtableBinderAutowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
