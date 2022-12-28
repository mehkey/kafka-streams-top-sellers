package org.springframework.cloud.function.cloudevent;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cloud.function.core.FunctionInvocationHelper;
import org.springframework.core.ResolvableType;
import org.springframework.messaging.Message;

/**
 * Bean definitions for {@link CloudEventsFunctionExtensionConfiguration}
 */
public class CloudEventsFunctionExtensionConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'cloudEventsFunctionExtensionConfiguration'
   */
  public static BeanDefinition getCloudEventsFunctionExtensionConfigurationBeanDefinition() {
    Class<?> beanType = CloudEventsFunctionExtensionConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(CloudEventsFunctionExtensionConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'nativeFunctionInvocationHelper'.
   */
  private static BeanInstanceSupplier<FunctionInvocationHelper> getNativeFunctionInvocationHelperInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<FunctionInvocationHelper>forFactoryMethod(CloudEventsFunctionExtensionConfiguration.class, "nativeFunctionInvocationHelper", CloudEventHeaderEnricher.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(CloudEventsFunctionExtensionConfiguration.class).nativeFunctionInvocationHelper(args.get(0)));
  }

  /**
   * Get the bean definition for 'nativeFunctionInvocationHelper'
   */
  public static BeanDefinition getNativeFunctionInvocationHelperBeanDefinition() {
    ResolvableType beanType = ResolvableType.forClassWithGenerics(FunctionInvocationHelper.class, ResolvableType.forClass(Message.class));
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getNativeFunctionInvocationHelperInstanceSupplier());
    return beanDefinition;
  }
}
