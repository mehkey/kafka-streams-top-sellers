package org.springframework.cloud.stream.binder.kafka.streams;

import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.cloud.stream.binder.kafka.streams.properties.KafkaStreamsBinderConfigurationProperties;
import org.springframework.cloud.stream.config.BindingServiceProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.kafka.config.KafkaStreamsConfiguration;
import org.springframework.kafka.streams.KafkaStreamsMicrometerListener;
import org.springframework.messaging.converter.CompositeMessageConverter;

/**
 * Bean definitions for {@link KafkaStreamsBinderSupportAutoConfiguration}
 */
public class KafkaStreamsBinderSupportAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'kafkaStreamsBinderSupportAutoConfiguration'
   */
  public static BeanDefinition getKafkaStreamsBinderSupportAutoConfigurationBeanDefinition() {
    Class<?> beanType = KafkaStreamsBinderSupportAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(KafkaStreamsBinderSupportAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'binderConfigurationProperties'.
   */
  private static BeanInstanceSupplier<KafkaStreamsBinderConfigurationProperties> getBinderConfigurationPropertiesInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KafkaStreamsBinderConfigurationProperties>forFactoryMethod(KafkaStreamsBinderSupportAutoConfiguration.class, "binderConfigurationProperties", KafkaProperties.class, ConfigurableEnvironment.class, BindingServiceProperties.class, ConfigurableApplicationContext.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KafkaStreamsBinderSupportAutoConfiguration.class).binderConfigurationProperties(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'binderConfigurationProperties'
   */
  public static BeanDefinition getBinderConfigurationPropertiesBeanDefinition() {
    Class<?> beanType = KafkaStreamsBinderConfigurationProperties.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getBinderConfigurationPropertiesInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaStreamsConfiguration'.
   */
  private static BeanInstanceSupplier<KafkaStreamsConfiguration> getKafkaStreamsConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KafkaStreamsConfiguration>forFactoryMethod(KafkaStreamsBinderSupportAutoConfiguration.class, "kafkaStreamsConfiguration", KafkaStreamsBinderConfigurationProperties.class, Environment.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KafkaStreamsBinderSupportAutoConfiguration.class).kafkaStreamsConfiguration(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'kafkaStreamsConfiguration'
   */
  public static BeanDefinition getKafkaStreamsConfigurationBeanDefinition() {
    Class<?> beanType = KafkaStreamsConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getKafkaStreamsConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'streamConfigGlobalProperties'.
   */
  private static BeanInstanceSupplier<Map> getStreamConfigGlobalPropertiesInstanceSupplier() {
    return BeanInstanceSupplier.<Map>forFactoryMethod(KafkaStreamsBinderSupportAutoConfiguration.class, "streamConfigGlobalProperties", KafkaStreamsBinderConfigurationProperties.class, KafkaStreamsConfiguration.class, ConfigurableEnvironment.class, SendToDlqAndContinue.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KafkaStreamsBinderSupportAutoConfiguration.class).streamConfigGlobalProperties(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'streamConfigGlobalProperties'
   */
  public static BeanDefinition getStreamConfigGlobalPropertiesBeanDefinition() {
    ResolvableType beanType = ResolvableType.forClassWithGenerics(Map.class, String.class, Object.class);
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getStreamConfigGlobalPropertiesInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'messageConversionDelegate'.
   */
  private static BeanInstanceSupplier<KafkaStreamsMessageConversionDelegate> getMessageConversionDelegateInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KafkaStreamsMessageConversionDelegate>forFactoryMethod(KafkaStreamsBinderSupportAutoConfiguration.class, "messageConversionDelegate", CompositeMessageConverter.class, SendToDlqAndContinue.class, KafkaStreamsBindingInformationCatalogue.class, KafkaStreamsBinderConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KafkaStreamsBinderSupportAutoConfiguration.class).messageConversionDelegate(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'messageConversionDelegate'
   */
  public static BeanDefinition getMessageConversionDelegateBeanDefinition() {
    Class<?> beanType = KafkaStreamsMessageConversionDelegate.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getMessageConversionDelegateInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kStreamBoundElementFactory'.
   */
  private static BeanInstanceSupplier<KStreamBoundElementFactory> getKStreamBoundElementFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KStreamBoundElementFactory>forFactoryMethod(KafkaStreamsBinderSupportAutoConfiguration.class, "kStreamBoundElementFactory", BindingServiceProperties.class, KafkaStreamsBindingInformationCatalogue.class, EncodingDecodingBindAdviceHandler.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KafkaStreamsBinderSupportAutoConfiguration.class).kStreamBoundElementFactory(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'kStreamBoundElementFactory'
   */
  public static BeanDefinition getKStreamBoundElementFactoryBeanDefinition() {
    Class<?> beanType = KStreamBoundElementFactory.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getKStreamBoundElementFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kTableBoundElementFactory'.
   */
  private static BeanInstanceSupplier<KTableBoundElementFactory> getKTableBoundElementFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KTableBoundElementFactory>forFactoryMethod(KafkaStreamsBinderSupportAutoConfiguration.class, "kTableBoundElementFactory", BindingServiceProperties.class, EncodingDecodingBindAdviceHandler.class, KafkaStreamsBindingInformationCatalogue.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KafkaStreamsBinderSupportAutoConfiguration.class).kTableBoundElementFactory(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'kTableBoundElementFactory'
   */
  public static BeanDefinition getKTableBoundElementFactoryBeanDefinition() {
    Class<?> beanType = KTableBoundElementFactory.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getKTableBoundElementFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'globalKTableBoundElementFactory'.
   */
  private static BeanInstanceSupplier<GlobalKTableBoundElementFactory> getGlobalKTableBoundElementFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<GlobalKTableBoundElementFactory>forFactoryMethod(KafkaStreamsBinderSupportAutoConfiguration.class, "globalKTableBoundElementFactory", BindingServiceProperties.class, EncodingDecodingBindAdviceHandler.class, KafkaStreamsBindingInformationCatalogue.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KafkaStreamsBinderSupportAutoConfiguration.class).globalKTableBoundElementFactory(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'globalKTableBoundElementFactory'
   */
  public static BeanDefinition getGlobalKTableBoundElementFactoryBeanDefinition() {
    Class<?> beanType = GlobalKTableBoundElementFactory.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getGlobalKTableBoundElementFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'sendToDlqAndContinue'.
   */
  private static BeanInstanceSupplier<SendToDlqAndContinue> getSendToDlqAndContinueInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SendToDlqAndContinue>forFactoryMethod(KafkaStreamsBinderSupportAutoConfiguration.class, "sendToDlqAndContinue")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(KafkaStreamsBinderSupportAutoConfiguration.class).sendToDlqAndContinue());
  }

  /**
   * Get the bean definition for 'sendToDlqAndContinue'
   */
  public static BeanDefinition getSendToDlqAndContinueBeanDefinition() {
    Class<?> beanType = SendToDlqAndContinue.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getSendToDlqAndContinueInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaStreamsBindingInformationCatalogue'.
   */
  private static BeanInstanceSupplier<KafkaStreamsBindingInformationCatalogue> getKafkaStreamsBindingInformationCatalogueInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KafkaStreamsBindingInformationCatalogue>forFactoryMethod(KafkaStreamsBinderSupportAutoConfiguration.class, "kafkaStreamsBindingInformationCatalogue")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(KafkaStreamsBinderSupportAutoConfiguration.class).kafkaStreamsBindingInformationCatalogue());
  }

  /**
   * Get the bean definition for 'kafkaStreamsBindingInformationCatalogue'
   */
  public static BeanDefinition getKafkaStreamsBindingInformationCatalogueBeanDefinition() {
    Class<?> beanType = KafkaStreamsBindingInformationCatalogue.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getKafkaStreamsBindingInformationCatalogueInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'keyValueSerdeResolver'.
   */
  private static BeanInstanceSupplier<KeyValueSerdeResolver> getKeyValueSerdeResolverInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KeyValueSerdeResolver>forFactoryMethod(KafkaStreamsBinderSupportAutoConfiguration.class, "keyValueSerdeResolver", Object.class, KafkaStreamsBinderConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KafkaStreamsBinderSupportAutoConfiguration.class).keyValueSerdeResolver(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'keyValueSerdeResolver'
   */
  public static BeanDefinition getKeyValueSerdeResolverBeanDefinition() {
    Class<?> beanType = KeyValueSerdeResolver.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getKeyValueSerdeResolverInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'interactiveQueryServices'.
   */
  private static BeanInstanceSupplier<InteractiveQueryService> getInteractiveQueryServicesInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<InteractiveQueryService>forFactoryMethod(KafkaStreamsBinderSupportAutoConfiguration.class, "interactiveQueryServices", KafkaStreamsRegistry.class, KafkaStreamsBinderConfigurationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KafkaStreamsBinderSupportAutoConfiguration.class).interactiveQueryServices(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'interactiveQueryServices'
   */
  public static BeanDefinition getInteractiveQueryServicesBeanDefinition() {
    Class<?> beanType = InteractiveQueryService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getInteractiveQueryServicesInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'kafkaStreamsRegistry'.
   */
  private static BeanInstanceSupplier<KafkaStreamsRegistry> getKafkaStreamsRegistryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<KafkaStreamsRegistry>forFactoryMethod(KafkaStreamsBinderSupportAutoConfiguration.class, "kafkaStreamsRegistry")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(KafkaStreamsBinderSupportAutoConfiguration.class).kafkaStreamsRegistry());
  }

  /**
   * Get the bean definition for 'kafkaStreamsRegistry'
   */
  public static BeanDefinition getKafkaStreamsRegistryBeanDefinition() {
    Class<?> beanType = KafkaStreamsRegistry.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getKafkaStreamsRegistryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'streamsBuilderFactoryManager'.
   */
  private static BeanInstanceSupplier<StreamsBuilderFactoryManager> getStreamsBuilderFactoryManagerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<StreamsBuilderFactoryManager>forFactoryMethod(KafkaStreamsBinderSupportAutoConfiguration.class, "streamsBuilderFactoryManager", KafkaStreamsBindingInformationCatalogue.class, KafkaStreamsRegistry.class, KafkaStreamsBinderMetrics.class, KafkaStreamsMicrometerListener.class, KafkaProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(KafkaStreamsBinderSupportAutoConfiguration.class).streamsBuilderFactoryManager(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4)));
  }

  /**
   * Get the bean definition for 'streamsBuilderFactoryManager'
   */
  public static BeanDefinition getStreamsBuilderFactoryManagerBeanDefinition() {
    Class<?> beanType = StreamsBuilderFactoryManager.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getStreamsBuilderFactoryManagerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'encodingDecodingBindAdviceHandler'.
   */
  private static BeanInstanceSupplier<EncodingDecodingBindAdviceHandler> getEncodingDecodingBindAdviceHandlerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EncodingDecodingBindAdviceHandler>forFactoryMethod(KafkaStreamsBinderSupportAutoConfiguration.class, "encodingDecodingBindAdviceHandler")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean(KafkaStreamsBinderSupportAutoConfiguration.class).encodingDecodingBindAdviceHandler());
  }

  /**
   * Get the bean definition for 'encodingDecodingBindAdviceHandler'
   */
  public static BeanDefinition getEncodingDecodingBindAdviceHandlerBeanDefinition() {
    Class<?> beanType = EncodingDecodingBindAdviceHandler.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getEncodingDecodingBindAdviceHandlerInstanceSupplier());
    return beanDefinition;
  }
}
