package org.springframework.boot.autoconfigure.integration;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.task.TaskSchedulerBuilder;
import org.springframework.integration.scheduling.PollerMetadata;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

/**
 * Bean definitions for {@link IntegrationAutoConfiguration}
 */
public class IntegrationAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'integrationAutoConfiguration'
   */
  public static BeanDefinition getIntegrationAutoConfigurationBeanDefinition() {
    Class<?> beanType = IntegrationAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(IntegrationAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'integrationGlobalProperties'.
   */
  private static BeanInstanceSupplier<org.springframework.integration.context.IntegrationProperties> getIntegrationGlobalPropertiesInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<org.springframework.integration.context.IntegrationProperties>forFactoryMethod(IntegrationAutoConfiguration.class, "integrationGlobalProperties", IntegrationProperties.class)
            .withGenerator((registeredBean, args) -> IntegrationAutoConfiguration.integrationGlobalProperties(args.get(0)));
  }

  /**
   * Get the bean definition for 'integrationGlobalProperties'
   */
  public static BeanDefinition getIntegrationGlobalPropertiesBeanDefinition() {
    Class<?> beanType = org.springframework.integration.context.IntegrationProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getIntegrationGlobalPropertiesInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link IntegrationAutoConfiguration.IntegrationTaskSchedulerConfiguration}
   */
  public static class IntegrationTaskSchedulerConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'integrationTaskSchedulerConfiguration'
     */
    public static BeanDefinition getIntegrationTaskSchedulerConfigurationBeanDefinition() {
      Class<?> beanType = IntegrationAutoConfiguration.IntegrationTaskSchedulerConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(IntegrationAutoConfiguration.IntegrationTaskSchedulerConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'taskScheduler'.
     */
    private static BeanInstanceSupplier<ThreadPoolTaskScheduler> getTaskSchedulerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ThreadPoolTaskScheduler>forFactoryMethod(IntegrationAutoConfiguration.IntegrationTaskSchedulerConfiguration.class, "taskScheduler", TaskSchedulerBuilder.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(IntegrationAutoConfiguration.IntegrationTaskSchedulerConfiguration.class).taskScheduler(args.get(0)));
    }

    /**
     * Get the bean definition for 'taskScheduler'
     */
    public static BeanDefinition getTaskSchedulerBeanDefinition() {
      Class<?> beanType = ThreadPoolTaskScheduler.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getTaskSchedulerInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link IntegrationAutoConfiguration.IntegrationConfiguration}
   */
  public static class IntegrationConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'integrationConfiguration'
     */
    public static BeanDefinition getIntegrationConfigurationBeanDefinition() {
      Class<?> beanType = IntegrationAutoConfiguration.IntegrationConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(IntegrationAutoConfiguration.IntegrationConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'org.springframework.integration.context.defaultPollerMetadata'.
     */
    private static BeanInstanceSupplier<PollerMetadata> getDefaultPollerMetadataInstanceSupplier() {
      return BeanInstanceSupplier.<PollerMetadata>forFactoryMethod(IntegrationAutoConfiguration.IntegrationConfiguration.class, "defaultPollerMetadata", IntegrationProperties.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(IntegrationAutoConfiguration.IntegrationConfiguration.class).defaultPollerMetadata(args.get(0)));
    }

    /**
     * Get the bean definition for 'defaultPollerMetadata'
     */
    public static BeanDefinition getDefaultPollerMetadataBeanDefinition() {
      Class<?> beanType = PollerMetadata.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getDefaultPollerMetadataInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link IntegrationAutoConfiguration.IntegrationComponentScanConfiguration}
   */
  public static class IntegrationComponentScanConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'integrationComponentScanConfiguration'
     */
    public static BeanDefinition getIntegrationComponentScanConfigurationBeanDefinition() {
      Class<?> beanType = IntegrationAutoConfiguration.IntegrationComponentScanConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(IntegrationAutoConfiguration.IntegrationComponentScanConfiguration::new);
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link IntegrationAutoConfiguration.IntegrationManagementConfiguration}
   */
  public static class IntegrationManagementConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'integrationManagementConfiguration'
     */
    public static BeanDefinition getIntegrationManagementConfigurationBeanDefinition() {
      Class<?> beanType = IntegrationAutoConfiguration.IntegrationManagementConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(IntegrationAutoConfiguration.IntegrationManagementConfiguration::new);
      return beanDefinition;
    }

    /**
     * Bean definitions for {@link IntegrationAutoConfiguration.IntegrationManagementConfiguration.EnableIntegrationManagementConfiguration}
     */
    public static class EnableIntegrationManagementConfiguration__BeanDefinitions {
      /**
       * Get the bean definition for 'enableIntegrationManagementConfiguration'
       */
      public static BeanDefinition getEnableIntegrationManagementConfigurationBeanDefinition() {
        Class<?> beanType = IntegrationAutoConfiguration.IntegrationManagementConfiguration.EnableIntegrationManagementConfiguration.class;
        RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
        beanDefinition.setInstanceSupplier(IntegrationAutoConfiguration.IntegrationManagementConfiguration.EnableIntegrationManagementConfiguration::new);
        return beanDefinition;
      }
    }
  }
}
