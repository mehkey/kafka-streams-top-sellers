package org.springframework.boot.autoconfigure.kafka;

import java.lang.Class;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.ResolvableType;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;

/**
 * Bean definitions for {@link KafkaAnnotationDrivenConfiguration}
 */
public class KafkaAnnotationDrivenConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.autoconfigure.kafka.KafkaAnnotationDrivenConfiguration'.
   */
  private static BeanInstanceSupplier<KafkaAnnotationDrivenConfiguration> getKafkaAnnotationDrivenConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KafkaAnnotationDrivenConfiguration>forConstructor(KafkaProperties.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> new KafkaAnnotationDrivenConfiguration(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5), args.get(6), args.get(7), args.get(8), args.get(9)));
  }

  /**
   * Get the bean definition for 'kafkaAnnotationDrivenConfiguration'
   */
  public static BeanDefinition getKafkaAnnotationDrivenConfigurationBeanDefinition() {
    Class<?> beanType = KafkaAnnotationDrivenConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getKafkaAnnotationDrivenConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaListenerContainerFactoryConfigurer'.
   */
  private static BeanInstanceSupplier<ConcurrentKafkaListenerContainerFactoryConfigurer> getKafkaListenerContainerFactoryConfigurerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ConcurrentKafkaListenerContainerFactoryConfigurer>forFactoryMethod(KafkaAnnotationDrivenConfiguration.class, "kafkaListenerContainerFactoryConfigurer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(KafkaAnnotationDrivenConfiguration.class).kafkaListenerContainerFactoryConfigurer());
  }

  /**
   * Get the bean definition for 'kafkaListenerContainerFactoryConfigurer'
   */
  public static BeanDefinition getKafkaListenerContainerFactoryConfigurerBeanDefinition() {
    Class<?> beanType = ConcurrentKafkaListenerContainerFactoryConfigurer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getKafkaListenerContainerFactoryConfigurerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaListenerContainerFactory'.
   */
  private static BeanInstanceSupplier<ConcurrentKafkaListenerContainerFactory> getKafkaListenerContainerFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ConcurrentKafkaListenerContainerFactory>forFactoryMethod(KafkaAnnotationDrivenConfiguration.class, "kafkaListenerContainerFactory", ConcurrentKafkaListenerContainerFactoryConfigurer.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KafkaAnnotationDrivenConfiguration.class).kafkaListenerContainerFactory(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'kafkaListenerContainerFactory'
   */
  public static BeanDefinition getKafkaListenerContainerFactoryBeanDefinition() {
    ResolvableType beanType = ResolvableType.forClass(ConcurrentKafkaListenerContainerFactory.class);
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getKafkaListenerContainerFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link KafkaAnnotationDrivenConfiguration.EnableKafkaConfiguration}
   */
  public static class EnableKafkaConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'enableKafkaConfiguration'
     */
    public static BeanDefinition getEnableKafkaConfigurationBeanDefinition() {
      Class<?> beanType = KafkaAnnotationDrivenConfiguration.EnableKafkaConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(KafkaAnnotationDrivenConfiguration.EnableKafkaConfiguration::new);
      return beanDefinition;
    }
  }
}
