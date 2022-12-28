package org.springframework.cloud.stream.config;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link BindingServiceConfiguration}.
 */
public class BindingServiceConfiguration__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static BindingServiceConfiguration apply(RegisteredBean registeredBean,
      BindingServiceConfiguration instance) {
    AutowiredFieldValueResolver.forField("binderFactoryListeners").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
