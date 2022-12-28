package org.springframework.cloud.stream.binding;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link OutputBindingLifecycle}.
 */
public class OutputBindingLifecycle__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static OutputBindingLifecycle apply(RegisteredBean registeredBean,
      OutputBindingLifecycle instance) {
    AutowiredFieldValueResolver.forRequiredField("context").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
