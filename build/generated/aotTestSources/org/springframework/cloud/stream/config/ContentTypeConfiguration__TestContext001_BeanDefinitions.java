package org.springframework.cloud.stream.config;

import java.lang.Class;
import java.util.List;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.cloud.function.json.JsonMapper;
import org.springframework.messaging.converter.CompositeMessageConverter;

/**
 * Bean definitions for {@link ContentTypeConfiguration}
 */
public class ContentTypeConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'contentTypeConfiguration'
   */
  public static BeanDefinition getContentTypeConfigurationBeanDefinition() {
    Class<?> beanType = ContentTypeConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(ContentTypeConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'integrationArgumentResolverMessageConverter'.
   */
  private static BeanInstanceSupplier<CompositeMessageConverter> getIntegrationArgumentResolverMessageConverterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CompositeMessageConverter>forFactoryMethod(ContentTypeConfiguration.class, "configurableCompositeMessageConverter", ObjectProvider.class, List.class, JsonMapper.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(ContentTypeConfiguration.class).configurableCompositeMessageConverter(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'integrationArgumentResolverMessageConverter'
   */
  public static BeanDefinition getIntegrationArgumentResolverMessageConverterBeanDefinition() {
    Class<?> beanType = CompositeMessageConverter.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(getIntegrationArgumentResolverMessageConverterInstanceSupplier());
    return beanDefinition;
  }
}
