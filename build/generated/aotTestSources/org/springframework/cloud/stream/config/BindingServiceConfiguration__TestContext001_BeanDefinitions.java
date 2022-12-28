package org.springframework.cloud.stream.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.Class;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RegisteredBean;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cloud.stream.binder.BinderChildContextInitializer;
import org.springframework.cloud.stream.binder.BinderFactory;
import org.springframework.cloud.stream.binder.BinderTypeRegistry;
import org.springframework.cloud.stream.binder.DefaultBinderFactory;
import org.springframework.cloud.stream.binding.BindingService;
import org.springframework.cloud.stream.binding.BindingsLifecycleController;
import org.springframework.cloud.stream.binding.ContextStartAfterRefreshListener;
import org.springframework.cloud.stream.binding.DynamicDestinationsBindable;
import org.springframework.cloud.stream.binding.InputBindingLifecycle;
import org.springframework.cloud.stream.binding.InputBindingLifecycle__TestContext001_Autowiring;
import org.springframework.cloud.stream.binding.OutputBindingLifecycle;
import org.springframework.cloud.stream.binding.OutputBindingLifecycle__TestContext001_Autowiring;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.ResolvableType;
import org.springframework.scheduling.TaskScheduler;

/**
 * Bean definitions for {@link BindingServiceConfiguration}
 */
public class BindingServiceConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'bindingServiceConfiguration'
   */
  public static BeanDefinition getBindingServiceConfigurationBeanDefinition() {
    Class<?> beanType = BindingServiceConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    InstanceSupplier<BindingServiceConfiguration> instanceSupplier = InstanceSupplier.using(BindingServiceConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(BindingServiceConfiguration__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'globalErrorChannelCustomizer'
   */
  public static BeanDefinition getGlobalErrorChannelCustomizerBeanDefinition() {
    Class<?> beanType = BeanPostProcessor.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<BeanPostProcessor>forFactoryMethod(BindingServiceConfiguration.class, "globalErrorChannelCustomizer").withGenerator(BindingServiceConfiguration::globalErrorChannelCustomizer));
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'BindingHandlerAdvise'.
   */
  private static BeanInstanceSupplier<BindingHandlerAdvise> getBindingHandlerAdviseInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<BindingHandlerAdvise>forFactoryMethod(BindingServiceConfiguration.class, "BindingHandlerAdvise", BindingHandlerAdvise.MappingsProvider[].class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(BindingServiceConfiguration.class).BindingHandlerAdvise(args.get(0)));
  }

  /**
   * Get the bean definition for 'bindingHandlerAdvise'
   */
  public static BeanDefinition getBindingHandlerAdviseBeanDefinition() {
    Class<?> beanType = BindingHandlerAdvise.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getBindingHandlerAdviseInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'binderFactory'.
   */
  private static BeanInstanceSupplier<DefaultBinderFactory> getBinderFactoryInstanceSupplier() {
    return BeanInstanceSupplier.<DefaultBinderFactory>forFactoryMethod(BindingServiceConfiguration.class, "binderFactory", BinderTypeRegistry.class, BindingServiceProperties.class, ObjectProvider.class, BinderChildContextInitializer.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(BindingServiceConfiguration.class).binderFactory(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'binderFactory'
   */
  public static BeanDefinition getBinderFactoryBeanDefinition() {
    Class<?> beanType = DefaultBinderFactory.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getBinderFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Use AOT child context initialization
   */
  private static BinderChildContextInitializer binderChildContextInitializerAddChildContextInitializers(
      RegisteredBean registeredBean, BinderChildContextInitializer instance) {
    Map<String, ApplicationContextInitializer<? extends ConfigurableApplicationContext>> initializers = new HashMap<>();
    ApplicationContextInitializer<? extends ConfigurableApplicationContext> ktableInitializer = new com.mehkey.KafkaStreamsTopSellers.TopSalesOverLastWeekTest__KtableBinderApplicationContextInitializer();
    initializers.put("ktable",ktableInitializer);
    ApplicationContextInitializer<? extends ConfigurableApplicationContext> kafkaInitializer = new com.mehkey.KafkaStreamsTopSellers.TopSalesOverLastWeekTest__KafkaBinderApplicationContextInitializer();
    initializers.put("kafka",kafkaInitializer);
    ApplicationContextInitializer<? extends ConfigurableApplicationContext> integrationInitializer = new com.mehkey.KafkaStreamsTopSellers.TopSalesOverLastWeekTest__IntegrationBinderApplicationContextInitializer();
    initializers.put("integration",integrationInitializer);
    ApplicationContextInitializer<? extends ConfigurableApplicationContext> kstreamInitializer = new com.mehkey.KafkaStreamsTopSellers.TopSalesOverLastWeekTest__KstreamBinderApplicationContextInitializer();
    initializers.put("kstream",kstreamInitializer);
    ApplicationContextInitializer<? extends ConfigurableApplicationContext> globalktableInitializer = new com.mehkey.KafkaStreamsTopSellers.TopSalesOverLastWeekTest__GlobalktableBinderApplicationContextInitializer();
    initializers.put("globalktable",globalktableInitializer);
    return instance.withChildContextInitializers(initializers);
  }

  /**
   * Get the bean instance supplier for 'binderChildContextInitializer'.
   */
  private static BeanInstanceSupplier<BinderChildContextInitializer> getBinderChildContextInitializerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<BinderChildContextInitializer>forFactoryMethod(BindingServiceConfiguration.class, "binderChildContextInitializer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(BindingServiceConfiguration.class).binderChildContextInitializer());
  }

  /**
   * Get the bean definition for 'binderChildContextInitializer'
   */
  public static BeanDefinition getBinderChildContextInitializerBeanDefinition() {
    Class<?> beanType = BinderChildContextInitializer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<BinderChildContextInitializer> instanceSupplier = getBinderChildContextInitializerInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(BindingServiceConfiguration__TestContext001_BeanDefinitions::binderChildContextInitializerAddChildContextInitializers);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'bindingService'.
   */
  private static BeanInstanceSupplier<BindingService> getBindingServiceInstanceSupplier() {
    return BeanInstanceSupplier.<BindingService>forFactoryMethod(BindingServiceConfiguration.class, "bindingService", BindingServiceProperties.class, BinderFactory.class, TaskScheduler.class, ObjectMapper.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(BindingServiceConfiguration.class).bindingService(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'bindingService'
   */
  public static BeanDefinition getBindingServiceBeanDefinition() {
    Class<?> beanType = BindingService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getBindingServiceInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'outputBindingLifecycle'.
   */
  private static BeanInstanceSupplier<OutputBindingLifecycle> getOutputBindingLifecycleInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<OutputBindingLifecycle>forFactoryMethod(BindingServiceConfiguration.class, "outputBindingLifecycle", BindingService.class, Map.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(BindingServiceConfiguration.class).outputBindingLifecycle(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'outputBindingLifecycle'
   */
  public static BeanDefinition getOutputBindingLifecycleBeanDefinition() {
    Class<?> beanType = OutputBindingLifecycle.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setDependsOn("bindingService");
    InstanceSupplier<OutputBindingLifecycle> instanceSupplier = getOutputBindingLifecycleInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(OutputBindingLifecycle__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'inputBindingLifecycle'.
   */
  private static BeanInstanceSupplier<InputBindingLifecycle> getInputBindingLifecycleInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<InputBindingLifecycle>forFactoryMethod(BindingServiceConfiguration.class, "inputBindingLifecycle", BindingService.class, Map.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(BindingServiceConfiguration.class).inputBindingLifecycle(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'inputBindingLifecycle'
   */
  public static BeanDefinition getInputBindingLifecycleBeanDefinition() {
    Class<?> beanType = InputBindingLifecycle.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setDependsOn("bindingService");
    InstanceSupplier<InputBindingLifecycle> instanceSupplier = getInputBindingLifecycleInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(InputBindingLifecycle__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'bindingsLifecycleController'.
   */
  private static BeanInstanceSupplier<BindingsLifecycleController> getBindingsLifecycleControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<BindingsLifecycleController>forFactoryMethod(BindingServiceConfiguration.class, "bindingsLifecycleController", List.class, List.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(BindingServiceConfiguration.class).bindingsLifecycleController(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'bindingsLifecycleController'
   */
  public static BeanDefinition getBindingsLifecycleControllerBeanDefinition() {
    Class<?> beanType = BindingsLifecycleController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getBindingsLifecycleControllerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'contextStartAfterRefreshListener'.
   */
  private static BeanInstanceSupplier<ContextStartAfterRefreshListener> getContextStartAfterRefreshListenerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ContextStartAfterRefreshListener>forFactoryMethod(BindingServiceConfiguration.class, "contextStartAfterRefreshListener")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(BindingServiceConfiguration.class).contextStartAfterRefreshListener());
  }

  /**
   * Get the bean definition for 'contextStartAfterRefreshListener'
   */
  public static BeanDefinition getContextStartAfterRefreshListenerBeanDefinition() {
    Class<?> beanType = ContextStartAfterRefreshListener.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setDependsOn("bindingService");
    beanDefinition.setInstanceSupplier(getContextStartAfterRefreshListenerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'dynamicDestinationsBindable'.
   */
  private static BeanInstanceSupplier<DynamicDestinationsBindable> getDynamicDestinationsBindableInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DynamicDestinationsBindable>forFactoryMethod(BindingServiceConfiguration.class, "dynamicDestinationsBindable")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(BindingServiceConfiguration.class).dynamicDestinationsBindable());
  }

  /**
   * Get the bean definition for 'dynamicDestinationsBindable'
   */
  public static BeanDefinition getDynamicDestinationsBindableBeanDefinition() {
    Class<?> beanType = DynamicDestinationsBindable.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getDynamicDestinationsBindableInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'appListener'.
   */
  private static BeanInstanceSupplier<ApplicationListener> getAppListenerInstanceSupplier() {
    return BeanInstanceSupplier.<ApplicationListener>forFactoryMethod(BindingServiceConfiguration.class, "appListener", SpringIntegrationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(BindingServiceConfiguration.class).appListener(args.get(0)));
  }

  /**
   * Get the bean definition for 'appListener'
   */
  public static BeanDefinition getAppListenerBeanDefinition() {
    ResolvableType beanType = ResolvableType.forClassWithGenerics(ApplicationListener.class, ContextRefreshedEvent.class);
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getAppListenerInstanceSupplier());
    return beanDefinition;
  }
}
