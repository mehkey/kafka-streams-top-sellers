package org.springframework.cloud.stream.binding;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link InputBindingLifecycle}.
 */
public class InputBindingLifecycle__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static InputBindingLifecycle apply(RegisteredBean registeredBean,
      InputBindingLifecycle instance) {
    AutowiredFieldValueResolver.forRequiredField("context").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
