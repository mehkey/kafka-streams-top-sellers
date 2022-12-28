package org.springframework.cloud.stream.binder.kafka.streams;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cloud.stream.binder.kafka.properties.KafkaBinderConfigurationProperties;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.kafka.security.jaas.KafkaJaasLoginModuleInitializer;

/**
 * Bean definitions for {@link KafkaStreamsJaasConfiguration}
 */
public class KafkaStreamsJaasConfiguration__KstreamBinderBeanDefinitions {
  /**
   * Get the bean definition for 'kafkaStreamsJaasConfiguration'
   */
  public static BeanDefinition getKafkaStreamsJaasConfigurationBeanDefinition() {
    Class<?> beanType = KafkaStreamsJaasConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(KafkaStreamsJaasConfiguration.class);
    beanDefinition.setInstanceSupplier(KafkaStreamsJaasConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jaasInitializer'.
   */
  private static BeanInstanceSupplier<KafkaJaasLoginModuleInitializer> getJaasInitializerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KafkaJaasLoginModuleInitializer>forFactoryMethod(KafkaStreamsJaasConfiguration.class, "jaasInitializer", KafkaBinderConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KafkaStreamsJaasConfiguration.class).jaasInitializer(args.get(0)));
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
