package org.springframework.boot.autoconfigure.web.embedded;

import java.lang.Class;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.env.Environment;

/**
 * Bean definitions for {@link EmbeddedWebServerFactoryCustomizerAutoConfiguration}
 */
public class EmbeddedWebServerFactoryCustomizerAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'embeddedWebServerFactoryCustomizerAutoConfiguration'
   */
  public static BeanDefinition getEmbeddedWebServerFactoryCustomizerAutoConfigurationBeanDefinition(
      ) {
    Class<?> beanType = EmbeddedWebServerFactoryCustomizerAutoConfiguration.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    beanDefinition.setInstanceSupplier(EmbeddedWebServerFactoryCustomizerAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link EmbeddedWebServerFactoryCustomizerAutoConfiguration.TomcatWebServerFactoryCustomizerConfiguration}
   */
  public static class TomcatWebServerFactoryCustomizerConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'tomcatWebServerFactoryCustomizerConfiguration'
     */
    public static BeanDefinition getTomcatWebServerFactoryCustomizerConfigurationBeanDefinition() {
      Class<?> beanType = EmbeddedWebServerFactoryCustomizerAutoConfiguration.TomcatWebServerFactoryCustomizerConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(EmbeddedWebServerFactoryCustomizerAutoConfiguration.TomcatWebServerFactoryCustomizerConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'tomcatWebServerFactoryCustomizer'.
     */
    private static BeanInstanceSupplier<TomcatWebServerFactoryCustomizer> getTomcatWebServerFactoryCustomizerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<TomcatWebServerFactoryCustomizer>forFactoryMethod(EmbeddedWebServerFactoryCustomizerAutoConfiguration.TomcatWebServerFactoryCustomizerConfiguration.class, "tomcatWebServerFactoryCustomizer", Environment.class, ServerProperties.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(EmbeddedWebServerFactoryCustomizerAutoConfiguration.TomcatWebServerFactoryCustomizerConfiguration.class).tomcatWebServerFactoryCustomizer(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'tomcatWebServerFactoryCustomizer'
     */
    public static BeanDefinition getTomcatWebServerFactoryCustomizerBeanDefinition() {
      Class<?> beanType = TomcatWebServerFactoryCustomizer.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getTomcatWebServerFactoryCustomizerInstanceSupplier());
      return beanDefinition;
    }
  }

  /**
   * Bean definitions for {@link EmbeddedWebServerFactoryCustomizerAutoConfiguration.NettyWebServerFactoryCustomizerConfiguration}
   */
  public static class NettyWebServerFactoryCustomizerConfiguration__BeanDefinitions {
    /**
     * Get the bean definition for 'nettyWebServerFactoryCustomizerConfiguration'
     */
    public static BeanDefinition getNettyWebServerFactoryCustomizerConfigurationBeanDefinition() {
      Class<?> beanType = EmbeddedWebServerFactoryCustomizerAutoConfiguration.NettyWebServerFactoryCustomizerConfiguration.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(EmbeddedWebServerFactoryCustomizerAutoConfiguration.NettyWebServerFactoryCustomizerConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'nettyWebServerFactoryCustomizer'.
     */
    private static BeanInstanceSupplier<NettyWebServerFactoryCustomizer> getNettyWebServerFactoryCustomizerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<NettyWebServerFactoryCustomizer>forFactoryMethod(EmbeddedWebServerFactoryCustomizerAutoConfiguration.NettyWebServerFactoryCustomizerConfiguration.class, "nettyWebServerFactoryCustomizer", Environment.class, ServerProperties.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean(EmbeddedWebServerFactoryCustomizerAutoConfiguration.NettyWebServerFactoryCustomizerConfiguration.class).nettyWebServerFactoryCustomizer(args.get(0), args.get(1)));
    }

    /**
     * Get the bean definition for 'nettyWebServerFactoryCustomizer'
     */
    public static BeanDefinition getNettyWebServerFactoryCustomizerBeanDefinition() {
      Class<?> beanType = NettyWebServerFactoryCustomizer.class;
      RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
      beanDefinition.setInstanceSupplier(getNettyWebServerFactoryCustomizerInstanceSupplier());
      return beanDefinition;
    }
  }
}
