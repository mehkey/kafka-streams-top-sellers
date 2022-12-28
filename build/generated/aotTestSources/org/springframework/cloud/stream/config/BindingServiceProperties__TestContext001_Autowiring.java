package org.springframework.cloud.stream.config;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link BindingServiceProperties}.
 */
public class BindingServiceProperties__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static BindingServiceProperties apply(RegisteredBean registeredBean,
      BindingServiceProperties instance) {
    AutowiredFieldValueResolver.forRequiredField("instanceIndex").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
