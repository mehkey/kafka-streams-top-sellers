package org.springframework.cloud.stream.binder.test;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cloud.stream.binder.Binder;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.core.ResolvableType;

/**
 * Bean definitions for {@link TestChannelBinderConfiguration}
 */
public class TestChannelBinderConfiguration__IntegrationBinderBeanDefinitions {
  /**
   * Get the bean definition for 'testChannelBinderConfiguration'
   */
  public static BeanDefinition getTestChannelBinderConfigurationBeanDefinition() {
    Class<?> beanType = TestChannelBinderConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(TestChannelBinderConfiguration.class);
    beanDefinition.setInstanceSupplier(TestChannelBinderConfiguration$$SpringCGLIB$$0::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'sourceDestination'.
   */
  private static BeanInstanceSupplier<InputDestination> getSourceDestinationInstanceSupplier() {
    return BeanInstanceSupplier.<InputDestination>forFactoryMethod(TestChannelBinderConfiguration.class, "sourceDestination")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(TestChannelBinderConfiguration.class).sourceDestination());
  }

  /**
   * Get the bean definition for 'sourceDestination'
   */
  public static BeanDefinition getSourceDestinationBeanDefinition() {
    Class<?> beanType = InputDestination.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getSourceDestinationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'targetDestination'.
   */
  private static BeanInstanceSupplier<OutputDestination> getTargetDestinationInstanceSupplier() {
    return BeanInstanceSupplier.<OutputDestination>forFactoryMethod(TestChannelBinderConfiguration.class, "targetDestination")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(TestChannelBinderConfiguration.class).targetDestination());
  }

  /**
   * Get the bean definition for 'targetDestination'
   */
  public static BeanDefinition getTargetDestinationBeanDefinition() {
    Class<?> beanType = OutputDestination.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getTargetDestinationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'springIntegrationChannelBinder'.
   */
  private static BeanInstanceSupplier<Binder> getSpringIntegrationChannelBinderInstanceSupplier() {
    return BeanInstanceSupplier.<Binder>forFactoryMethod(TestChannelBinderConfiguration.class, "springIntegrationChannelBinder", TestChannelBinderProvisioner.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(TestChannelBinderConfiguration.class).springIntegrationChannelBinder(args.get(0)));
  }

  /**
   * Get the bean definition for 'springIntegrationChannelBinder'
   */
  public static BeanDefinition getSpringIntegrationChannelBinderBeanDefinition() {
    ResolvableType beanType = ResolvableType.forClass(Binder.class);
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getSpringIntegrationChannelBinderInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'springIntegrationProvisioner'.
   */
  private static BeanInstanceSupplier<TestChannelBinderProvisioner> getSpringIntegrationProvisionerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TestChannelBinderProvisioner>forFactoryMethod(TestChannelBinderConfiguration.class, "springIntegrationProvisioner")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(TestChannelBinderConfiguration.class).springIntegrationProvisioner());
  }

  /**
   * Get the bean definition for 'springIntegrationProvisioner'
   */
  public static BeanDefinition getSpringIntegrationProvisionerBeanDefinition() {
    Class<?> beanType = TestChannelBinderProvisioner.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<TestChannelBinderProvisioner> instanceSupplier = getSpringIntegrationProvisionerInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(TestChannelBinderProvisioner__IntegrationBinderAutowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
