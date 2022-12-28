package org.springframework.cloud.stream.config;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link BinderFactoryAutoConfiguration}.
 */
public class BinderFactoryAutoConfiguration__IntegrationBinderAutowiring {
  /**
   * Apply the autowiring.
   */
  public static BinderFactoryAutoConfiguration apply(RegisteredBean registeredBean,
      BinderFactoryAutoConfiguration instance) {
    AutowiredFieldValueResolver.forRequiredField("selfContained").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
