package org.springframework.integration.handler.support;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link IntegrationMessageHandlerMethodFactory}
 */
public class IntegrationMessageHandlerMethodFactory__TestContext001_BeanDefinitions {
  /**
   * Get the bean instance supplier for 'integrationListMessageHandlerMethodFactory'.
   */
  private static BeanInstanceSupplier<IntegrationMessageHandlerMethodFactory> getIntegrationListMessageHandlerMethodFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<IntegrationMessageHandlerMethodFactory>forConstructor(boolean.class)
            .withGenerator((registeredBean, args) -> new IntegrationMessageHandlerMethodFactory(args.get(0)));
  }

  /**
   * Get the bean definition for 'integrationListMessageHandlerMethodFactory'
   */
  public static BeanDefinition getIntegrationListMessageHandlerMethodFactoryBeanDefinition() {
    Class<?> beanType = IntegrationMessageHandlerMethodFactory.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.getConstructorArgumentValues().addIndexedArgumentValue(0, true);
    beanDefinition.getPropertyValues().addPropertyValue("messageConverter", new RuntimeBeanReference("integrationArgumentResolverMessageConverter"));
    beanDefinition.setInstanceSupplier(getIntegrationListMessageHandlerMethodFactoryInstanceSupplier());
    return beanDefinition;
  }
}
