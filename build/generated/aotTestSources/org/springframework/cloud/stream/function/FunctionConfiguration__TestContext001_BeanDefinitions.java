package org.springframework.cloud.stream.function;

import java.lang.Class;
import java.util.List;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cloud.function.context.FunctionCatalog;
import org.springframework.cloud.stream.binding.NewDestinationBindingCallback;
import org.springframework.cloud.stream.config.BindingServiceProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.TaskScheduler;

/**
 * Bean definitions for {@link FunctionConfiguration}
 */
public class FunctionConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'functionConfiguration'
   */
  public static BeanDefinition getFunctionConfigurationBeanDefinition() {
    Class<?> beanType = FunctionConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(FunctionConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'streamBridgeUtils'.
   */
  private static BeanInstanceSupplier<StreamBridge> getStreamBridgeUtilsInstanceSupplier() {
    return BeanInstanceSupplier.<StreamBridge>forFactoryMethod(FunctionConfiguration.class, "streamBridgeUtils", FunctionCatalog.class, BindingServiceProperties.class, ConfigurableApplicationContext.class, NewDestinationBindingCallback.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(FunctionConfiguration.class).streamBridgeUtils(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'streamBridgeUtils'
   */
  public static BeanDefinition getStreamBridgeUtilsBeanDefinition() {
    Class<?> beanType = StreamBridge.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getStreamBridgeUtilsInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'functionBindingRegistrar'.
   */
  private static BeanInstanceSupplier<InitializingBean> getFunctionBindingRegistrarInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<InitializingBean>forFactoryMethod(FunctionConfiguration.class, "functionBindingRegistrar", Environment.class, FunctionCatalog.class, StreamFunctionProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(FunctionConfiguration.class).functionBindingRegistrar(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'functionBindingRegistrar'
   */
  public static BeanDefinition getFunctionBindingRegistrarBeanDefinition() {
    Class<?> beanType = InitializingBean.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getFunctionBindingRegistrarInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'po'.
   */
  private static BeanInstanceSupplier<SmartInitializingSingleton> getPoInstanceSupplier() {
    return BeanInstanceSupplier.<SmartInitializingSingleton>forFactoryMethod(FunctionConfiguration.class, "po", GenericApplicationContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(FunctionConfiguration.class).po(args.get(0)));
  }

  /**
   * Get the bean definition for 'po'
   */
  public static BeanDefinition getPoBeanDefinition() {
    Class<?> beanType = SmartInitializingSingleton.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getPoInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'functionInitializer'.
   */
  private static BeanInstanceSupplier<InitializingBean> getFunctionInitializerInstanceSupplier() {
    return BeanInstanceSupplier.<InitializingBean>forFactoryMethod(FunctionConfiguration.class, "functionInitializer", FunctionCatalog.class, StreamFunctionProperties.class, BindingServiceProperties.class, ConfigurableApplicationContext.class, StreamBridge.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(FunctionConfiguration.class).functionInitializer(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
  }

  /**
   * Get the bean definition for 'functionInitializer'
   */
  public static BeanDefinition getFunctionInitializerBeanDefinition() {
    Class<?> beanType = InitializingBean.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getFunctionInitializerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'supplierInitializer'.
   */
  private static BeanInstanceSupplier<InitializingBean> getSupplierInitializerInstanceSupplier() {
    return BeanInstanceSupplier.<InitializingBean>forFactoryMethod(FunctionConfiguration.class, "supplierInitializer", FunctionCatalog.class, StreamFunctionProperties.class, GenericApplicationContext.class, BindingServiceProperties.class, List.class, StreamBridge.class, TaskScheduler.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(FunctionConfiguration.class).supplierInitializer(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4), args.get(5), args.get(6)));
  }

  /**
   * Get the bean definition for 'supplierInitializer'
   */
  public static BeanDefinition getSupplierInitializerBeanDefinition() {
    Class<?> beanType = InitializingBean.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getSupplierInitializerInstanceSupplier());
    return beanDefinition;
  }
}
