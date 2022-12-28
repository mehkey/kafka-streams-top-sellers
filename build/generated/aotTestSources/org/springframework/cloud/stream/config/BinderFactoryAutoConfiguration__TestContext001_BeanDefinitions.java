package org.springframework.cloud.stream.config;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cloud.stream.binder.BinderTypeRegistry;
import org.springframework.cloud.stream.binding.CompositeMessageChannelConfigurer;
import org.springframework.cloud.stream.binding.FluxMessageChannelBindingTargetFactory;
import org.springframework.cloud.stream.binding.MessageConverterConfigurer;
import org.springframework.cloud.stream.binding.MessageSourceBindingTargetFactory;
import org.springframework.cloud.stream.binding.SubscribableChannelBindingTargetFactory;
import org.springframework.cloud.stream.binding.SubscribableChannelBindingTargetFactory__TestContext001_Autowiring;
import org.springframework.cloud.stream.function.StreamFunctionProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.messaging.converter.CompositeMessageConverter;
import org.springframework.messaging.handler.annotation.support.MessageHandlerMethodFactory;
import org.springframework.validation.Validator;

/**
 * Bean definitions for {@link BinderFactoryAutoConfiguration}
 */
public class BinderFactoryAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'binderFactoryAutoConfiguration'
   */
  public static BeanDefinition getBinderFactoryAutoConfigurationBeanDefinition() {
    Class<?> beanType = BinderFactoryAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    InstanceSupplier<BinderFactoryAutoConfiguration> instanceSupplier = InstanceSupplier.using(BinderFactoryAutoConfiguration::new);
    instanceSupplier = instanceSupplier.andThen(BinderFactoryAutoConfiguration__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'integrationMessageHandlerMethodFactory'.
   */
  private static BeanInstanceSupplier<MessageHandlerMethodFactory> getIntegrationMessageHandlerMethodFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MessageHandlerMethodFactory>forFactoryMethod(BinderFactoryAutoConfiguration.class, "messageHandlerMethodFactory", CompositeMessageConverter.class, Validator.class, ConfigurableListableBeanFactory.class)
            .withGenerator((registeredBean, args) -> BinderFactoryAutoConfiguration.messageHandlerMethodFactory(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'integrationMessageHandlerMethodFactory'
   */
  public static BeanDefinition getIntegrationMessageHandlerMethodFactoryBeanDefinition() {
    Class<?> beanType = MessageHandlerMethodFactory.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getIntegrationMessageHandlerMethodFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'binderTypeRegistry'.
   */
  private static BeanInstanceSupplier<BinderTypeRegistry> getBinderTypeRegistryInstanceSupplier() {
    return BeanInstanceSupplier.<BinderTypeRegistry>forFactoryMethod(BinderFactoryAutoConfiguration.class, "binderTypeRegistry", ConfigurableApplicationContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(BinderFactoryAutoConfiguration.class).binderTypeRegistry(args.get(0)));
  }

  /**
   * Get the bean definition for 'binderTypeRegistry'
   */
  public static BeanDefinition getBinderTypeRegistryBeanDefinition() {
    Class<?> beanType = BinderTypeRegistry.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getBinderTypeRegistryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'messageConverterConfigurer'.
   */
  private static BeanInstanceSupplier<MessageConverterConfigurer> getMessageConverterConfigurerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MessageConverterConfigurer>forFactoryMethod(BinderFactoryAutoConfiguration.class, "messageConverterConfigurer", BindingServiceProperties.class, CompositeMessageConverter.class, StreamFunctionProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(BinderFactoryAutoConfiguration.class).messageConverterConfigurer(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'messageConverterConfigurer'
   */
  public static BeanDefinition getMessageConverterConfigurerBeanDefinition() {
    Class<?> beanType = MessageConverterConfigurer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getMessageConverterConfigurerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'channelFactory'.
   */
  private static BeanInstanceSupplier<SubscribableChannelBindingTargetFactory> getChannelFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SubscribableChannelBindingTargetFactory>forFactoryMethod(BinderFactoryAutoConfiguration.class, "channelFactory", CompositeMessageChannelConfigurer.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(BinderFactoryAutoConfiguration.class).channelFactory(args.get(0)));
  }

  /**
   * Get the bean definition for 'channelFactory'
   */
  public static BeanDefinition getChannelFactoryBeanDefinition() {
    Class<?> beanType = SubscribableChannelBindingTargetFactory.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<SubscribableChannelBindingTargetFactory> instanceSupplier = getChannelFactoryInstanceSupplier();
    instanceSupplier = instanceSupplier.andThen(SubscribableChannelBindingTargetFactory__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'fluxMessageChannelBindingTargetFactory'.
   */
  private static BeanInstanceSupplier<FluxMessageChannelBindingTargetFactory> getFluxMessageChannelBindingTargetFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<FluxMessageChannelBindingTargetFactory>forFactoryMethod(BinderFactoryAutoConfiguration.class, "fluxMessageChannelBindingTargetFactory", CompositeMessageChannelConfigurer.class, GenericApplicationContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(BinderFactoryAutoConfiguration.class).fluxMessageChannelBindingTargetFactory(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'fluxMessageChannelBindingTargetFactory'
   */
  public static BeanDefinition getFluxMessageChannelBindingTargetFactoryBeanDefinition() {
    Class<?> beanType = FluxMessageChannelBindingTargetFactory.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getFluxMessageChannelBindingTargetFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'messageSourceFactory'.
   */
  private static BeanInstanceSupplier<MessageSourceBindingTargetFactory> getMessageSourceFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MessageSourceBindingTargetFactory>forFactoryMethod(BinderFactoryAutoConfiguration.class, "messageSourceFactory", CompositeMessageConverter.class, CompositeMessageChannelConfigurer.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(BinderFactoryAutoConfiguration.class).messageSourceFactory(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'messageSourceFactory'
   */
  public static BeanDefinition getMessageSourceFactoryBeanDefinition() {
    Class<?> beanType = MessageSourceBindingTargetFactory.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getMessageSourceFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'compositeMessageChannelConfigurer'.
   */
  private static BeanInstanceSupplier<CompositeMessageChannelConfigurer> getCompositeMessageChannelConfigurerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CompositeMessageChannelConfigurer>forFactoryMethod(BinderFactoryAutoConfiguration.class, "compositeMessageChannelConfigurer", MessageConverterConfigurer.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(BinderFactoryAutoConfiguration.class).compositeMessageChannelConfigurer(args.get(0)));
  }

  /**
   * Get the bean definition for 'compositeMessageChannelConfigurer'
   */
  public static BeanDefinition getCompositeMessageChannelConfigurerBeanDefinition() {
    Class<?> beanType = CompositeMessageChannelConfigurer.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getCompositeMessageChannelConfigurerInstanceSupplier());
    return beanDefinition;
  }
}
