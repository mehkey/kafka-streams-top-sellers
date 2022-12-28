package org.springframework.integration.config;

import java.lang.Class;
import java.lang.Object;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ConverterRegistrar}
 */
public class ConverterRegistrar__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'converterRegistrar'
   */
  public static BeanDefinition getConverterRegistrarBeanDefinition() {
    Class<?> beanType = ConverterRegistrar.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(ConverterRegistrar::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link ConverterRegistrar.IntegrationConverterRegistration}
   */
  public static class IntegrationConverterRegistration__BeanDefinitions {
    /**
     * Get the bean instance supplier for 'org.springframework.integration.config.ConverterRegistrar$IntegrationConverterRegistration#0'.
     */
    private static BeanInstanceSupplier<ConverterRegistrar.IntegrationConverterRegistration> getIntegrationConverterRegistrationInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<ConverterRegistrar.IntegrationConverterRegistration>forConstructor(Object.class)
              .withGenerator((registeredBean, args) -> new ConverterRegistrar.IntegrationConverterRegistration(args.get(0)));
    }

    /**
     * Get the bean definition for 'integrationConverterRegistration#0'
     */
    public static BeanDefinition getIntegrationConverterRegistrationBeanDefinition() {
      Class<?> beanType = ConverterRegistrar.IntegrationConverterRegistration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, new RuntimeBeanReference("spelConverter"));
      beanDefinition.setInstanceSupplier(getIntegrationConverterRegistrationInstanceSupplier());
      return beanDefinition;
    }
  }
}
